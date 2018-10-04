
package formularios;


import ConexionSql.ConexionDB;
import static formularios.frmPrincipal.Dpanel;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class frmExpedienteGeneral extends javax.swing.JInternalFrame {

    public frmExpedienteGeneral() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        lbltelefono = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        lbledad = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        lblid1 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        lbldireccion = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        btcon = new javax.swing.JButton();
        btnbuscaredicion = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txttip = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        lbltitulo.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        lbltitulo.setText("Expediente Paciente Odontología General");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setText("Para realizar una consulta elija el tipo de paciente:");

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/elegir tp.png"))); // NOI18N
        jButton1.setText("Elegir tipo de paciente");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel1.setText("Fecha:");

        fecha.setDateFormatString("yyyy-MM-dd");
        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaKeyPressed(evt);
            }
        });

        lbltelefono.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lbltelefono.setText("Teléfono:");

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        lbledad.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lbledad.setText("Edad:");

        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtedadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

        lblid1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblid1.setText("ID paciente:");
        lblid1.setAutoscrolls(true);

        lblid.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblid.setText("...");
        lblid.setAutoscrolls(true);

        lblnombre.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre.setText("Nombre: ");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setText("Apellido:");

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        lbldireccion.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lbldireccion.setText("Dirección: ");

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdireccionKeyPressed(evt);
            }
        });

        btcon.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/consulta.png"))); // NOI18N
        btcon.setText("Agregar consulta");
        btcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btcon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconActionPerformed(evt);
            }
        });

        btnbuscaredicion.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnbuscaredicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar edicion.png"))); // NOI18N
        btnbuscaredicion.setText("Buscar para editar");
        btnbuscaredicion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscaredicion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbuscaredicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaredicionActionPerformed(evt);
            }
        });

        btneditar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btneditar.setText("Editar");
        btneditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
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

        btnsalir.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
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

        txttip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(198, 198, 198)
                        .addComponent(txttip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(lbltitulo)))
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(lbltelefono)
                            .addGap(10, 10, 10)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(lbledad)
                            .addGap(32, 32, 32)
                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(lblid1)
                            .addGap(18, 18, 18)
                            .addComponent(lblid))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(lblnombre)
                            .addGap(18, 18, 18)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(77, 77, 77)
                            .addComponent(jLabel2)
                            .addGap(19, 19, 19)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbldireccion)
                            .addGap(10, 10, 10)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(btcon)
                            .addGap(10, 10, 10)
                            .addComponent(btnbuscaredicion)
                            .addGap(6, 6, 6)
                            .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jButton1)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulo)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttip, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(477, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(jButton1)
                    .addGap(49, 49, 49)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(lbledad))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblid1)
                                                .addComponent(lblid)))
                                        .addGap(3, 3, 3)))
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(lbltelefono)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lblnombre))
                                .addComponent(jLabel2)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(lbldireccion))
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(55, 55, 55)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbuscaredicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btneditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       frmTipoPaciente formProd = new frmTipoPaciente();
       Dpanel.add(formProd);
       formProd.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed

    }//GEN-LAST:event_fechaKeyPressed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed

    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped

    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtedadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyPressed

    }//GEN-LAST:event_txtedadKeyPressed

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped

    }//GEN-LAST:event_txtedadKeyTyped

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed

    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped

    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyPressed

    }//GEN-LAST:event_txtapellidoKeyPressed

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped

    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed

    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtdireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyPressed

    }//GEN-LAST:event_txtdireccionKeyPressed

    private void btconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconActionPerformed

    }//GEN-LAST:event_btconActionPerformed

    private void btnbuscaredicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaredicionActionPerformed

    }//GEN-LAST:event_btnbuscaredicionActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed

    }//GEN-LAST:event_btneditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     ConexionDB prueba = new ConexionDB();
    
      String dia = Integer.toString(fecha.getCalendar().get(Calendar.DAY_OF_MONTH));
      String mes = Integer.toString(fecha.getCalendar().get(Calendar.MONTH) + 1);
      String year = Integer.toString(fecha.getCalendar().get(Calendar.YEAR));
      String fechaA = (dia + "-" + mes+ "-" + year);
      String date = fechaA; 
     prueba.procedurePaciente(txtnombre.getText(),txtapellido.getText(),txtdireccion.getText(),txttelefono.getText(),
              Integer.parseInt(txtedad.getText()),date,Integer.parseInt(txttip.getText()));
        
        JOptionPane.showMessageDialog(null, "Paciente Almacenado");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txttipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcon;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnbuscaredicion;
    public static javax.swing.JButton btneditar;
    private javax.swing.JButton btnsalir;
    public static com.toedter.calendar.JDateChooser fecha;
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lbledad;
    public static javax.swing.JLabel lblid;
    public static javax.swing.JLabel lblid1;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltitulo;
    public static javax.swing.JTextField txtapellido;
    public static javax.swing.JTextField txtdireccion;
    public static javax.swing.JTextField txtedad;
    public static final javax.swing.JTextField txtnombre = new javax.swing.JTextField();
    public static javax.swing.JTextField txttelefono;
    public static javax.swing.JTextField txttip;
    // End of variables declaration//GEN-END:variables
}
