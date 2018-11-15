
package Clases;

import java.sql.CallableStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

public class cSesion extends ConexionDB {
//    ConexionDB bd= new ConexionDB();
    //funcion para registrar el usuario por primera vez
    public String procedureRegistarLogin(String Nombre, String Apellido, String Usuario,
            String Contrasenia, String Correo, String TipoUsser)
    {
        String resultado=null;
        try {
                CallableStatement proc = ConexionDB().prepareCall("{CALL InUsuario(?,?,?,?,?,?,?)}");
                proc.setString("pNombre",Nombre );
                proc.setString("pApellido",Apellido );
                proc.setString("pUsuario",Usuario );
                proc.setString("pContra",Contrasenia);
                proc.setString("pCorreo",Correo );
                proc.setString("pTipoU",TipoUsser );
                proc.registerOutParameter("pmsj", java.sql.Types.VARCHAR);
                proc.executeQuery();           

                resultado = proc.getString("pmsj");
            }
           catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
           }
           return resultado;
        }
        //funcion para iniciar secion
        public Integer procedureLogin(String usuario, String Contrasenia)
        {
            Integer resultado=0;
            try {
                CallableStatement proc = ConexionDB().prepareCall("{CALL LogIn(?,?,?)}");                
                proc.setString("pUsser",usuario );
                proc.setString("pContra",Contrasenia);
                proc.registerOutParameter("pmsj", java.sql.Types.INTEGER);
                proc.executeQuery();            

                resultado = proc.getInt("pmsj");
            } 
            catch (Exception e) {                  
                JOptionPane.showMessageDialog(null, e);
            }
            return resultado;
        }
        //funcion para verificar si existen usuarios en la DB
        public Integer ContarUsuarios()
        {
            Integer resultado=null;
            try {
                CallableStatement proc = ConexionDB().prepareCall("{CALL VerificarUssers(?)}");
                proc.registerOutParameter("pmsj", java.sql.Types.INTEGER);
                proc.executeQuery();            

                resultado = proc.getInt("pmsj");
                
            return resultado;
            } 
            catch (Exception e) {                  
                JOptionPane.showMessageDialog(null, e);                
            return resultado;
            }
        }
//        public ArrayList<String> DatosUsser(String user)
//        {
//            String nombre="";
//            String ape="";
//            String acce="";
//            ArrayList<String> datos = new ArrayList<String>();
//            datos.clear();
//            try {
//                CallableStatement proc = ConexionDB().prepareCall("{CALL DatosUsser(?,?,?,?)}");
//                proc.setString("pUsser",user );
//                proc.registerOutParameter("pNombre", java.sql.Types.VARCHAR);
//                proc.registerOutParameter("pApellido", java.sql.Types.VARCHAR);                
//                proc.registerOutParameter("pAcceso", java.sql.Types.VARCHAR);
//                proc.executeQuery();            
//
//                nombre = proc.getString("pNombre");
//                ape=proc.getString("pApellido");
//                acce=proc.getString("pAcceso");
//                datos.add(nombre);
//                datos.add(ape);
//                datos.add(acce);
//                
//            return datos;
//            } 
//            catch (Exception e) {                  
//                JOptionPane.showMessageDialog(null, e);                
//            return datos;
//            }
//        }
}