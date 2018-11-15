
package formularios;

import Clases.internalFrameImagen;
import Entidad.Trataor;
import Entidad.TrataorJpaController;
import Entidad.entityTrataOr;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class vistaTratOr extends internalFrameImagen {

    private TableRowSorter trsFiltro;
    TrataorJpaController te = new TrataorJpaController(entityTrataOr.getInstance());
     public Integer totalRegistros; // Obtener los registros
     
    public vistaTratOr() {
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

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel5.setText("Vista Tratamiento Ortodoncia");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
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
            String apellido,id,bandas,tubos,otros,aparato,exodoncia,brackets,retenciones,md;
            nombre=jtPacientes.getValueAt(fila, 1).toString();
            apellido=jtPacientes.getValueAt(fila, 2).toString();
            id=jtPacientes.getValueAt(fila, 0).toString();
            bandas=jtPacientes.getValueAt(fila, 3).toString();
            tubos=jtPacientes.getValueAt(fila, 4).toString();
            otros=jtPacientes.getValueAt(fila, 5).toString();
            aparato=jtPacientes.getValueAt(fila, 6).toString();
            exodoncia=jtPacientes.getValueAt(fila, 7).toString();
            brackets=jtPacientes.getValueAt(fila, 8).toString();
            retenciones=jtPacientes.getValueAt(fila, 9).toString();
            md=jtPacientes.getValueAt(fila, 10).toString();         
            
            
            frmTratamientoOrtodoncia.lbidplan.setText(id);
            frmTratamientoOrtodoncia.lbnombre.setText(nombre);
            frmTratamientoOrtodoncia.lbapellido.setText(apellido);
            frmTratamientoOrtodoncia.txtbandas.setText(bandas);
            frmTratamientoOrtodoncia.txttubos.setText(tubos);
            frmTratamientoOrtodoncia.txtotros.setText(otros);
            frmTratamientoOrtodoncia.txtAparato.setText(aparato);
            frmTratamientoOrtodoncia.txtexodoncia.setText(exodoncia);
            frmTratamientoOrtodoncia.txtBrakets.setText(brackets);
            frmTratamientoOrtodoncia.txtRetenciones.setText(retenciones);
            frmTratamientoOrtodoncia.txtMD.setText(md);
          
            this.dispose();
            
            
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
            frmTratamientoOrtodoncia.btnGuardar1.setEnabled(false);
            frmTratamientoOrtodoncia.btnEditar.setEnabled(true);
            frmTratamientoOrtodoncia.btnElegirTP.setEnabled(false);
        }
    }//GEN-LAST:event_jtPacientesMousePressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    private void llenarTabla(){
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulos = {"Codigo de tratamiento","Nombre","Apellido","Bandas","Tubos","Otros",
        "Aparato","Exodoncia","Brackets","Retenciones","MD"};
        String[] registros = new String[12];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulos);

        List<Trataor>Listapac;
        Listapac= te.findTrataorEntities();
        try {    
            for (int i = 0; i < Listapac.size(); i++) {
                //if(Listapac.get(i).getIdTipop().getNombret().equals("General")){
                    registros[0]=Listapac.get(i).getIdOrtodoncia().toString();
                    registros[1]=Listapac.get(i).getIdConsulta().getIdPaciente().getNombre();
                    registros[2]=Listapac.get(i).getIdConsulta().getIdPaciente().getApellido();
                    registros[3]=Listapac.get(i).getBandas();
                    registros[4]=Listapac.get(i).getTubos();
                    registros[5]=Listapac.get(i).getOtros();
                    registros[6]=Listapac.get(i).getAparato();
                    registros[7]=Listapac.get(i).getExodoncia();
                    registros[8]=Listapac.get(i).getBrackets();
                    registros[9]=Listapac.get(i).getRetenciones();
                    registros[10]=Listapac.get(i).getMd();
                    totalRegistros = totalRegistros + 1;
                    modelo.addRow(registros);
                //}
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
