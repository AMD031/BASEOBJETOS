/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Util.Utilidades;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Controlador.Controlador;
import com.mycompany.coches.modelo.Fabricante;
import com.mycompany.coches.modelo.Venta;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author Antonio Martinez Diaz
 */
public class TablaVentas extends javax.swing.JFrame implements MouseListener, TableModelListener {

    private ModeloTabla modelo;
    private static ArrayList<String> titulosList;
    private boolean ordenar;
    private List<Object> argumentos;
    // private static String busqueda; 
    //private static int campoBusqueda;
    //private DefaultTableModel modeleloResultado;

    /**
     * Creates new form TablaVentas
     */
    private void argumentosPorDefecto() {

        this.argumentos = new ArrayList<>();
        this.argumentos.add("");
        this.argumentos.add("");
        this.argumentos.add("");
        this.argumentos.add("");
        this.argumentos.add(true);
    }

    public TablaVentas() {
        initComponents();
        // Controlador.devolverVentasByCriteria(dni, concesionario, fabricante, modelo, ordenAsc)
        argumentosPorDefecto();
        cocheMasDesado.setText("");
        construirTabla(argumentos);
        tVentas.addMouseListener(this);
        tVentas.getModel().addTableModelListener(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tVentas = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        fDni = new javax.swing.JTextField();
        fConcesionario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fFabricante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fModelo = new javax.swing.JTextField();
        checkAscendente = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cocheMasDesado = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        crearCliente = new javax.swing.JMenuItem();
        crearFabricante = new javax.swing.JMenuItem();
        crearConsionario = new javax.swing.JMenuItem();
        crearCoche = new javax.swing.JMenuItem();
        crearVenta = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tVentas);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        fConcesionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fConcesionarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("DNI");

        fFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fFabricanteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Fabricante");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Modelo");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Concesionario");

        fModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fModeloActionPerformed(evt);
            }
        });

        checkAscendente.setText("Ascendente");
        checkAscendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAscendenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAscendente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fDni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fConcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fConcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(fFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(fModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkAscendente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Ventas");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Coche más deseado:");

        cocheMasDesado.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cocheMasDesado.setText("label1");

        jMenu2.setText("Gestionar");

        jMenu3.setText("Nuevo");

        crearCliente.setText("Cliente");
        crearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearClienteActionPerformed(evt);
            }
        });
        jMenu3.add(crearCliente);

        crearFabricante.setText("Fabricante");
        crearFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearFabricanteActionPerformed(evt);
            }
        });
        jMenu3.add(crearFabricante);

        crearConsionario.setText("Concesionario");
        crearConsionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearConsionarioActionPerformed(evt);
            }
        });
        jMenu3.add(crearConsionario);

        crearCoche.setText("Coche");
        crearCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCocheActionPerformed(evt);
            }
        });
        jMenu3.add(crearCoche);

        crearVenta.setText("Venta");
        crearVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearVentaActionPerformed(evt);
            }
        });
        jMenu3.add(crearVenta);

        jMenu2.add(jMenu3);

        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cocheMasDesado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cocheMasDesado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        cocheMasDesado.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearClienteActionPerformed
        JDialog a = emergenteA(0, "Nuevo Cliente");
        a.add(new FormularioCliente());
        emergeteB(a);        // TODO add your handling code here:
    }//GEN-LAST:event_crearClienteActionPerformed

    private void crearFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearFabricanteActionPerformed
        JDialog a = emergenteA(0, "Nuevo fabricate");
        a.add(new FormularioFabricante());
        emergeteB(a);        // TODO add your handling code here:
    }//GEN-LAST:event_crearFabricanteActionPerformed

    private void crearConsionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearConsionarioActionPerformed
        JDialog a = emergenteA(0, "Nuevo Concesionario");
        a.add(new FormularioConcesionario());
        emergeteB(a);
    }//GEN-LAST:event_crearConsionarioActionPerformed

    private void crearCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCocheActionPerformed
        JDialog a = emergenteA(0, "Nuevo Coche");
        a.add(new FormularioNuevoCoche());
        emergeteB(a);
    }//GEN-LAST:event_crearCocheActionPerformed

    private void crearVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearVentaActionPerformed
        JDialog a = emergenteA(0, "Nueva venta");
        a.add(new FormularioVenta());
        emergeteB(a);

    }//GEN-LAST:event_crearVentaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JDialog a = emergenteA(0, "Eliminar");
        a.add(new Eliminar());
        emergeteB(a);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void fConcesionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fConcesionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fConcesionarioActionPerformed

    private void fFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fFabricanteActionPerformed

    private void fModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fModeloActionPerformed

    private void checkAscendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAscendenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAscendenteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String dni = fDni.getText();
        String concesionario = fConcesionario.getText();
        String fabricante = fFabricante.getText();
        String modelo = fModelo.getText();
        boolean ordenAsc = checkAscendente.isSelected();

        System.out.println(ordenAsc);
        this.argumentos.set(0, dni);
        this.argumentos.set(1, concesionario);
        this.argumentos.set(2, fabricante);
        this.argumentos.set(3, modelo);
        this.argumentos.set(4, ordenAsc);

        construirTabla(this.argumentos);
        restaurarEscucha();


    }//GEN-LAST:event_btnBuscarActionPerformed

    public void construirTabla(List<Object> argumentos) {
        titulosList = new ArrayList<>();
        titulosList.add("Id");
        titulosList.add("Fecha");
        titulosList.add("Precio");
        titulosList.add("");
        titulosList.add("");
        titulosList.add("");
        titulosList.add("");

        String titulos[] = new String[titulosList.size()];
        for (int i = 0; i < titulos.length; i++) {
            titulos[i] = titulosList.get(i);
        }

        Object[][] data = obtenerMatrizDatos(titulosList, argumentos);
        construirTabla(titulos, data);

        cocheMasDesado.setText(Controlador.devolverCocheMasDeseado());
    }

    private Object[][] obtenerMatrizDatos(ArrayList<String> titulosList, List<Object> argumentos) {
        // Controlador.devolverVentasByCriteria(dni, concesionario, fabricante, modelo, ordenAsc)

        List<Venta> ventasResultado = Controlador.devolverVentasByCriteria(
                (String) argumentos.get(0),
                (String) argumentos.get(1),
                (String) argumentos.get(2),
                (String) argumentos.get(3),
                (boolean) argumentos.get(4));
        String informacion[][] = new String[ventasResultado.size()][titulosList.size()];

        for (int x = 0; x < informacion.length; x++) {
            informacion[x][Utilidades.ID] = ventasResultado.get(x).getId() + "";
            informacion[x][Utilidades.FECHA] = ventasResultado.get(x).getFecha() + "";
            informacion[x][Utilidades.PRECIO] = ventasResultado.get(x).getPrecio() + "";
            informacion[x][Utilidades.COCHE] = "COCHE";
            informacion[x][Utilidades.CONCESIONARIO] = "CONCESIONARIO";
            informacion[x][Utilidades.CLIENTE] = "CLIENTE";
            informacion[x][Utilidades.ELIMINAR] = "ELIMINAR";
        }
        return informacion;
    }

    public void restaurarEscucha() {
        tVentas.getModel().removeTableModelListener(this);
        tVentas.getModel().addTableModelListener(this);
    }

    private void construirTabla(String[] titulos, Object[][] data) {
        modelo = new ModeloTabla(data, titulos);
        tVentas.setModel(modelo);
        tVentas.getColumnModel().getColumn(Utilidades.COCHE).setPreferredWidth(100);
        tVentas.getColumnModel().getColumn(Utilidades.CLIENTE).setPreferredWidth(100);
        tVentas.getColumnModel().getColumn(Utilidades.CONCESIONARIO).setPreferredWidth(130);
        tVentas.getColumnModel().getColumn(Utilidades.ELIMINAR).setPreferredWidth(130);
        tVentas.getColumnModel().getColumn(Utilidades.COCHE).setCellRenderer(new GestionCeldas("icono"));
        tVentas.getColumnModel().getColumn(Utilidades.CLIENTE).setCellRenderer(new GestionCeldas("icono"));
        tVentas.getColumnModel().getColumn(Utilidades.CONCESIONARIO).setCellRenderer(new GestionCeldas("icono"));
        tVentas.getColumnModel().getColumn(Utilidades.ELIMINAR).setCellRenderer(new GestionCeldas("icono"));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TablaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JCheckBox checkAscendente;
    private java.awt.Label cocheMasDesado;
    private javax.swing.JMenuItem crearCliente;
    private javax.swing.JMenuItem crearCoche;
    private javax.swing.JMenuItem crearConsionario;
    private javax.swing.JMenuItem crearFabricante;
    private javax.swing.JMenuItem crearVenta;
    private javax.swing.JTextField fConcesionario;
    private javax.swing.JTextField fDni;
    private javax.swing.JTextField fFabricante;
    private javax.swing.JTextField fModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tVentas;
    // End of variables declaration//GEN-END:variables

    private int idTabla(int fila) {
        String id = (String) modelo.getValueAt(fila, 0);
        int Id = Integer.parseInt(id);
        return Id;
    }

    private JDialog emergenteA(int fila, String titulo) {
        if (fila > 0) {
            int id = idTabla(fila);
        }
        JDialog frame = new JDialog(this, titulo, true);
        frame.setLocation(this.getX(), this.getY());
        return frame;
    }

    private void emergeteB(JDialog frame) {
        frame.pack();
        frame.setVisible(true);
        construirTabla(this.argumentos);
        restaurarEscucha();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int fila = tVentas.rowAtPoint(e.getPoint());
        int columna = tVentas.columnAtPoint(e.getPoint());
        int id = idTabla(fila);
        switch (columna) {
            case Utilidades.COCHE: {
                JDialog a = emergenteA(fila, "Editar coche");
                a.add(new FormularioCoche(id));
                emergeteB(a);
                break;
            }
            case Utilidades.CONCESIONARIO: {
                JDialog a = emergenteA(fila, "Editar Concesionario");
                a.add(new FormularioConcesionario(id));
                emergeteB(a);
                break;
            }
            case Utilidades.CLIENTE: {
                JDialog a = emergenteA(fila, "Editar Cliente");
                a.add(new FormularioCliente(id));
                emergeteB(a);
                break;
            }
            case Utilidades.ELIMINAR:
                Controlador.eliminarVenta(id);
                construirTabla(this.argumentos);
                break;
            default:
                break;
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

    private void actualizaCelda(TableModelEvent e) {
        String id = (String) modelo.getValueAt(e.getFirstRow(), 0);
        System.out.println(modelo.getValueAt(e.getFirstRow(), 0));
        int Id = Integer.parseInt(id);
        String cambio = (String) modelo.getValueAt(e.getFirstRow(), e.getColumn());
        Controlador.actualizarMo(Id, (Integer.valueOf(e.getColumn())), cambio);
    }

  

    @Override
    public void tableChanged(TableModelEvent e) {
        String Cambio = (String) modelo.getValueAt(e.getFirstRow(), e.getColumn());
        if (e.getColumn() == Utilidades.FECHA) {
            if (Utilidades.validarFecha(Cambio)) {
                actualizaCelda(e);
            } else {
                Utilidades.errorTextoDialog("Fecha erronea",this);
                construirTabla(this.argumentos);
                restaurarEscucha();
            }
        } else if (e.getColumn() == Utilidades.PRECIO) {
            if (Utilidades.esNumerico(Cambio)) {
                actualizaCelda(e);
            } else {
                Utilidades.errorTextoDialog("No se puede introducir letras en este campo.",this);
                construirTabla(this.argumentos);
                restaurarEscucha();
            }
        }

    }

}
