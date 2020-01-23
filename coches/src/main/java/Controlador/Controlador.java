/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package Controlador;

import Util.Utilidades;
import com.mycompany.coches.modelo.Cliente;
import com.mycompany.coches.modelo.Coche;
import com.mycompany.coches.modelo.Concesionario;
import com.mycompany.coches.modelo.Fabricante;
import crud.*;
import com.mycompany.coches.modelo.Venta;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;


/**
 *
 * @author Your Name <Antonio Martinez Diaz>
 */
public class Controlador {

    public static List<Venta> devolverVentas() {
        return  Listar.rVentaTodos();
    }

    public static List<Venta> devolverVentasByCriteria(String dni, String concesionario, String fabricante, String modelo, boolean ordenAsc) {
        return  Listar.rVentaTodosByCriteria(dni, concesionario, fabricante, modelo, ordenAsc);
    }
      
      
       public static String obtenerCampoMo(String campo, int indice) {
        String resultado = "";

        if (campo.equals("id")) {
            resultado = Listar.rVentaTodos().get(indice).getId() + "";
        }

        if (campo.equals("fecha")) {
            resultado = Listar.rVentaTodos().get(indice).getFecha()+ "";
        }
        
        if (campo.equals("precio")) {
            resultado = Listar.rVentaTodos().get(indice).getPrecio()+ "";
        }
        return resultado;
    }

    public static void actualizarMo(int in, int campo, String cambio) {
        Actualizar.actulizarCampoMo(in, campo, cambio);       
    }

    public static Venta obtenerVenta(int id) {
       return Listar.rVentaPorId(id);
    }
    
    
     public static Coche obtenerCoche(int id){
          return Listar.rCochePorId(id);
      }

    public static void actualizarVentaObjeto(Object object, int campo,int id) {
        Actualizar.actualizarVenta(object,campo,id);
    }
    
   public static boolean crearVenta(Venta venta, int idCoche, int idConcesionario, int idCliente){
       return Crear.gVenta(venta, idCoche, idConcesionario, idCliente);
   }
    
   public static boolean crearCoche(Coche coche,int id){
     return Crear.gCoche(coche,id);
   }

    public static boolean crear(int campo, Object object) {
        boolean resultado = false;
      
          switch (campo) {
              case Utilidades.CLIENTE:
                  Cliente cliente = (Cliente)object;
                 resultado = Crear.gCliente(cliente);
                  break;
              case Utilidades.CONCESIONARIO:
                  Concesionario concesionario = (Concesionario)object;
                   resultado =   Crear.gConcesionario(concesionario);
                  break;
                  
              case Utilidades.FABRICANTE:
                    Fabricante fabricante = (Fabricante)object;
                      resultado =  Crear.gFabricante(fabricante);
                  break;      
          }
                     
        return resultado;
    }
    
    public static List<Fabricante>devolverFabricantesSinRepetir(){
    return Listar.rfabricanteTodosSinRepetir();
    }

    public static Fabricante obtenerFabricante(int id) {
       return Listar.rFabricantePorId(id);
    }

    public static List<Coche> devolverCoches() {
       return Listar.rCocheTodos();
    }

    public static List<Concesionario> devolverConcesionarios() {
      return Listar.rConcesionarioTodos();
    }

    public static List<Cliente> devolverClientes() {
       return Listar.rclienteTodos();
    }

    public static Cliente obtenerCliente(int id) {
      return Listar.rClientePorId(id);
    }

    public static Concesionario obtenerConcesioanrio(int id) {
        return Listar.rConcesionarioPorId(id);
    }
    //eliminar
    public static boolean eliminarVenta(int id) {
     
       return Borrar.bVentaPorId(id);
    }

    public static boolean eliminarCoche(int id) {
       return Borrar.bCochePorId(id);
    }

    public static boolean eliminarConcesionario(int id) {
      return Borrar.bConcesionarioPorId(id);
    }

    public static boolean eliminarCliente(int id) {
      return Borrar.bClientePorId(id);
    }

    public static boolean eliminarFabricante(int id) {
        return Borrar.bFabricantePorId(id);
    }

    public static String devolverCocheMasDeseado() {
        return Listar.cocheMasPopular();
    }

 
    
  
  

  


  
    
    
}
