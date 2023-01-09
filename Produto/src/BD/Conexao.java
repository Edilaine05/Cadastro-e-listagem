/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {

    public static String porta = "3306";
    public static String nomeServidor = "localhost";
    public static String bd = "db_produtos";
    public static String user = "root";
    public static String pass = "0000";
    static Connection conn = null;

    public static Connection conectar() {
        try {
            String rota = "jdbc:mysql://";
            String servidor = nomeServidor + ":" + porta + "/";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(rota + servidor + bd, user, pass);
            if (conn != null) {
                System.out.println("Conexão ao DB ... Pronta!!!");
            } else if (conn == null) {
                throw new SQLException();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Seu Produto está errado 1. erro:  " + e.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Seu Produto está errado 2. erro:  " + e.getMessage());
        } finally {
            return conn;
        }
    }

    public void desconectar() {
        conn = null;
        System.out.println("Desconectado ... Pronto!!!");
    }
}
