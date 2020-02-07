/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesGenerales;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import org.glassfish.jersey.internal.util.Base64;

/**
 * @author Michael Jared Diaz
 */
public class Dao {

    /**
     * @return the tipo_printer
     */
    public String getTipo_printer() {
        return tipo_printer;
    }

    /**
     * @param tipo_printer the tipo_printer to set
     */
    public void setTipo_printer(String tipo_printer) {
        this.tipo_printer = tipo_printer;
    }

    /**
     * @return the tipo_papel
     */
    public String getTipo_papel() {
        return tipo_papel;
    }

    /**
     * @param tipo_papel the tipo_papel to set
     */
    public void setTipo_papel(String tipo_papel) {
        this.tipo_papel = tipo_papel;
    }

    
      /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the printe
     */
    public String getPrinte() {
        return printe;
    }

    /**
     * @param printe the printe to set
     */
    public void setPrinte(String printe) {
        this.printe = printe;
    }

    /**
     * @return the idprinter
     */
    public String getIdprinter() {
        return idprinter;
    }

    /**
     * @param idprinter the idprinter to set
     */
    public void setIdprinter(String idprinter) {
        this.idprinter = idprinter;
    }
    // TIPO: 1 - Matricial    2 - Termico
    //  MARCA 1 - Epson    2 - Start

    static Connection conexion = null;
    Funciones funciones = new Funciones();
    
    
    private String url="";
    private String printe= "";
    private String idprinter ="";
    private String empresa = "";
    private String tipo_printer = "";
    private String tipo_papel = "";
    private String url_rnc = "";
    Statement select;

    public Dao() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        if (conexion == null) {
            conexion = DriverManager.getConnection("jdbc:sqlite:db.db");
            
        }
        setConfiguracion();
        
    }
    public  void  setConfiguracion() throws SQLException
    {
        String sql = "select * from t_configuracion";
        ResultSet rs ;
        select = conexion.createStatement();
        rs = select.executeQuery(sql);
        if (rs.next()) {
            setIdprinter(rs.getString("f_idprinter"));
            setUrl(rs.getString("f_url"));
            setPrinte(rs.getString("f_printer"));
            setEmpresa(rs.getString("f_empresa"));
            setTipo_printer(rs.getString("f_tipo_printer"));
            setTipo_papel(rs.getString("f_tipo_papel"));
            setTipo_papel(rs.getString("f_tipo_papel"));
            setUrl_rnc(rs.getString("f_url_rnc"));
        }
        select.close();
    }

   /* public void actualizar(String url, String nombre, int marca, int tipo, int caja, String puerto, int impresion, int peso, int libra, int scaleScanner) throws SQLException {
        String sql = "UPDATE t_preferencia SET f_url='" + url + "', f_nombre_printer='" + nombre + "', f_marca_printer=" + marca + ", f_tipo_impresion=" + tipo + ", f_caja = " + caja
                + ", f_puerto_serial='" + puerto + "', f_impresion=" + impresion + ",f_libra= " + libra
                + ", f_peso =" + peso + ", f_scale_scanner = " + scaleScanner;
        Statement update = conexion.createStatement();
        update.executeUpdate(sql);
        funciones.mensaje("Datos actualizados correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        update.close();
    }*/
    
    public  void actualizar_configuracion(String empresa,String idprinter,String printer,String url,String tipo_printer,String tipo_papel,String url_rnc) throws SQLException 
    {
        
             String sql = "UPDATE\n" +
                    "  t_configuracion\n" +
                    "SET\n" +
                    "  f_url = '"+url+"',\n" +
                    "  f_idprinter = '"+idprinter+"',\n" +
                    "  f_printer = '"+printer+"',\n" +
                    "  f_tipo_printer = "+tipo_printer+",\n" +
                    "  f_url_rnc = '"+url_rnc+"',\n" +
                    "  f_tipo_papel = "+tipo_papel+",\n" +
                    "  f_empresa = '"+empresa+"' ;\n" ;   
            
           EjecutarQuery(sql);
        
    }
    
    public void EjecutarQuery(String sql) throws SQLException
    {
        ResultSet rs ;
        select = conexion.createStatement();
        select.executeUpdate(sql);
        select.close();
    }
     public ResultSet getQuery(String sql) throws SQLException
    {
        ResultSet rs ;
        select = conexion.createStatement();
        rs = select.executeQuery(sql);
        return rs;
    }
     public void  closeStatement() throws SQLException
     {
         select.close();
     }

    /**
     * @return the url_rnc
     */
    public String getUrl_rnc() {
        return url_rnc;
    }

    /**
     * @param url_rnc the url_rnc to set
     */
    public void setUrl_rnc(String url_rnc) {
        this.url_rnc = url_rnc;
    }
    
    

  

}
