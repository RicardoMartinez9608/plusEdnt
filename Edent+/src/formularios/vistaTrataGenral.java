
package formularios;

import Clases.internalFrameImagen;
import Entidad.Consulta;
import Entidad.ConsultaJpaController;
import Entidad.entityConsulta;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class vistaTrataGenral extends internalFrameImagen {

     private TableRowSorter trsFiltro;
    ConsultaJpaController te = new ConsultaJpaController(entityConsulta.getInstance());
     public Integer totalRegistros; // Obtener los registros
    public vistaTrataGenral() {
        initComponents();
        setImagenw("imag1.jpg");
         llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Vista Tratamiento General");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Buscar");

        jtPacientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jtPacientes.getTableHeader().setReorderingAllowed(false);
        jtPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtPacientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtPacientes);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 102, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Salir");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
                //  se utiliza para filtrar los datos mostrados en el jtable
                this.txtBuscar.addKeyListener(new KeyAdapter(){
                        public void keyReleased(final KeyEvent e){
                                String cadena = (txtBuscar.getText());
                                txtBuscar.setText(cadena);
                                repaint();
                                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText().toUpperCase(), 1));
                                jtPacientes.getSelectionModel().setSelectionInterval(0, 0);
                            }
                    });
            trsFiltro = new TableRowSorter(jtPacientes.getModel());
            jtPacientes.setRowSorter(trsFiltro);
    
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jtPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPacientesMousePressed
        if(evt.getClickCount()==2){
            int fila =jtPacientes.getSelectedRow();
            String nombre;
            String apellido,id,motivo,total,historiam,historiaO,examen,dx;
            nombre=jtPacientes.getValueAt(fila, 1).toString();
            apellido=jtPacientes.getValueAt(fila, 2).toString();
            id=jtPacientes.getValueAt(fila, 0).toString();
            motivo = jtPacientes.getValueAt(fila, 3).toString();
            total = jtPacientes.getValueAt(fila, 4).toString();
            historiam = jtPacientes.getValueAt(fila, 5).toString();
            historiaO = jtPacientes.getValueAt(fila, 6).toString();
            examen = jtPacientes.getValueAt(fila, 7).toString();
            dx = jtPacientes.getValueAt(fila, 8).toString();
            frmTratamientoGeneral.lblidc.setText(id);
            frmTratamientoGeneral.lblnombre.setText(nombre);
            frmTratamientoGeneral.lblapellido.setText(apellido);
            frmTratamientoGeneral.txtMotivoC.setText(motivo);
            frmTratamientoGeneral.txtHistoriaM.setText(historiam);
            frmTratamientoGeneral.txtHistoriaO.setText(historiaO);
            frmTratamientoGeneral.txtExamenC.setText(examen);
            frmTratamientoGeneral.txtDX.setText(dx);
            frmTratamientoGeneral.txtpresupuesto.setText(total);
            

            this.dispose();
            
        frmTratamientoGeneral.btneditar.setEnabled(true);
        frmTratamientoGeneral.btnGuardar.setEnabled(false);
        frmTratamientoGeneral.txtDX.setEnabled(true);
        frmTratamientoGeneral.txtExamenC.setEnabled(true);
        frmTratamientoGeneral.txtHistoriaM.setEnabled(true);
        frmTratamientoGeneral.txtHistoriaO.setEnabled(true);
        frmTratamientoGeneral.txtMotivoC.setEnabled(true);
        frmTratamientoGeneral.txtpresupuesto.setEnabled(true);
        frmTratamientoGeneral.btnagregarpc.setEnabled(false);
        frmTratamientoGeneral.btnselecionaredicion.setEnabled(false);
        }
    }//GEN-LAST:event_jtPacientesMousePressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void llenarTabla(){
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulos = {"Codigo de Consulta","Nombre","Apellido","Motivo","Total Pagar","Historial M","Historial O",
        "Examen C","DX Odontologico"};
        String[] registros = new String[9];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulos);

        List<Consulta>Listapac;
        Listapac= te.findConsultaEntities();
        try {    
            for (int i = 0; i < Listapac.size(); i++) {
                if(Listapac.get(i).getIdPaciente().getIdTipop().getNombret().equals("general")){
                    registros[0]=Listapac.get(i).getIdConsulta().toString();
                    registros[1]=Listapac.get(i).getIdPaciente().getNombre();
                    registros[2]=Listapac.get(i).getIdPaciente().getApellido();
                    registros[3]=Listapac.get(i).getMotivoConsulta();
                    registros[4]=String.valueOf(Listapac.get(i).getTotalPagar());
                    registros[5]=Listapac.get(i).getHistoriam();
                    registros[6]=Listapac.get(i).getHistoriao();
                    registros[7]=Listapac.get(i).getExamenc();
                    registros[8]=Listapac.get(i).getDxodon();
                    totalRegistros = totalRegistros + 1;
                    modelo.addRow(registros);
                }
            }
            this.jtPacientes.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de la Consulta");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
