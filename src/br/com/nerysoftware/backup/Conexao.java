/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.nerysoftware.backup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nerysoftware
 */
public class Conexao {

    static Connection con=null;

 public static Connection conectar(){
    try {

        con = DriverManager.getConnection("jdbc:mysql://localhost/pontovenda","root","");
    }
    catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return con;
    }

}
