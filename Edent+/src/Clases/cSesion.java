
package Clases;

import java.sql.CallableStatement;
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
}