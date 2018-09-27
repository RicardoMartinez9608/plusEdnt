/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConexionSql;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class ConexionDB {
 private String login = "tps";
  private String password = "tps1234";
  private String url = "jdbc:oracle:thin:@localhost:1521:XE";
  private Connection conn = null;
//___________________________________________________________________________________ Soy una barra separadora ??
  //Constructor de la clase que se conecta a la base de datos una vez que se crea la instancia
  public ConexionDB(){
      try{         
         Class.forName("oracle.jdbc.driver.OracleDriver");         
         conn = DriverManager.getConnection(url,login,password);         
      }catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }
    }
   public String procedurePaciente(String nombre, String apellido, String direccion, String tel, 
           Integer edad, String fecha, Integer tipo)
   {
       String resultado=null;
       try {            
           
            CallableStatement proc = conn.prepareCall("{CALL INGRESARPAC(?,?,?,?,?,?,?,?)}");
            proc.setString("pNombre",nombre );
            proc.setString("pApellido",apellido );
            proc.setString("pDireccion",direccion );
            proc.setString("pTelefono",tel );
          
            proc.setInt("pEdad",edad );
            proc.setString("pFechaRegistro",fecha);
            proc.setInt("pIdTipoP",tipo );
            proc.registerOutParameter("pMjs", java.sql.Types.VARCHAR);
            proc.executeQuery();            
            
            resultado = proc.getString("pMjs");
        } 
       catch (Exception e) {                  
            JOptionPane.showMessageDialog(null, e);
       }
       return resultado;
   }
  
    }
