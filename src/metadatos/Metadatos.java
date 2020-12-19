/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metadatos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author DFHS
 */
public class Metadatos {

    // <editor-fold defaultstate="collapsed" desc="Variables">
    private static String host;
    private static String usuario;
    private static String puerto;
    private static String SID;
    private static String claveBD;
    private static String claveSystem;
    private static String nombreCon;
    private static String log;
    private static String Objetos;
    private static final List<String> conexiones = new ArrayList<>();
    private static DefaultTreeModel modeloArbol;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Propiedades">
    /**
     * @return the Objetos
     */
    public static String getObjetos() {
        return Objetos;
    }

    /**
     * @param aObjetos the Objetos to set
     */
    public static void setObjetos(String aObjetos) {
        Objetos = aObjetos;
    }
    
    /**
     * @return the modeloArbol
     */
    public static DefaultTreeModel getModeloArbol() {
        return modeloArbol;
    }

    /**
     * @param aModeloArbol the modeloArbol to set
     */
    public static void setModeloArbol(DefaultTreeModel aModeloArbol) {
        modeloArbol = aModeloArbol;
    }
      
    
    /**
     * @return the host
     */
    public static String getHost() {
        return host;
    }

    /**
     * @param aHost the host to set
     */
    public static void setHost(String aHost) {
        host = aHost;
    }

    /**
     * @return the usuario
     */
    public static String getUsuario() {
        return usuario;
    }

    /**
     * @param aUsuario the usuario to set
     */
    public static void setUsuario(String aUsuario) {
        usuario = aUsuario;
    }
    
    /**
     * @return the claveBD
     */
    public static String getClaveBD() {
        return claveBD;
    }

    /**
     * @param aClaveBD the claveBD to set
     */
    public static void setClaveBD(String aClaveBD) {
        claveBD = aClaveBD;
    }

    /**
     * @return the puerto
     */
    public static String getPuerto() {
        return puerto;
    }

    /**
     * @param aPuerto the puerto to set
     */
    public static void setPuerto(String aPuerto) {
        puerto = aPuerto;
    }
    
    /**
     * @return the SID
     */
    public static String getSID() {
        return SID;
    }

    /**
     * @param aSID the SID to set
     */
    public static void setSID(String aSID) {
        SID = aSID;
    }

    

    /**
     * @return the claveSystem
     */
    public static String getClaveSystem() {
        return "alex";
    }

    /**
     * @param aClaveSystem the claveSystem to set
     */
    public static void setClaveSystem(String aClaveSystem) {
        claveSystem = aClaveSystem;
    }

    /**
     * @return the nombreCon
     */
    public static String getNombreCon() {
        return nombreCon;
    }
    

    /**
     * @param aNombreCon the nombreCon to set
     */
    public static void setNombreCon(String aNombreCon) {
        nombreCon = aNombreCon;
    }

    /**
     * @return the conexiones
     */
    public static List<String> getConexiones() {
        return conexiones;
    }

    /**
     * @param aConexiones the conexiones to set
     */
    public static void setConexiones(String aConexiones) {
        conexiones.add(aConexiones);
    }
    
    public static void clearConexiones() {
        conexiones.clear();
    }
    
    /**
     * @return the log
     */
    public static String getLog() {
        return log;
    }

    /**
     * @param aLog the log to set
     */
    public static void setLog(String aLog) {
        log = aLog;
    }
        // </editor-fold>

}
