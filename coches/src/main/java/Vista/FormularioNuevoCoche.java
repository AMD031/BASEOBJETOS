/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import com.mycompany.coches.modelo.Coche;
import com.mycompany.coches.modelo.Fabricante;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Antonio Martínez Díaz
 */
public class FormularioNuevoCoche extends javax.swing.JPanel implements MouseListener {

    /**
     * Creates new form FormularioNuevoCoche2
     */
    
    private int idFabricante;
    private DefaultTableModel modelo ;
    public FormularioNuevoCoche() {
        initComponents();
        modelo  = (DefaultTableModel)tablaFabricante.getModel();
        tablaFabricante.addMouseListener(this);
        inicializarTabla();
        idFabricante= 0;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFabricante = new javax.swing.JTable();
        Color1 = new javax.swing.JLabel();
        Bastidor = new javax.swing.JLabel();
        fNombre = new javax.swing.JTextField();
        fColor = new javax.swing.JTextField();
        fModelo = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        fCif = new javax.swing.JTextField();
        Modelo = new javax.swing.JLabel();
        Color = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fBastidor = new javax.swing.JTextField();
        Modelo1 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nuevo Coche:");

        tablaFabricante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cif", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaFabricante);

        Color1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Color1.setText("Nombre");

        Bastidor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bastidor.setText("Bastidor");

        fNombre.setEditable(false);
        fNombre.setBackground(new java.awt.Color(204, 204, 204));
        fNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNombreActionPerformed(evt);
            }
        });

        fColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fColorActionPerformed(evt);
            }
        });

        fModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fModeloActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        fCif.setEditable(false);
        fCif.setBackground(new java.awt.Color(204, 204, 204));
        fCif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fCifActionPerformed(evt);
            }
        });

        Modelo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Modelo.setText("Modelo");

        Color.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Color.setText("Color");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Editar fabricante coche:");

        Modelo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Modelo1.setText("Cif");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bastidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Modelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(6, 6, 6))
                                    .addComponent(Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(fBastidor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fColor))
                                .addGap(51, 51, 51))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Guardar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Color1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Modelo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(166, 166, 166)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fCif)
                                            .addComponent(fNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(53, 53, 53)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fBastidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bastidor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modelo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Color)
                    .addComponent(fColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modelo1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Color1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Guardar)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNombreActionPerformed

    private void fColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fColorActionPerformed

    private void fModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fModeloActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Coche cocheEditado = new Coche();
     
        boolean noEnBlanco = false;
        if(!fModelo.getText().equals("")
        && !fColor.getText().equals("")
        && !fBastidor.getText().equals("")
        && !fCif.getText().equals("")
        && !fNombre.getText().equals("")){
              noEnBlanco = true;
        }
        
        if(noEnBlanco){
            cocheEditado.setModelo(fModelo.getText());
            cocheEditado.setColor(fColor.getText());
            cocheEditado.setBastidor(fBastidor.getText());
            Controlador.crearCoche(cocheEditado, this.idFabricante);
        }else{
            Util.Utilidades.errorTextoDialog("Rellena todos los campos", this);
        }
       

    }//GEN-LAST:event_GuardarActionPerformed

    private void fCifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fCifActionPerformed
       
    }//GEN-LAST:event_fCifActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bastidor;
    private javax.swing.JLabel Color;
    private javax.swing.JLabel Color1;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel Modelo;
    private javax.swing.JLabel Modelo1;
    private javax.swing.JTextField fBastidor;
    private javax.swing.JTextField fCif;
    private javax.swing.JTextField fColor;
    private javax.swing.JTextField fModelo;
    private javax.swing.JTextField fNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaFabricante;
    // End of variables declaration//GEN-END:variables

  private void inicializarTabla() {

    List<Fabricante>fabricantes = Controlador.devolverFabricantesSinRepetir();
          for ( Fabricante fabricante : fabricantes) {
            if(fabricante !=null){
               modelo.addRow(new Object[]{fabricante.getId(),fabricante.getCif(),fabricante.getNombre()}); 
            }
        }

        
    }
    
    
     private int idTabla(int fila) {
       int Id = (int) modelo.getValueAt(fila, 0);
       return Id;
    }
     
    @Override
    public void mouseClicked(MouseEvent e) {
      int fila = tablaFabricante.rowAtPoint(e.getPoint());
      int id = idTabla(fila);
      if(id >0){
       Fabricante fabricante =Controlador.obtenerFabricante(id);
       if(fabricante!=null){
           idFabricante = id;
          fCif.setText(fabricante.getCif());
          fNombre.setText(fabricante.getNombre());
       }
      }
      
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
       //To change body of generated methods, choose Tools | Templates.
    }

   
}
