package conexionSQL;
import formularios.frmExpedienteGeneral;
import ConexionSql.ConexionDB;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class InsertarDatosBD {
    ConexionDB con = new ConexionDB();
    Connection cn = con.getConneccion();
    
    //metodo para insertar pacientes generales a la tabla pacienten se utiliza en el formulario ExpedienteGeneral
     public void insertarPaciente(String nombre, String apellido ,String direccion, String telefono,String edad,String tipo,String fecha){
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO paciente(`nombre`,`apellido`,"
                    + "`direccion`,`telefono`,`edad`,`fecha_registro`,`id_tipop`)"
                    + "VALUES(?,?,?,?,?,?,?);");
            pps.setString(1, nombre);
            pps.setString(2, apellido);
            pps.setString(3, direccion);
            pps.setString(4, telefono);
            pps.setString(5, edad);
            pps.setString(6, fecha);
            pps.setString(7, tipo);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            con.closeBD();
        } catch (SQLException ex) {
            Logger.getLogger(frmExpedienteGeneral.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
            con.closeBD();
        }
    }
}
