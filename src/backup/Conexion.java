/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DFHS
 */
public class Conexion {
   Connection connect;
    Statement st;
    String estado = "";
    public static boolean conexion;
    private Connection conectar(String host, String puerto, String SID, 
                               String usuario, String contBD){
        connect=null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String BaseDeDatos = "jdbc:oracle:thin:@"+
                    host+":"+puerto+":"+SID;
            connect=DriverManager.getConnection(BaseDeDatos, usuario,contBD);
            estado = "Conexión correcta";
            conexion = true;        
        } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error "+ex.getMessage());
            estado = "Conexión incorrecta";
            conexion = false;
        }
        return connect;
    } 
    
    Statement CreateStatement()
    {
        throw new UnsupportedOperationException("No soportado");
    }
    
    
    public boolean probarConexion(){
        
        conectar(metadatos.Metadatos.getHost(), metadatos.Metadatos.getPuerto(),
                metadatos.Metadatos.getSID(), metadatos.Metadatos.getUsuario(), 
                metadatos.Metadatos.getClaveBD());
        if (conexion) {
            JOptionPane.showMessageDialog(null, estado, "SQL", 
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        /*estado=estado+" al usuario ";
        conectar(metadatos.Metadatos.getHost(), metadatos.Metadatos.getPuerto(),
                metadatos.Metadatos.getSID(), "system", 
                metadatos.Metadatos.getClaveSystem());*/
        estado="\n"+estado;
        
        return conexion;
    }
    public boolean probarConexion1(){
        
        conectar(metadatos.Metadatos.getHost(), metadatos.Metadatos.getPuerto(),
                metadatos.Metadatos.getSID(), metadatos.Metadatos.getUsuario(), 
                metadatos.Metadatos.getClaveBD());
        estado=estado+" al usuario ";
        conectar(metadatos.Metadatos.getHost(), metadatos.Metadatos.getPuerto(),
                metadatos.Metadatos.getSID(), "system", 
                metadatos.Metadatos.getClaveSystem());
        estado="\n"+estado;
       
        return conexion;
    }
    
    public Connection conexionUsuario(){
     return conectar(metadatos.Metadatos.getHost(), metadatos.Metadatos.getPuerto(),
                metadatos.Metadatos.getSID(), metadatos.Metadatos.getUsuario(), 
                metadatos.Metadatos.getClaveBD());
    }
    
    public Connection conexionSistema(){
        
      return conectar(metadatos.Metadatos.getHost(), 
              metadatos.Metadatos.getPuerto(),
              metadatos.Metadatos.getSID(),"system",
              metadatos.Metadatos.getClaveSystem());
    }
}
