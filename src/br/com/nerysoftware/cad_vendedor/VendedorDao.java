/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nerysoftware.cad_vendedor;

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
import br.com.nerysoftware.os.Pedido;
import br.com.nerysoftware.os.salva_pedido;


/**
 *
 * @author nerysoftware
 */
public class VendedorDao {
    
      public void create(VendedorBean c){
     Connection con = ConnectionDB.getConnection();
            PreparedStatement stmt = null; 
        try {
        stmt = con.prepareStatement("INSERT INTO vendedor(nome,comissao) VALUES (?,?)");
            stmt.setString(1,c.getNome());
            stmt.setString(2,c.getComissao());
            
          
            
              stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");  
        
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);  
            Logger.getLogger(VendedorDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionDB.closeConnection(con, stmt);
        
 }
    
    
}
      
      
      public List<VendedorBean> read() {
            
            Connection con = ConnectionDB.getConnection();
            
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<VendedorBean> vendedor = new ArrayList<>();
        
        try {
            
            
            stmt = con.prepareStatement("SELECT * FROM vendedor");
            rs = stmt.executeQuery();
            
            while (rs.next()) {

                VendedorBean vender = new VendedorBean();

                vender.setId(rs.getInt("id"));              
                vender.setNome(rs.getString("nome"));
                vender.setComissao(rs.getString("comissao"));
                
                vendedor.add(vender);
                
            
            }     
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);  
            Logger.getLogger(VendedorDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }
          return vendedor;
      
      
      
}
      
}



