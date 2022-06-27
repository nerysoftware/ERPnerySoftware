/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nerysoftware.financeiro;

import br.com.nerysoftware.vendas.Vendas;
import br.com.nerysoftware.connection.ConnectionDB;
import static br.com.nerysoftware.financeiro.ContasReceber.TabelaTitulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.com.nerysoftware.os.OrdenCarregamento;
import br.com.nerysoftware.os.Pedido;
import br.com.nerysoftware.principal.GerarNumero;

/**
 *
 * @author hugov
 */
public class FinanceiroSql {
    static ConnectionDB con= new ConnectionDB();
    static Connection cn = ConnectionDB.getConnection();
    static PreparedStatement ps;
    
    
    public static int registrar(Vendas uc) {
        int rsu = 0;
        String sql = Vendas.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getPrimaryKey());          
            ps.setString(2, uc.getItens());
            ps.setString(3, uc.getTotal());
            ps.setString(4, uc.getData());
            ps.setString(5, uc.getCliente());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminar(String id) {
        int rsu = 0;
        String sql = Vendas.ELIMINAR;

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminaTodos() {
        int rsu = 0;
        String sql = Vendas.ELIMINAR_TUDO;
        try {
            ps = cn.prepareStatement(sql);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) br.com.nerysoftware.financeiro.ContasReceber.TabelaTitulo.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = Vendas.LISTAR;
        } else {
            sql = "SELECT * FROM vendas WHERE (cliente_vend like'" + busca + "%' or data_ven='" + busca + "')"
                    + " ORDER BY data_ven";
        }
        String dados[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                dados[0] = rs.getString("cliente_vend");
                dados[1] = rs.getString("numero_ven");
                dados[2] = rs.getString("data_ven");
                dados[3] = rs.getString("situacao");
                dados[3] = rs.getString("total_ven");
                modelo.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FinanceiroSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void numeros() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "SELECT MAX(numero_ven) FROM vendas";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                br.com.nerysoftware.vendas.FrmCaixa.numFac.setText("00000001");
            } else {
                j = Integer.parseInt(c);
                GerarNumero gen = new GerarNumero();
                gen.gerar(j);
                br.com.nerysoftware.vendas.FrmCaixa.numFac.setText(gen.serie());

            }

        } catch (SQLException ex) {
            Logger.getLogger(FinanceiroSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void numeros1() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "SELECT MAX(numero_venda) FROM vendas";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                br.com.nerysoftware.vendas.FrmCaixa.numFac.setText("00000001");
            } else {
                j = Integer.parseInt(c);
                GerarNumero gen = new GerarNumero();
                gen.gerar(j);
                br.com.nerysoftware.vendas.FrmCaixa.numFac.setText(gen.serie());

            }

        } catch (SQLException ex) {
            Logger.getLogger(FinanceiroSql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Financeiro> readForDesc(String desc) {
            
            Connection con = ConnectionDB.getConnection();
            
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<Financeiro> carga = new ArrayList<>();
        
        try {
            
            
            stmt = con.prepareStatement("SELECT * FROM vendas WHERE numero_ven AND cliente_vend LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {

               Financeiro cargas = new Financeiro();

                cargas.setPrimaryKey(rs.getString("numero_ven"));
                cargas.setCliente(rs.getString("cliente_vend"));
                cargas.setData(rs.getString("data_ven"));
                cargas.setSituacao(rs.getString("situacao"));
                cargas.setTotal(rs.getString("total_ven"));
                
                
                carga.add(cargas);
                
            
            }     
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);  
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return carga;
    
    }
}
