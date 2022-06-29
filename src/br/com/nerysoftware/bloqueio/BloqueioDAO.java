/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.nerysoftware.bloqueio;

import br.com.nerysoftware.connection.ConnectionDB;
import br.com.nerysoftware.model.bean.cabecalho_bean;
import br.com.nerysoftware.view.Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nerysoftware
 */
public class BloqueioDAO {
    
       public List<BloqueioBean> read() {
            
            Connection con = ConnectionDB.getConnection();
            
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<BloqueioBean> listar = new ArrayList<>();
        
        try {
  
            stmt = con.prepareStatement("SELECT * FROM bloqueio_sistema");
            rs = stmt.executeQuery();
            
            while (rs.next()) {

                BloqueioBean listaCabecalho = new BloqueioBean();

                listaCabecalho.setId(rs.getInt("id"));
                listaCabecalho.setStatus(rs.getString("status"));

                listar.add(listaCabecalho);
                
            
            }     
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);  
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return listar;
    
    }
    
    
}
