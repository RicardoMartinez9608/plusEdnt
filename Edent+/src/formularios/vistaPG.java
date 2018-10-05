
package formularios;

import Entidad.Paciente;
import Entidad.PacienteJpaController;
import Entidad.Tipop;
import Entidad.TipopJpaController;
import Entidad.entityPaciente;
import Entidad.entityTipop;
import static formularios.frmTipoPaciente.modelo2;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class vistaPG extends javax.swing.JInternalFrame {

    PacienteJpaController te = new PacienteJpaController(entityPaciente.getInstance());
    public vistaPG() {
        initComponents();
         CrearModeloPa();
        LlenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel5.setText("Vista de Pacientes de Clinica");

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jtPacientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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
            String nombre, edad,telefono,direccion;
            String apellido,fecha,id;
            nombre=jtPacientes.getValueAt(fila, 1).toString();
            apellido=jtPacientes.getValueAt(fila, 2).toString();
            id=jtPacientes.getValueAt(fila, 0).toString();
            edad = jtPacientes.getValueAt(fila,5).toString();
            telefono = jtPacientes.getValueAt(fila,4).toString();
            direccion = jtPacientes.getValueAt(fila,3).toString();
            frmExpedienteGeneral.lblid.setText(id);
            frmExpedienteGeneral.txtnombre.setText(nombre);
            frmExpedienteGeneral.txtapellido.setText(apellido);
            frmExpedienteGeneral.txtdireccion.setText(direccion);
            frmExpedienteGeneral.txttelefono.setText(telefono);
            frmExpedienteGeneral.txtedad.setText(edad);
                    
            
            this.dispose();
         
           


        }
    }//GEN-LAST:event_jtPacientesMousePressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
public static DefaultTableModel modelPac;
    private void CrearModeloPa(){
        try {
            modelPac = (new DefaultTableModel(
                null, new String [] {
                "Codigo","Nombre","Apellido","Direccion","Telefono","Edad","tipo"}){
               
            });
            this.jtPacientes.setModel(modelPac);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.toString()+"Error al consultar los datos");
        }
    }
    
    private void LlenarTabla()
    {
        int tipo=1;

        try{
            Object a[]=null;
            List<Paciente>Listapac;
            Listapac= te.findPacienteEntities();
            for (int i = 0; i < Listapac.size(); i++) {
                modelPac.addRow(a);
                modelPac.setValueAt(Listapac.get(i).getIdPaciente(),i, 0);
                modelPac.setValueAt(Listapac.get(i).getNombre(),i, 1);  
                modelPac.setValueAt(Listapac.get(i).getApellido(),i, 2);
                modelPac.setValueAt(Listapac.get(i).getDireccion(),i, 3);
                modelPac.setValueAt(Listapac.get(i).getTelefono(),i, 4);  
                modelPac.setValueAt(Listapac.get(i).getEdad(),i, 5);
                modelPac.setValueAt(Listapac.get(i).getIdTipop(),i, 6);
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
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
