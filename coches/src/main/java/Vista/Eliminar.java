/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import com.mycompany.coches.modelo.Cliente;
import com.mycompany.coches.modelo.Coche;
import com.mycompany.coches.modelo.Concesionario;
import com.mycompany.coches.modelo.Fabricante;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Antonio Martínez Díaz
 */
public class Eliminar extends javax.swing.JPanel implements MouseListener,TableModelListener{
    private DefaultTableModel modeloCliente;
    private DefaultTableModel modeloConcesionario;
    private DefaultTableModel modeloCoche;
    private DefaultTableModel modeloFabricante;
    private int idCoche;
    private int idConcesionario;
    private int idCliente;
    private int idFabricante;

    /**
     * Creates new form Eliminar
     */
    public Eliminar() {
        initComponents();
        modeloCoche  = (DefaultTableModel)tablaCoche.getModel();
        modeloConcesionario = (DefaultTableModel)tablaConcesionario.getModel();
        modeloCliente = (DefaultTableModel)tablaCliente.getModel();
        modeloFabricante  = (DefaultTableModel)tablaFabricante.getModel();
        this.tablaCliente.addMouseListener(this);
        this.tablaConcesionario.addMouseListener(this);
        this.tablaCoche.addMouseListener(this);
        this.tablaFabricante.addMouseListener(this);
        this.inicializarTablaCoches();
        this.inicializarTablaConcesionarios();
        this.inicializarTablaClientes();
        this.inicializarTablaFabricante();
        this.idCliente=0;
        this.idCoche=0;
        this.idConcesionario=0;
        this.idFabricante =0;
    }

     private void inicializarTablaCoches() {
    List<Coche>coches = Controlador.devolverCoches();
          for (Coche coche : coches) {
            if(coche !=null){
               modeloCoche.addRow(new Object[]{coche.getId(),coche.getBastidor(),coche.getModelo(),coche.getColor()}); 
            }
        }       
    }
    
   private void inicializarTablaConcesionarios(){
    List<Concesionario>concesionarios = Controlador.devolverConcesionarios();
          for (Concesionario concesionario :concesionarios) {
            if(concesionario!=null){
               modeloConcesionario.addRow(new Object[]{concesionario.getId(),concesionario.getCif(),concesionario.getLocalidad(),concesionario.getNombre()}); 
            }
        }       
    }
    
   private void inicializarTablaClientes(){
    List<Cliente>clientes = Controlador.devolverClientes();
          for (Cliente cliente :clientes) {
            if(cliente !=null){
             modeloCliente.addRow(new Object[]{cliente.getId(),
                 cliente.getNombre(),cliente.getApellidos(),
                 cliente.getLocalidad(),cliente.getDniNie(),cliente.getFecha()}); 
            }
        }       
    }
    
    private void inicializarTablaFabricante() {
    List<Fabricante>fabricantes = Controlador.devolverFabricantesSinRepetir();
          for ( Fabricante fabricante : fabricantes) {
            if(fabricante !=null){
               modeloFabricante.addRow(new Object[]{fabricante.getId(),fabricante.getCif(),fabricante.getNombre()}); 
            }
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        eliminarCoche = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaConcesionario = new javax.swing.JTable();
        eliminarConcesionario = new javax.swing.JButton();
        eliminarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaCoche = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFabricante = new javax.swing.JTable();
        eliminarFabricante = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        eliminarCoche.setText("Eliminar Coche");
        eliminarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCocheActionPerformed(evt);
            }
        });

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellidos", "Localidad", "Dni", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaCliente);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Seleciona un cliente");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Seleciona un concesionario");

        tablaConcesionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cif", "Nombre", "Localidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaConcesionario);

        eliminarConcesionario.setText("Eliminar Concesionario");
        eliminarConcesionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarConcesionarioActionPerformed(evt);
            }
        });

        eliminarCliente.setText("Eliminar Cliente");
        eliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Seleciona un Fabricante");

        tablaCoche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Bastidor", "Modelo", "Color"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablaCoche);

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

        eliminarFabricante.setText("Eliminar Fabricate");
        eliminarFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFabricanteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Seleciona un coche");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarCliente))
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarConcesionario))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarCoche))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarFabricante)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eliminarCliente)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(eliminarConcesionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(eliminarCoche))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eliminarFabricante)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClienteActionPerformed
        Controlador.eliminarCliente(this.idCliente);
         modeloCliente.removeRow(tablaCliente.getSelectionModel().getLeadSelectionIndex());
    }//GEN-LAST:event_eliminarClienteActionPerformed

    private void eliminarConcesionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarConcesionarioActionPerformed
        Controlador.eliminarConcesionario(this.idConcesionario);
        modeloConcesionario.removeRow(tablaConcesionario.getSelectionModel().getLeadSelectionIndex());
     
    }//GEN-LAST:event_eliminarConcesionarioActionPerformed

    private void eliminarCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCocheActionPerformed
       Controlador.eliminarCoche(this.idCoche);
       modeloCoche.removeRow(tablaCoche.getSelectionModel().getLeadSelectionIndex());
    
    }//GEN-LAST:event_eliminarCocheActionPerformed

    private void eliminarFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFabricanteActionPerformed
       Controlador.eliminarFabricante(this.idFabricante);
       modeloFabricante.removeRow(tablaFabricante.getSelectionModel().getLeadSelectionIndex());
    }//GEN-LAST:event_eliminarFabricanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminarCliente;
    private javax.swing.JButton eliminarCoche;
    private javax.swing.JButton eliminarConcesionario;
    private javax.swing.JButton eliminarFabricante;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTable tablaCoche;
    private javax.swing.JTable tablaConcesionario;
    private javax.swing.JTable tablaFabricante;
    // End of variables declaration//GEN-END:variables

    
    
    
       private int idTabla(DefaultTableModel modelo,JTable tabla,MouseEvent e) {
       int fila = tabla.rowAtPoint(e.getPoint()); 
       int Id = (int) modelo.getValueAt(fila, 0);
       return Id;
    }

     
    
    private void clienteClicado(MouseEvent e){
      int id =  idTabla(modeloCliente,tablaCliente,e); 
      if(id >0){
       this.idCliente =id;
          System.out.println(id);
      }
    }
    
    private void concesionarioClicado(MouseEvent e){
      int id =  idTabla(modeloConcesionario,tablaCliente,e);
      if(id >0){
          this.idConcesionario = id;
      }
    }
    
    private void cocheClicado(MouseEvent e){   
      int id =  idTabla(modeloCoche,tablaCoche,e);
      if(id >0){
          this.idCoche =id;
       }
      }
  
    private void fabricanteClicado(MouseEvent e){
       int id =  idTabla(modeloFabricante,tablaFabricante,e);
         if(id >0){
             this.idFabricante = id;
       }   
    }
    
   
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == tablaCliente){
           clienteClicado(e);  
        }

        if(e.getSource() == tablaConcesionario){
            concesionarioClicado(e);
        }
       
        if(e.getSource() == tablaCoche){
            cocheClicado(e);
        }
        
        if(e.getSource()== tablaFabricante){
            fabricanteClicado(e);
        }
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
      
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        
    }
}
