/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nerysoftware.produtos;

import br.com.nerysoftware.connection.ConnectionDB;
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
public class TipoDAO {
    
    public void create(TipoBEAN t){
     Connection con = ConnectionDB.getConnection();
            PreparedStatement stmt = null; 
        try {
        stmt = con.prepareStatement("INSERT INTO tipo_produto(nome) VALUES (?)");
            stmt.setString(1,t.getNome());
           
          
            
              stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");  
        
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);  
            Logger.getLogger(TipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionDB.closeConnection(con, stmt);
        
 }
    
}
    
    public List<TipoBEAN> read() {
            
            Connection con = ConnectionDB.getConnection();
            
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<TipoBEAN> tipos = new ArrayList<>();
        
        try {
            
            
            stmt = con.prepareStatement("SELECT * FROM tipo_produto");
            rs = stmt.executeQuery();
            
            while (rs.next()) {

                TipoBEAN tipo = new TipoBEAN();

                tipo.setId(rs.getInt("id"));              
                tipo.setNome(rs.getString("nome"));
                
                tipos.add(tipo);
                
            
            }     
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);  
            Logger.getLogger(TipoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return tipos;
    
    } 
    
}
