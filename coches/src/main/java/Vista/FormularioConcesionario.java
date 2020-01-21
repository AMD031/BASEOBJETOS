/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.mycompany.coches.modelo.Concesionario;
import Controlador.Controlador;
import Util.Utilidades;
import com.mycompany.coches.modelo.Venta;
/**
 *
 * @author Antonio Martínez Díaz
 */
public class FormularioConcesionario extends javax.swing.JPanel {

    /**
     * Creates new form FormularioConcesionario
     */
    
    
    private int id;
    private Concesionario concesionario;
    private boolean nuevo;
    
    public FormularioConcesionario(int id) {
        initComponents();
        this.id = id;
        this.concesionario = Controlador.obtenerVenta(id).getConcesionario();
        volcarDatosCoche();
        nuevo = false;
    }

    public FormularioConcesionario() {
        initComponents();
        nuevo = true;
        fId.setVisible(false);
        idLabel.setVisible(false);
    }
    
     
    
    

        private void volcarDatosCoche(){
  
      if(this.concesionario != null){
       fId.setText(Integer.toString(this.concesionario.getId()));
       fCif.setText(this.concesionario.getCif());
       fLocalidad.setText(this.concesionario.getLocalidad());
       fNombre.setText(concesionario.getNombre()); 
       
      }   

    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fId = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fCif = new javax.swing.JTextField();
        fNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fLocalidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Editar Concesionario:");

        fId.setEditable(false);
        fId.setBackground(new java.awt.Color(204, 204, 204));
        fId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fIdActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idLabel.setText("Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Cif");

        fCif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fCifActionPerformed(evt);
            }
        });

        fNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nombre");

        fLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fLocalidadActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Localidad");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(438, 438, 438))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fNombre)
                            .addComponent(fCif, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fLocalidad))
                        .addGap(104, 104, 104))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(guardar)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fIdActionPerformed

    private void fCifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fCifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fCifActionPerformed

    private void fNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNombreActionPerformed

    private void fLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fLocalidadActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
          
        
          Concesionario concesionarioEditado = new Concesionario();
          concesionarioEditado.setCif(fCif.getText());
          concesionarioEditado.setLocalidad(fLocalidad.getText());
          concesionarioEditado.setNombre(fNombre.getText());
        
        if(!nuevo){
          Controlador.actualizarVentaObjeto(concesionarioEditado,Utilidades.CONCESIONARIO, id);
        }
        
        if(nuevo){
            Controlador.crear(Utilidades.CONCESIONARIO,concesionarioEditado );
        }
        
        
        
    }//GEN-LAST:event_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fCif;
    private javax.swing.JTextField fId;
    private javax.swing.JTextField fLocalidad;
    private javax.swing.JTextField fNombre;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}