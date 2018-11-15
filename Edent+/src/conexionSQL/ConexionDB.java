/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conexionSql;
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
//public class ConexionDB {
// private String login = "tps";
//  private String password = "tps1234";
//  private String url = "jdbc:oracle:thin:@localhost:1521:XE";
//  private Connection conn = null;
//___________________________________________________________________________________ Soy una barra separadora ??
  //Constructor de la clase que se conecta a la base de datos una vez que se crea la instancia
//  public ConexionDB(){
//      try{         
//         Class.forName("oracle.jdbc.driver.OracleDriver");         
//         conn = DriverManager.getConnection(url,login,password);         
//      }catch(SQLException e){
//         System.out.println(e);
//      }catch(ClassNotFoundException e){
//         System.out.println(e);
//      }
//    }
//   public String procedurePaciente(String nombre, String apellido, String direccion, String tel, 
//           Integer edad, String fecha, Integer tipo)
//   {
//       String resultado=null;
//       try {            
//           
//            CallableStatement proc = conn.prepareCall("{CALL INGRESARPAC(?,?,?,?,?,?,?,?)}");
//            proc.setString("pNombre",nombre );
//            proc.setString("pApellido",apellido );
//            proc.setString("pDireccion",direccion );
//            proc.setString("pTelefono",tel );
//          
//            proc.setInt("pEdad",edad );
//            proc.setString("pFechaRegistro",fecha);
//            proc.setInt("pIdTipoP",tipo );
//            proc.registerOutParameter("pMjs", java.sql.Types.VARCHAR);
//            proc.executeQuery();            
//            
//            resultado = proc.getString("pMjs");
//        } 
//       catch (Exception e) {                  
//            JOptionPane.showMessageDialog(null, e);
//       }
//       return resultado;
//   }
//   public String procedureIngresarTrataOr(String bandas, String tubos, String otros, String aparato, 
//           String exodoncia, String brackets, String retenciones, String md, Integer id_consulta)
//   {
//       String resultado=null;
//       try {            
//           
//            CallableStatement proc = conn.prepareCall("{CALL IngresarTrataOr(?,?,?,?,?,?,?,?,?,?)}");
//            proc.setString("Bandas",bandas );
//            proc.setString("Tubos",tubos );
//            proc.setString("Otros",otros );
//            proc.setString("Aparato",aparato );
//            proc.setString("Exodoncia",exodoncia );
//            proc.setString("Brackets",brackets);
//            proc.setString("Retenciones",retenciones );
//            proc.setString("Md",md);
//            proc.setInt("IdConsulta",id_consulta );
//            proc.registerOutParameter("pMjs", java.sql.Types.VARCHAR);
//            proc.executeQuery();            
//            
//            resultado = proc.getString("pMjs");
//        } 
//       catch (Exception e) {                  
//            JOptionPane.showMessageDialog(null, e);
//       }
//       return resultado;
//   }
//   public String procedureIngresarCefalom(String articular, String goniaco, String impa, String jarabak, 
//           String facial, String is, String ii, String fhis, String anb82,String anb80, String anb2,
//           String pals, String pali, String ptb, String dsd, String clasim, String entornod, Integer id_Consulta)
//   {
//       String resultado=null;
//       try {            
//           
//            CallableStatement proc = conn.prepareCall("{CALL IngresarCefalom(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
//            proc.setString("Articular",articular );
//            proc.setString("Goniaco",goniaco );
//            proc.setString("Impa",impa );
//            proc.setString("Jarabak",jarabak );
//            proc.setString("Facial",facial );
//            proc.setString("I_s",is);
//            proc.setString("Ii",ii );
//            proc.setString("Fhis",fhis);
//            proc.setString("Anb82",anb82 );
//            proc.setString("Anb80",anb80 );
//            proc.setString("Anb2",anb2 );
//            proc.setString("Pals",pals );
//            proc.setString("Pali",pali );
//            proc.setString("Ptb",ptb);
//            proc.setString("Dsd",dsd );
//            proc.setString("Clasim",clasim);
//            proc.setString("Entornod",entornod);
//            proc.setInt("Id_consulta",id_Consulta );
//            proc.registerOutParameter("pMjs", java.sql.Types.VARCHAR);
//            proc.executeQuery();            
//            
//            resultado = proc.getString("pMjs");
//        } 
//       catch (Exception e) {                  
//            JOptionPane.showMessageDialog(null, e);
//       }
//       return resultado;
//   }
//   
//   public String procedureTrataSpee(Integer leve, Integer moderada, Integer severa, Integer Idconsulta)
//   {
//       String resultado=null;
//       try {            
//           
//            CallableStatement proc = conn.prepareCall("{CALL TrataSpee(?,?,?,?,?)}");
//            proc.setInt("Leve",leve );
//            proc.setInt("Moderada",moderada );
//            proc.setInt("Severa",severa );
//            proc.setInt("IdConsulta",Idconsulta );
//            proc.registerOutParameter("pMjs", java.sql.Types.VARCHAR);
//            proc.executeQuery();            
//            
//            resultado = proc.getString("pMjs");
//        } 
//       catch (Exception e) {                  
//            JOptionPane.showMessageDialog(null, e);
//       }
//       return resultado;
//   }
//   
//    public String procedureIndicacionEspecial(Integer faciales, Integer intraorales, Integer modelomx, Integer modelomd,
//                                               Integer panoramica, Integer cefalometria, Integer incicivos, String rocabado, Integer Idconsulta)
//   {
//       String resultado=null;
//       try {            
//           
//            CallableStatement proc = conn.prepareCall("{CALL IngresarIndicacionEspecial(?,?,?,?,?,?,?,?,?,?)}");
//            proc.setInt("Ffaciales",faciales );
//            proc.setInt("Fintraorales",intraorales );
//            proc.setInt("Modelomx",modelomx );
//            proc.setInt("Modelomd",modelomd );
//            proc.setInt("Rxpanoramica",panoramica );
//            proc.setInt("Rxcefalometrica",cefalometria );
//            proc.setInt("Rxincicivos",incicivos );
//            proc.setString("Rxrocabado",rocabado ); 
//            proc.setInt("IdConsulta",Idconsulta );
//            proc.registerOutParameter("pMjs", java.sql.Types.VARCHAR);
//            proc.executeQuery();            
//            
//            resultado = proc.getString("pMjs");
//        } 
//       catch (Exception e) {                  
//            JOptionPane.showMessageDialog(null, e);
//       }
//       return resultado;
//   }
//   
//    public String procedureConsultaG(String motivo, String fecha, Double total, String historiaM,
//                    String historiaO, String examenC, String Dxodon,Integer Idpaciente)
//   {
//       String resultado=null;
//       try {            
//           
//            CallableStatement proc = conn.prepareCall("{CALL ConsultaGeneral(?,?,?,?,?,?,?,?,?)}");
//            proc.setString("Motivo",motivo );
//            proc.setString("Fecha",fecha );
//            proc.setDouble("Total",total );
//            proc.setString("HistoriaM",historiaM );
//            proc.setString("HistoriaO",historiaO );
//            proc.setString("ExamenC",examenC );
//            proc.setString("DXodon",Dxodon );
//            proc.setInt("IdPaciente",Idpaciente );
//            proc.registerOutParameter("pMjs", java.sql.Types.VARCHAR);
//            proc.executeQuery();            
//            
//            resultado = proc.getString("pMjs");
//        } 
//       catch (Exception e) {                  
//            JOptionPane.showMessageDialog(null, e);
//       }
//       return resultado;
//   }
//    
//     public String procedureUpdatePaciente(String nombre, String apellido, String direccion, String tel, 
//           int edad, String fecha, int IdPaciente)
//   {
//       String resultado=null;
//       try {            
//           
//            CallableStatement proc = conn.prepareCall("{CALL UpdateInPaciente(?,?,?,?,?,?,?,?)}");
//            proc.setString("pNombre",nombre );
//            proc.setString("pApellido",apellido );
//            proc.setString("pDireccion",direccion );
//            proc.setString("pTelefono",tel );
//            proc.setInt("pEdad",edad );
//            proc.setString("pFechaRegis",fecha);
//            proc.setInt("pIdPaciente",IdPaciente );
//            proc.registerOutParameter("pMjs", java.sql.Types.VARCHAR);
//            proc.executeQuery();            
//            
//            resultado = proc.getString("pMjs");
//        } 
//       catch (Exception e) {                  
//            JOptionPane.showMessageDialog(null, e);
//       }
//       return resultado;
//   }
//     public String procedureUpdateConsultaG(String motivo, String fecha, Double total, String historiaM,
//                    String historiaO, String examenC, String Dxodon,Integer Idconsulta)
//   {
//       String resultado=null;
//       try {            
//           
//            CallableStatement proc = conn.prepareCall("{CALL UpdateConsultaGeneral(?,?,?,?,?,?,?,?,?)}");
//            proc.setString("Motivo",motivo );
//            proc.setString("Fecha",fecha );
//            proc.setDouble("Total",total );
//            proc.setString("HM",historiaM );
//            proc.setString("HO",historiaO );
//            proc.setString("EC",examenC );
//            proc.setString("DX",Dxodon );
//            proc.setInt("IdConsulta",Idconsulta );
//            proc.registerOutParameter("pMjs", java.sql.Types.VARCHAR);
//            proc.executeQuery();            
//            
//            resultado = proc.getString("pMjs");
//        } 
//       catch (Exception e) {                  
//            JOptionPane.showMessageDialog(null, e);
//       }
//       return resultado;
//   }
//     
//     public String procedureUpdateIngresarCefalom(String articular, String goniaco, String impa, String jarabak, 
//           String facial, String is, String ii, String fhis, String anb82,String anb80, String anb2,
//           String pals, String pali, String ptb, String dsd, String clasim, String entornod, Integer id_Cefalom)
//   {
//       String resultado=null;
//       try {            
//           
//            CallableStatement proc = conn.prepareCall("{CALL UpdateIngresarCefalom(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
//            proc.setString("Arti",articular );
//            proc.setString("Goni",goniaco );
//            proc.setString("Imp",impa );
//            proc.setString("Jarab",jarabak );
//            proc.setString("Fac",facial );
//            proc.setString("I_s",is);
//            proc.setString("I_i",ii );
//            proc.setString("Fhi",fhis);
//            proc.setString("An82",anb82 );
//            proc.setString("An80",anb80 );
//            proc.setString("An2",anb2 );
//            proc.setString("Pal",pals );
//            proc.setString("Pli",pali );
//            proc.setString("Pb",ptb);
//            proc.setString("Ds",dsd );
//            proc.setString("Clas",clasim);
//            proc.setString("Entorno",entornod);
//            proc.setInt("Id_cefalom",id_Cefalom );
//            proc.registerOutParameter("pMjs", java.sql.Types.VARCHAR);
//            proc.executeQuery();            
//            
//            resultado = proc.getString("pMjs");
//        } 
//       catch (Exception e) {                  
//            JOptionPane.showMessageDialog(null, e);
//       }
//       return resultado;
//   }
//   public String procedureUpdateIngresarTrataOr(String bandas, String tubos, String otros, String aparato, 
//           String exodoncia, String brackets, String retenciones, String md, Integer id_t)
//   {
//       String resultado=null;
//       try {            
//           
//            CallableStatement proc = conn.prepareCall("{CALL UpdateIngresarTrataOr(?,?,?,?,?,?,?,?,?,?)}");
//            proc.setString("Band",bandas );
//            proc.setString("Tubo",tubos );
//            proc.setString("Otro",otros );
//            proc.setString("Apara",aparato );
//            proc.setString("Exo",exodoncia );
//            proc.setString("Bracket",brackets);
//            proc.setString("Reten",retenciones );
//            proc.setString("M_d",md);
//            proc.setInt("Idtrata",id_t );
//            proc.registerOutParameter("pMjs", java.sql.Types.VARCHAR);
//            proc.executeQuery();            
//            
//            resultado = proc.getString("pMjs");
//        } 
//       catch (Exception e) {                  
//            JOptionPane.showMessageDialog(null, e);
//       }
//       return resultado;
//   }
//    }
