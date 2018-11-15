package formularios;

import Clases.internalFrameImagen;
import Clases.Clases;
import static formularios.frmPrincipal.Dpanel;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class frmTratamientoGeneral extends internalFrameImagen {

    public frmTratamientoGeneral() {
        initComponents();
        setImagenw("imag1.jpg");
        frmTratamientoGeneral.btnGuardar.setEnabled(false);
        frmTratamientoGeneral.btneditar.setEnabled(false);
        frmTratamientoGeneral.txtDX.setEnabled(false);
        frmTratamientoGeneral.txtExamenC.setEnabled(false);
        frmTratamientoGeneral.txtHistoriaM.setEnabled(false);
        frmTratamientoGeneral.txtHistoriaO.setEnabled(false);
        frmTratamientoGeneral.txtMotivoC.setEnabled(false);
        frmTratamientoGeneral.txtpresupuesto.setEnabled(false);
    }
public void limpiarTxt(){
       
        txtMotivoC.setText("");
        txtpresupuesto.setText("");
        txtHistoriaM.setText("");
        txtHistoriaO.setText("");
        txtExamenC.setText("");
        txtDX.setText("");
        jfecha.setCalendar(null);
}

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

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel5.setText("Consulta Pacientes Odontología General");

        btnagregarpc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/elegir tp.png"))); // NOI18N
        btnagregarpc.setText("Agregar paciente para consulta");
        btnagregarpc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnagregarpc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnagregarpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarpcActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel1.setText("Numero de expediente");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setText("Fecha");

        jfecha.setDateFormatString("yyyy-MM-dd");
        jfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jfechaKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel4.setText("ID consulta");

        lblidc.setText("...");

        lblnombre1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre1.setText("Motivo de la Consulta: ");

        txtMotivoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMotivoCKeyPressed(evt);
            }
        });

        lblnombre2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre2.setText("Historia Médica:");

        txtHistoriaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHistoriaMKeyPressed(evt);
            }
        });

        lblnombre3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre3.setText("Historia Odontológica:");

        txtHistoriaO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHistoriaOKeyPressed(evt);
            }
        });

        lblnombre4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre4.setText("Examen Clínico:");

        txtExamenC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtExamenCKeyPressed(evt);
            }
        });

        lblnombre5.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre5.setText("DX Odontológico:");

        txtDX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDXKeyPressed(evt);
            }
        });

        lblnombre6.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre6.setText("Presupuesto:");

        txtpresupuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpresupuestoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpresupuestoKeyTyped(evt);
            }
        });

        btnselecionaredicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar edicion.png"))); // NOI18N
        btnselecionaredicion.setText("Seleccionar paciente a editar");
        btnselecionaredicion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnselecionaredicion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnselecionaredicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselecionaredicionActionPerformed(evt);
            }
        });

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btneditar.setText("Editar Paciente");
        btneditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

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

        lblnombre.setText("Nombre");

        lblapellido.setText("Apellido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblnombre1)
                        .addGap(9, 9, 9)
                        .addComponent(txtMotivoC, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblidc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtHistoriaM, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblnombre3)
                        .addGap(13, 13, 13)
                        .addComponent(txtHistoriaO, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblnombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtExamenC, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblnombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtDX, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblnombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtpresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnselecionaredicion)
                        .addGap(9, 9, 9)
                        .addComponent(btneditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnagregarpc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5)))))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblnombre)
                .addGap(64, 64, 64)
                .addComponent(lblapellido)
                .addGap(71, 71, 71)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)
                        .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnagregarpc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblnombre)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblapellido)
                                .addComponent(jLabel3)))
                        .addGap(22, 22, 22)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMotivoC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnombre1)
                            .addComponent(jLabel4)
                            .addComponent(lblidc))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblnombre2))
                    .addComponent(txtHistoriaM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnombre3)
                    .addComponent(txtHistoriaO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnombre4)
                    .addComponent(txtExamenC, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnombre5)
                    .addComponent(txtDX, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblnombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtpresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnselecionaredicion)
                    .addComponent(btneditar)
                    .addComponent(btnGuardar)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

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
         vistaTrataGenral vpc=new vistaTrataGenral();
        Dpanel.add(vpc);
        vpc.show();
    }//GEN-LAST:event_btnselecionaredicionActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
       String dia = Integer.toString(jfecha.getCalendar().get(Calendar.DAY_OF_MONTH));
      String mes = Integer.toString(jfecha.getCalendar().get(Calendar.MONTH) + 1);
      String year = Integer.toString(jfecha.getCalendar().get(Calendar.YEAR));
      String fechaA = (dia + "-" + mes+ "-" + year);
      String date = fechaA; 
      Clases UpdateConsulta = new Clases();
      UpdateConsulta.procedureUpdateConsultaG(txtMotivoC.getText(), date, Double.parseDouble(txtpresupuesto.getText())
              , txtHistoriaM.getText(), txtHistoriaO.getText(), txtExamenC.getText(), txtDX.getText(),Integer.parseInt(lblidc.getText()));
      JOptionPane.showMessageDialog(null, "Datos de Tratamiento Actualizados correctamente");
       limpiarTxt();
       
        frmTratamientoGeneral.btnGuardar.setEnabled(false);
        frmTratamientoGeneral.btneditar.setEnabled(false);
        frmTratamientoGeneral.txtDX.setEnabled(false);
        frmTratamientoGeneral.txtExamenC.setEnabled(false);
        frmTratamientoGeneral.txtHistoriaM.setEnabled(false);
        frmTratamientoGeneral.txtHistoriaO.setEnabled(false);
        frmTratamientoGeneral.txtMotivoC.setEnabled(false);
        frmTratamientoGeneral.txtpresupuesto.setEnabled(false);
        frmTratamientoGeneral.btnagregarpc.setEnabled(true);
        frmTratamientoGeneral.btnselecionaredicion.setEnabled(true);
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
      String dia = Integer.toString(jfecha.getCalendar().get(Calendar.DAY_OF_MONTH));
      String mes = Integer.toString(jfecha.getCalendar().get(Calendar.MONTH) + 1);
      String year = Integer.toString(jfecha.getCalendar().get(Calendar.YEAR));
      String fechaA = (dia + "-" + mes+ "-" + year);
      String date = fechaA; 
      
      Clases consultaG = new Clases();
      
      consultaG.procedureConsultaG(txtMotivoC.getText(), date, Double.parseDouble(txtpresupuesto.getText())
              , txtHistoriaM.getText(), txtHistoriaO.getText(), txtExamenC.getText(), txtDX.getText(),Integer.parseInt(lblid.getText()));
      JOptionPane.showMessageDialog(null, "Tratamiento ingresado correctamente");
      limpiarTxt();
      
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
