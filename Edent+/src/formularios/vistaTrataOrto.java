
package formularios;

import formularios.*;
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

public class vistaTrataOrto extends javax.swing.JInternalFrame {

     private TableRowSorter trsFiltro;
    ConsultaJpaController te = new ConsultaJpaController(entityConsulta.getInstance());
     public Integer totalRegistros; // Obtener los registros
    public vistaTrataOrto() {
        initComponents();
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

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vista Tratamiento Ortodoncia");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
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
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 483, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(255, 255, 255))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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
            String apellido,id;
            nombre=jtPacientes.getValueAt(fila, 1).toString();
            apellido=jtPacientes.getValueAt(fila, 2).toString();
            id=jtPacientes.getValueAt(fila, 0).toString();
           
            frmTratamientoOrtodoncia.lbidplan.setText(id);
            frmTratamientoOrtodoncia.lbnombre.setText(nombre);
            frmTratamientoOrtodoncia.lbapellido.setText(apellido);
           
            

            this.dispose();
        }
        
            frmTratamientoOrtodoncia.txtanguloA1.setEnabled(true);
            frmTratamientoOrtodoncia.txtanguloG1.setEnabled(true);
            frmTratamientoOrtodoncia.txtIMPA1.setEnabled(true);
            frmTratamientoOrtodoncia.txtJa1.setEnabled(true);
            frmTratamientoOrtodoncia.txtEJE.setEnabled(true);
            frmTratamientoOrtodoncia.txtIS.setEnabled(true);
            frmTratamientoOrtodoncia.txtII.setEnabled(true);
            frmTratamientoOrtodoncia.txtFHIS.setEnabled(true);
            frmTratamientoOrtodoncia.txtANB82.setEnabled(true);
            frmTratamientoOrtodoncia.txtANB80.setEnabled(true);
            frmTratamientoOrtodoncia.txtANB2.setEnabled(true);
            frmTratamientoOrtodoncia.txtPALS.setEnabled(true);
            frmTratamientoOrtodoncia.txtPALI.setEnabled(true);
            frmTratamientoOrtodoncia.txtPTB.setEnabled(true);
            frmTratamientoOrtodoncia.txtDSD.setEnabled(true);
            frmTratamientoOrtodoncia.txtmaxilares.setEnabled(true);
            frmTratamientoOrtodoncia.txtEntornoD.setEnabled(true);
            frmTratamientoOrtodoncia.txtbandas.setEnabled(true);
            frmTratamientoOrtodoncia.txttubos.setEnabled(true);
            frmTratamientoOrtodoncia.txtotros.setEnabled(true);
            frmTratamientoOrtodoncia.txtAparato.setEnabled(true);
            frmTratamientoOrtodoncia.txtexodoncia.setEnabled(true);
            frmTratamientoOrtodoncia.txtBrakets.setEnabled(true);
            frmTratamientoOrtodoncia.txtRetenciones.setEnabled(true);
            frmTratamientoOrtodoncia.txtsecuencia.setEnabled(true);
            frmTratamientoOrtodoncia.txtMD.setEnabled(true);
            frmTratamientoOrtodoncia.txtrocabado.setEnabled(true);
            frmTratamientoOrtodoncia.btnBuscarEditar1.setEnabled(false);
            frmTratamientoOrtodoncia.btnBuscarEditar2.setEnabled(false);
            frmTratamientoOrtodoncia.btnGuardar.setEnabled(true);
            frmTratamientoOrtodoncia.btnGuardar1.setEnabled(true);
            frmTratamientoOrtodoncia.btnEditar.setEnabled(false);
             frmTratamientoOrtodoncia.btnEditar1.setEnabled(false);
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
                if(Listapac.get(i).getIdPaciente().getIdTipop().getNombret().equals("ortodoncia")){
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
