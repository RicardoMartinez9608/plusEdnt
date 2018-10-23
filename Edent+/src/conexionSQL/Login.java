
package conexionSQL;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;

public class Login {
    
        ConexionDB bd= new ConexionDB();
    //funcion para registrar el usuario por primera vez
    public String procedureRegistarLogin(String Nombre, String Apellido, String Usuario,
            String Contrasenia, String Correo, String TipoUsser)
    {
        String resultado=null;
        try {
                CallableStatement proc = bd.conn.prepareCall("{CALL InUsuario(?,?,?,?,?,?,?)}");
                proc.setString("pNombre",Nombre );
                proc.setString("pApellido",Apellido );
                proc.setString("pUsuario",Usuario );
                proc.setString("pContra",Contrasenia );
                proc.setString("pCorreo",Correo );
                proc.setString("pTipoU",TipoUsser );
                proc.registerOutParameter("pMjs", java.sql.Types.VARCHAR);
                proc.executeQuery();           

                resultado = proc.getString("pMjs");
            } 
           catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
           }
           return resultado;
        }
        //funcion para iniciar secion
        public Integer procedureLogin(String Contrasenia, String Correo)
        {
            Integer resultado=0;
           try {
                CallableStatement proc = bd.conn.prepareCall("{CALL LogIn(?,?,?)}");
                proc.setString("pContra",Contrasenia );
                proc.setString("pCorreo",Correo );
                proc.registerOutParameter("pmsj", java.sql.Types.INTEGER);
                proc.executeQuery();            

                resultado = proc.getInt("pmsj");
            } 
           catch (Exception e) {                  
            // JOptionPane.showMessageDialog(null, e);
           }
           return resultado;
        }
}
