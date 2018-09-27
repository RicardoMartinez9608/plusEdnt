/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConexionSql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class ConexionDB {
  boolean BanderaConeccion = false;
  Connection link = null; 
    public Connection getConneccion(){
     try {
          
            Class.forName("oracle.jdbc.driver.OracleDriver");  //DRIVER DE SQL DEVELOPER
            String myDB = "jdbc:oracle:thin:@localhost:1521:xe ";//URL DE SQL DEVELOPER
            String usuario="tps";
            String password="tps1234";
            link = DriverManager.getConnection(myDB,usuario,password);
            return link;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }  
    
    public void closeBD()
    {
        if (BanderaConeccion)
        {
            try
            {
                link.close();
                BanderaConeccion = false;
            }
            catch (Exception ex)
            {
                 JOptionPane.showMessageDialog(null,"Error al cerrar la conexion." + ex);
            }
        }
    }
   
    }
