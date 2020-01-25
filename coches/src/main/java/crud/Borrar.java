package crud;

import com.mycompany.coches.modelo.Cliente;
import com.mycompany.coches.modelo.Coche;
import com.mycompany.coches.modelo.CocheFavorito;
import com.mycompany.coches.modelo.Concesionario;
import com.mycompany.coches.modelo.Conexion;
import com.mycompany.coches.modelo.Fabricante;
import com.mycompany.coches.modelo.Venta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class Borrar {

    //Borrar cliente
    public static boolean bClientePorId(int id) {
        int cantidad = Listar.cantidadClienteVenta(id);
      
            EntityManager manager = Conexion.getConexion().getEmf();
            try {
                 if(cantidad >0){
                   throw  new Exception("cliente en uso");
                 }
                manager.getTransaction().begin(); 
                Cliente cliente =manager.find(Cliente.class, id);
                manager.remove(cliente);      
                manager.getTransaction().commit();
            } catch (Exception e) {
                manager.getTransaction().rollback();
                manager.close();
                return false;
            }
            manager.close();
       
        
        
        return true;
    }

    //Borrar coche
    public static boolean bCochePorId(int id) {
        int cantidad =Listar.cantidadVentaCocheId(id);
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            if(cantidad >0){
               throw  new Exception("coche en uso");
             }
            manager.getTransaction().begin();
            Coche coche  =manager.find(Coche.class, id);
            coche.setFabricante(null);
            manager.remove(coche);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }

    //Borrar cocheFavorito
    public static boolean bCocheFavoritoPorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            manager.getTransaction().begin();
            manager.remove(manager.find(CocheFavorito.class, id));
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }

    //Borrar Concesionario
    public static boolean bConcesionarioPorId(int id) {
        int cantidad = Listar.cantidadVentaConcesionarioId(id);
        System.out.println(cantidad);
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
             if(cantidad >0){
               throw  new Exception("concesionario en uso");
             }
             manager.getTransaction().begin();
            manager.remove(manager.find(Concesionario.class, id));
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }

    //Borrar fabricante
    public static boolean bFabricantePorId(int id) {
       int cantidad =Listar.cantidadCocheFabricante(id);
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
             if(cantidad >0){
               throw  new Exception("Fabricante en uso");
             }
            manager.getTransaction().begin();
            manager.remove(manager.find(Fabricante.class, id));
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }

    //Borrar venta
    public static boolean bVentaPorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        try {
            manager.getTransaction().begin();
            Venta v = manager.find(Venta.class, id);
            v.setCliente(null);
            v.setCoche(null);
            v.setConcesionario(null);
            manager.remove(v);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            manager.close();
            return false;
        }
        manager.close();
        return true;
    }

}
