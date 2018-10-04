/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import ConexionSql.ConexionDB;
import static formularios.frmPrincipal.Dpanel;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class frmTratamientoGeneral extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmTratamientoGeneral
     */
    public frmTratamientoGeneral() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnagregarpc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jfecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        lblidc = new javax.swing.JLabel();
        lblnombre1 = new javax.swing.JLabel();
        txtMotivoC = new javax.swing.JTextField();
        lblnombre2 = new javax.swing.JLabel();
        txtHistoriaM = new javax.swing.JTextField();
        lblnombre3 = new javax.swing.JLabel();
        txtHistoriaO = new javax.swing.JTextField();
        lblnombre4 = new javax.swing.JLabel();
        txtExamenC = new javax.swing.JTextField();
        lblnombre5 = new javax.swing.JLabel();
        txtDX = new javax.swing.JTextField();
        lblnombre6 = new javax.swing.JLabel();
        txtpresupuesto = new javax.swing.JTextField();
        btnselecionaredicion = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel5.setText("Consulta Pacientes Odontología General");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 11, -1, -1));

        btnagregarpc.setText("Agregar paciente para consulta");
        btnagregarpc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnagregarpc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnagregarpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarpcActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregarpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel1.setText("Numero de expediente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 66, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 66, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setText("Fecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 72, -1, -1));

        jfecha.setDateFormatString("yyyy-MM-dd");
        jfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jfechaKeyPressed(evt);
            }
        });
        getContentPane().add(jfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 67, 151, -1));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel4.setText("ID consulta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 106, -1, -1));

        lblidc.setText("...");
        getContentPane().add(lblidc, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 106, -1, -1));

        lblnombre1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre1.setText("Motivo de la Consulta: ");
        getContentPane().add(lblnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 99, -1, -1));

        txtMotivoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMotivoCKeyPressed(evt);
            }
        });
        getContentPane().add(txtMotivoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 89, 350, 48));

        lblnombre2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre2.setText("Historia Médica:");
        getContentPane().add(lblnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 162, 126, -1));

        txtHistoriaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHistoriaMKeyPressed(evt);
            }
        });
        getContentPane().add(txtHistoriaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 152, 350, 50));

        lblnombre3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre3.setText("Historia Odontológica:");
        getContentPane().add(lblnombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 213, -1, -1));

        txtHistoriaO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHistoriaOKeyPressed(evt);
            }
        });
        getContentPane().add(txtHistoriaO, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 213, 350, 49));

        lblnombre4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre4.setText("Examen Clínico:");
        getContentPane().add(lblnombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 280, 120, -1));

        txtExamenC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtExamenCKeyPressed(evt);
            }
        });
        getContentPane().add(txtExamenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 280, 350, 49));

        lblnombre5.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre5.setText("DX Odontológico:");
        getContentPane().add(lblnombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 345, 130, -1));

        txtDX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDXKeyPressed(evt);
            }
        });
        getContentPane().add(txtDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 345, 350, 52));

        lblnombre6.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre6.setText("Presupuesto:");
        getContentPane().add(lblnombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 419, 88, 20));

        txtpresupuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpresupuestoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpresupuestoKeyTyped(evt);
            }
        });
        getContentPane().add(txtpresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 415, 90, 29));

        btnselecionaredicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar edicion.png"))); // NOI18N
        btnselecionaredicion.setText("Seleccionar paciente a editar");
        btnselecionaredicion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnselecionaredicion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnselecionaredicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselecionaredicionActionPerformed(evt);
            }
        });
        getContentPane().add(btnselecionaredicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 454, -1, -1));

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btneditar.setText("Editar Paciente");
        btneditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        getContentPane().add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 454, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 454, 85, -1));

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setToolTipText("");
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 454, 83, 91));

        lblnombre.setText("Nombre");
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 65, -1, -1));

        lblapellido.setText("Apellido");
        getContentPane().add(lblapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 65, -1, -1));
        getContentPane().add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 65, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarpcActionPerformed
        vistaPClinica vpc=new vistaPClinica();
        Dpanel.add(vpc);
        vpc.show();
    }//GEN-LAST:event_btnagregarpcActionPerformed

    private void jfechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfechaKeyPressed

    }//GEN-LAST:event_jfechaKeyPressed

    private void txtMotivoCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotivoCKeyPressed

    }//GEN-LAST:event_txtMotivoCKeyPressed

    private void txtHistoriaMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHistoriaMKeyPressed

    }//GEN-LAST:event_txtHistoriaMKeyPressed

    private void txtHistoriaOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHistoriaOKeyPressed

    }//GEN-LAST:event_txtHistoriaOKeyPressed

    private void txtExamenCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExamenCKeyPressed

    }//GEN-LAST:event_txtExamenCKeyPressed

    private void txtDXKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDXKeyPressed

    }//GEN-LAST:event_txtDXKeyPressed

    private void txtpresupuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpresupuestoKeyPressed

    }//GEN-LAST:event_txtpresupuestoKeyPressed

    private void txtpresupuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpresupuestoKeyTyped

    }//GEN-LAST:event_txtpresupuestoKeyTyped

    private void btnselecionaredicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselecionaredicionActionPerformed

    }//GEN-LAST:event_btnselecionaredicionActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed

    }//GEN-LAST:event_btneditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
      String dia = Integer.toString(jfecha.getCalendar().get(Calendar.DAY_OF_MONTH));
      String mes = Integer.toString(jfecha.getCalendar().get(Calendar.MONTH) + 1);
      String year = Integer.toString(jfecha.getCalendar().get(Calendar.YEAR));
      String fechaA = (dia + "-" + mes+ "-" + year);
      String date = fechaA; 
      
      ConexionDB consultaG = new ConexionDB();
      
      consultaG.procedureConsultaG(txtMotivoC.getText(), date, Double.parseDouble(txtpresupuesto.getText())
              , txtHistoriaM.getText(), txtHistoriaO.getText(), txtExamenC.getText(), txtDX.getText(), 2);
      JOptionPane.showMessageDialog(null, "Tratamiento ingresado correctamente");
      
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnagregarpc;
    public static javax.swing.JButton btneditar;
    private javax.swing.JButton btnsalir;
    public static javax.swing.JButton btnselecionaredicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static com.toedter.calendar.JDateChooser jfecha;
    public static javax.swing.JLabel lblapellido;
    public static javax.swing.JLabel lblid;
    public static javax.swing.JLabel lblidc;
    public static javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblnombre1;
    private javax.swing.JLabel lblnombre2;
    private javax.swing.JLabel lblnombre3;
    private javax.swing.JLabel lblnombre4;
    private javax.swing.JLabel lblnombre5;
    private javax.swing.JLabel lblnombre6;
    public static javax.swing.JTextField txtDX;
    public static javax.swing.JTextField txtExamenC;
    public static javax.swing.JTextField txtHistoriaM;
    public static javax.swing.JTextField txtHistoriaO;
    public static javax.swing.JTextField txtMotivoC;
    public static javax.swing.JTextField txtpresupuesto;
    // End of variables declaration//GEN-END:variables
}
