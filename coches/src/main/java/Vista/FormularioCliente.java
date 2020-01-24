/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.Controlador;
import Util.Utilidades;
import com.mycompany.coches.modelo.Cliente;
import com.mycompany.coches.modelo.CocheFavorito;
import com.mycompany.coches.modelo.Venta;

/**
 *
 * @author Antonio Martínez Díaz
 */
public class FormularioCliente extends javax.swing.JPanel {
    /**
     * Creates new form FormularioCliente
     */
    private int id;
    private Cliente cliente;
    private CocheFavorito cocheFavorito;
    private boolean nuevo;
    public FormularioCliente(int id) {
      initComponents();
      this.id = id;
      inicializaObjetos();
      volcarDatosCoche();
      nuevo = false;
  
    }
    
    
    public FormularioCliente() {
      initComponents();
      this.fIdCliente.setVisible(false);
      this.idLabel.setVisible(false);
      nuevo = true;
    }
    private  void inicializaObjetos(){
       Venta venta = Controlador.obtenerVenta(id);
       if(venta !=null){
         this.cliente =  Controlador.obtenerVenta(id).getCliente();  
       }       
       if(this.cliente!=null){
           this.cocheFavorito = cliente.getCocheFavorito();
       }        
    }
    private void volcarDatosCoche(){
  
      if(cliente != null){
       fIdCliente.setText(Integer.toString(cliente.getId()));
       fNombre.setText(cliente.getNombre());
       fApellidos.setText(cliente.getApellidos());
       fLocalidad.setText(cliente.getLocalidad());
       fDni.setText(cliente.getDniNie());
       fFecha.setText(cliente.getFecha());
       marcaFavorito.setText(cliente.getCocheFavorito().getMarca());
       modeloFavorito.setText(cliente.getCocheFavorito().getModelo());
       
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

        idLabel = new javax.swing.JLabel();
        fIdCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fNombre = new javax.swing.JTextField();
        Bastidor = new javax.swing.JLabel();
        Bastidor1 = new javax.swing.JLabel();
        fApellidos = new javax.swing.JTextField();
        fLocalidad = new javax.swing.JTextField();
        Bastidor2 = new javax.swing.JLabel();
        Bastidor3 = new javax.swing.JLabel();
        fDni = new javax.swing.JTextField();
        fFecha = new javax.swing.JTextField();
        Bastidor4 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Bastidor5 = new javax.swing.JLabel();
        Bastidor6 = new javax.swing.JLabel();
        marcaFavorito = new javax.swing.JTextField();
        modeloFavorito = new javax.swing.JTextField();

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idLabel.setText("Id");

        fIdCliente.setEditable(false);
        fIdCliente.setBackground(new java.awt.Color(204, 204, 204));
        fIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fIdClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Editar Cliente:");

        Bastidor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bastidor.setText("Nombre");

        Bastidor1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bastidor1.setText("Apellidos");

        Bastidor2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bastidor2.setText("Localidad");

        Bastidor3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bastidor3.setText("Dni");

        Bastidor4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bastidor4.setText("Fecha Nacimiento");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Coche deseado:");

        Bastidor5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bastidor5.setText("Modelo");

        Bastidor6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bastidor6.setText("Marca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bastidor6)
                            .addComponent(Bastidor5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(marcaFavorito, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(modeloFavorito))
                        .addGap(140, 140, 140))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bastidor)
                                    .addComponent(Bastidor1)
                                    .addComponent(Bastidor2)
                                    .addComponent(Bastidor3)
                                    .addComponent(Bastidor4))
                                .addGap(24, 24, 24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addComponent(fApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fLocalidad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fDni, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fIdCliente))
                        .addGap(139, 139, 139))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bastidor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bastidor1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bastidor2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bastidor3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bastidor4))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bastidor6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modeloFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bastidor5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(guardar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fIdClienteActionPerformed
    Controlador.actualizarMo(id, WIDTH, TOOL_TIP_TEXT_KEY);
    }//GEN-LAST:event_fIdClienteActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
    
        Cliente clienteEditado = new Cliente();
        CocheFavorito cocheFavorito = new CocheFavorito();
        clienteEditado.setNombre(fNombre.getText());
        clienteEditado.setApellidos(fApellidos.getText());
        clienteEditado.setDniNie(fDni.getText());
        clienteEditado.setLocalidad(fLocalidad.getText());
        clienteEditado.setFecha(fFecha.getText());
        cocheFavorito.setId(this.cocheFavorito.getId());
        cocheFavorito.setMarca(marcaFavorito.getText());
        cocheFavorito.setModelo(modeloFavorito.getText());
        clienteEditado.setCocheFavorito(cocheFavorito);  
      
        
        
        if(nuevo){
            Controlador.crear(Utilidades.CLIENTE,  clienteEditado);
      
        }

        if(!nuevo){
          Controlador.actualizarVentaObjeto(clienteEditado,Utilidades.CLIENTE, id);
        }
       
        
    }//GEN-LAST:event_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bastidor;
    private javax.swing.JLabel Bastidor1;
    private javax.swing.JLabel Bastidor2;
    private javax.swing.JLabel Bastidor3;
    private javax.swing.JLabel Bastidor4;
    private javax.swing.JLabel Bastidor5;
    private javax.swing.JLabel Bastidor6;
    private javax.swing.JTextField fApellidos;
    private javax.swing.JTextField fDni;
    private javax.swing.JTextField fFecha;
    private javax.swing.JTextField fIdCliente;
    private javax.swing.JTextField fLocalidad;
    private javax.swing.JTextField fNombre;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField marcaFavorito;
    private javax.swing.JTextField modeloFavorito;
    // End of variables declaration//GEN-END:variables
}
