package Dao;

import BD.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import produto.Produto;

public class ProdutoDao {

    private Conexao con = new Conexao();

    public ProdutoDao() {
    }

    public void cadastrar(Produto p) throws SQLException {

        try {
            Connection c = con.conectar();

            PreparedStatement ps = c.prepareStatement("insert into dados_produtos(codigo,produto,valor,estoque,descricao) values(?,?,?,?,?)");
            //float valor = Float.parseFloat(this.valor.getText());
            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getProduto());
            ps.setFloat(3, p.getValor());
            ps.setBoolean(4, p.isEstoque());
            ps.setString(5, p.getDescricao());
            ps.execute();
            ps.close();
            con.desconectar();
        } catch (SQLException e) {
            System.err.println("Erro ao Cadastrar o Produto: " + e.getMessage());
            con.desconectar();
            throw e;
        }
    }

    public boolean atualizar(Produto p) throws SQLException {

        try {
            Connection c = con.conectar();
            String sql = "UPDATE dados_produtos SET produto=?, valor=?, estoque=?, descricao=? WHERE codigo=?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getProduto());
            ps.setFloat(3, p.getValor());
            ps.setBoolean(4, p.isEstoque());
            ps.setString(5, p.getDescricao());
            ps.execute();
            ps.close();
            con.desconectar();
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao Atualizar Produto...");
            System.err.println(e.getMessage());
            throw e;
        } catch (NumberFormatException e) {

        }
        return false;
    }

    public void excluir(Produto p) {
        try {
            Connection c = con.conectar();
            PreparedStatement ps = c.prepareStatement("DELETE FROM dados_produtos WHERE codigo=?");
            ps.setString(1, p.getCodigo()); 
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso...");
            con.desconectar();
        } catch (SQLException e) {
            System.err.println("Erro ao deletar produto");
            System.err.println(e.getMessage());
        } finally {
            con.desconectar();
        }
    }


    public ArrayList<Produto> pesquisar(Produto p) {

        ArrayList<Produto> produtos = new ArrayList<>();
        boolean c1 = false;
        String sql ;

        if (p == null) {
            sql = "SELECT * FROM dados_produtos ORDER BY valor";
        } else {
            if (p.getProduto() == null) {
                p.setProduto("");
            }
            if (p.getCodigo() == null) {
                p.setCodigo("");
            }

            if (p.getCodigo().isEmpty()&& p.getProduto().isEmpty()) {
                sql = "SELECT * FROM dados_produtos ORDER BY valor";
                System.out.println(p.getCodigo() );
                System.out.println(p.getProduto());
            } else {
                sql = "SELECT * FROM dados_produtos WHERE ";

                if (!p.getCodigo().isEmpty()) {
                     System.out.println(p.getCodigo()) ;
                    sql += "codigo LIKE '%" + p.getCodigo() + "%'";
                    c1 = true;
                }

                if (!p.getProduto().isEmpty()) {
                    if (c1 == true) {
                        sql += " OR ";
                    }
                    sql += "produto LIKE '%" + p.getProduto()+ "%'";
                }
            }
        }

        System.out.println(sql);

        try {
            Connection c = con.conectar();
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigo(rs.getString("codigo"));
                produto.setProduto(rs.getString("produto"));
                produto.setValor(Float.parseFloat(rs.getString("valor")));
                produto.setDescricao(rs.getString("descricao"));
                produto.setEstoque(rs.getBoolean("estoque"));
                produtos.add(produto);
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("ocorreu um erro ao conectar");
        } finally {
            con.desconectar();
        }
        return produtos;
    }
}
