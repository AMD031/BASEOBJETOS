/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import com.mycompany.coches.modelo.Cliente;
import com.mycompany.coches.modelo.Coche;
import com.mycompany.coches.modelo.CocheFavorito;
import com.mycompany.coches.modelo.Concesionario;
import com.mycompany.coches.modelo.Conexion;
import com.mycompany.coches.modelo.Fabricante;
import com.mycompany.coches.modelo.Venta;
import javax.jdo.annotations.Persistent;
import javax.persistence.EntityManager;

/**
 *
 * @author Antonio Martinez Diaz
 */
public class Crear {
    //Guardar Cliente    
    public static boolean gCliente(Cliente cliente) {
        
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            manager.getTransaction().begin();
            manager.persist(cliente); 
            manager.getTransaction().commit();
       
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }
    
     //Guardar Coche
       public static boolean gCoche(Coche coche, int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            manager.getTransaction().begin();
            
            Fabricante f = manager.find(Fabricante.class, id);
            f.addCoche(coche);
            manager.persist(coche);
            manager.getTransaction().commit();
     
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }
    
    //Guardar CocheFavorito
     public static boolean gCocheFavorito(CocheFavorito cocheFavorito) {
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            manager.getTransaction().begin();
            manager.persist(cocheFavorito);
            manager.getTransaction().commit();
  
        } catch (Exception e) {
            manager.getTransaction().rollback();
             manager.close();
            return false;
        }
         manager.close();
        return true;
    }
    
    // Guardar Concesionario
      public static boolean gConcesionario(Concesionario concesionario) {
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            manager.getTransaction().begin();
            manager.persist(concesionario);
            manager.getTransaction().commit();
      
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }
     
      // Guardar Fabricante
      public static boolean gFabricante(Fabricante fabricante) {
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            manager.getTransaction().begin();
            manager.persist(fabricante);
            manager.getTransaction().commit();
          
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    } 
  
     //Guardar Venta
      public static boolean gVenta(Venta venta, int idCoche, int idConcesionario, int idCliente){
      
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
          manager.getTransaction().begin(); 
          Coche coche = manager.find(Coche.class, idCoche);
          Concesionario concesionario = manager.find(Concesionario.class,idConcesionario);
          Cliente cliente = manager.find(Cliente.class,idCliente);
   
          if(coche !=null && concesionario !=null){
              coche.addVenta(venta);
              concesionario.addVentaCon(venta);
              coche.addVenta(venta);
              cliente.addVentaCli(venta);
              manager.persist(venta);
          }
          
       
           
           
            manager.getTransaction().commit();
          
        } catch (Exception e) {
                manager.getTransaction().rollback();
            return false;
        }
        manager.close();
        return true;
          
          
      }
      
      
     
     
    
    
    
    
    
    

}
