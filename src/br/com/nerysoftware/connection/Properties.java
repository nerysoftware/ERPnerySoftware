/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.nerysoftware.connection;

/**
 *
 * @author agn_a
 */
public class Properties {
    
        public static final String PROPERTIES_PATH = "/properties/db_config";
	public static final String DRIVER_PROPERTIE = "connect.driver";
	public static final String URL_PROPERTIE = "connect.url";
	public static final String USER_PROPERTIE = "connect.user";
        public static final String PASS_PROPERTIE = "connect.pass";

  
        private static String usuario = "root";

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
