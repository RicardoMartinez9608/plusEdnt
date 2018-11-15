
package formularios;

import Entidad.Cefalom;
import Entidad.CefalomJpaController;
import Entidad.Consulta;
import Entidad.entityCefalom;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class vistaCfalom extends javax.swing.JInternalFrame {

    CefalomJpaController te = new CefalomJpaController(entityCefalom.getInstance());
     public Integer totalRegistros; // Obtener los registros
    public vistaCfalom() {
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

        setClosable(true);
        setIconifiable(true);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vista Cefalometria");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(599, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        //        //  se utiliza para filtrar los datos mostrados en el jtable
        //        this.txtBuscar.addKeyListener(new KeyAdapter(){
            //            public void keyReleased(final KeyEvent e){
                //                String cadena = (txtBuscar.getText());
                //                txtBuscar.setText(cadena);
                //                repaint();
                //                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText().toUpperCase(), 1));
                //                jtPacientes.getSelectionModel().setSelectionInterval(0, 0);
                //            }
            //        });
    //        trsFiltro = new TableRowSorter(jtPacientes.getModel());
    //        jtPacientes.setRowSorter(trsFiltro);
    //
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jtPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPacientesMousePressed
        if(evt.getClickCount()==2){
            int fila =jtPacientes.getSelectedRow();
            String nombre;
            String apellido,id,articular,goniaco,impa,jarabak,facial,is,ii,fhis,anb82,anb80,anb2,pals,pali,ptb;
            nombre=jtPacientes.getValueAt(fila, 1).toString();
            apellido=jtPacientes.getValueAt(fila, 2).toString();
            id=jtPacientes.getValueAt(fila, 0).toString();
            articular=jtPacientes.getValueAt(fila, 3).toString();
            goniaco=jtPacientes.getValueAt(fila, 4).toString();
            impa=jtPacientes.getValueAt(fila, 5).toString();
            jarabak=jtPacientes.getValueAt(fila, 6).toString();
            facial=jtPacientes.getValueAt(fila, 7).toString();
            is=jtPacientes.getValueAt(fila, 8).toString();
            ii=jtPacientes.getValueAt(fila, 9).toString();
            fhis=jtPacientes.getValueAt(fila, 10).toString();
            anb82=jtPacientes.getValueAt(fila, 11).toString();
            anb80=jtPacientes.getValueAt(fila, 12).toString();
            anb2=jtPacientes.getValueAt(fila, 13).toString();
            pals=jtPacientes.getValueAt(fila, 14).toString();
            pali=jtPacientes.getValueAt(fila, 15).toString();
            ptb=jtPacientes.getValueAt(fila, 16).toString();
            
            
            frmTratamientoOrtodoncia.lbidplan.setText(id);
            frmTratamientoOrtodoncia.lbnombre.setText(nombre);
            frmTratamientoOrtodoncia.lbapellido.setText(apellido);
            frmTratamientoOrtodoncia.txtanguloA1.setText(articular);
            frmTratamientoOrtodoncia.txtanguloG1.setText(goniaco);
            frmTratamientoOrtodoncia.txtIMPA1.setText(impa);
            frmTratamientoOrtodoncia.txtJa1.setText(jarabak);
            frmTratamientoOrtodoncia.txtEJE.setText(facial);
            frmTratamientoOrtodoncia.txtIS.setText(is);
            frmTratamientoOrtodoncia.txtII.setText(ii);
            frmTratamientoOrtodoncia.txtFHIS.setText(fhis);
            frmTratamientoOrtodoncia.txtANB82.setText(anb82);
            frmTratamientoOrtodoncia.txtANB80.setText(anb80);
            frmTratamientoOrtodoncia.txtANB2.setText(anb2);
            frmTratamientoOrtodoncia.txtPALS.setText(pals);
            frmTratamientoOrtodoncia.txtPALI.setText(pali);
            frmTratamientoOrtodoncia.txtPTB.setText(ptb);
            this.dispose();
            
            
            frmTratamientoOrtodoncia.txtanguloA1.setEnabled(true);
            frmTratamientoOrtodoncia.txtanguloG1.setEnabled(true);
            frmTratamientoOrtodoncia.txtIMPA1.setEnabled(true);
            frmTratamientoOrtodoncia.txtJa1.setEnabled(true);
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
            frmTratamientoOrtodoncia.btnBuscarEditar1.setEnabled(false);
            frmTratamientoOrtodoncia.btnBuscarEditar2.setEnabled(false);
            frmTratamientoOrtodoncia.btnGuardar.setEnabled(false);
            frmTratamientoOrtodoncia.btnEditar1.setEnabled(true);
            frmTratamientoOrtodoncia.btnElegirTP.setEnabled(false);
        }
    }//GEN-LAST:event_jtPacientesMousePressed

    private void llenarTabla(){
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulos = {"Codigo de cefalometria","Nombre","Apellido","Articular","Goniaco","Impa","Jarabak",
        "Facial","I_S","II","Fhis","ANB82","ANB80","ANB2","PALS","PALI","PTB"};
        String[] registros = new String[17];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulos);

        List<Cefalom>Listapac;
        Listapac= te.findCefalomEntities();
        try {    
            for (int i = 0; i < Listapac.size(); i++) {
                //if(Listapac.get(i).getIdTipop().getNombret().equals("General")){
                    registros[0]=Listapac.get(i).getIdCefalometria().toString();
                    registros[1]=Listapac.get(i).getIdConsulta().getIdPaciente().getNombre();
                    registros[2]=Listapac.get(i).getIdConsulta().getIdPaciente().getApellido();
                    registros[3]=Listapac.get(i).getArticular();
                    registros[4]=Listapac.get(i).getGoniaco();
                    registros[5]=Listapac.get(i).getImpa();
                    registros[6]=Listapac.get(i).getJarabak();
                    registros[7]=Listapac.get(i).getFacial();
                    registros[8]=Listapac.get(i).getIS();
                    registros[9]=Listapac.get(i).getIi();
                    registros[10]=Listapac.get(i).getFhis();
                    registros[11]=Listapac.get(i).getAnb82();
                    registros[12]=Listapac.get(i).getAnb80();
                    registros[13]=Listapac.get(i).getAnb2();
                    registros[14]=Listapac.get(i).getPals();
                    registros[15]=Listapac.get(i).getPali();
                    registros[16]=Listapac.get(i).getPtb();
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
