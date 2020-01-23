/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import com.mycompany.coches.modelo.Conexion;
import com.mycompany.coches.modelo.Venta;
import javax.persistence.EntityManager;
import Util.Utilidades;
import com.mycompany.coches.modelo.Cliente;
import com.mycompany.coches.modelo.Coche;
import com.mycompany.coches.modelo.CocheFavorito;
import com.mycompany.coches.modelo.Concesionario;


/**
 *
 * @author Antonio Martinez Diaz
 */
public class Actualizar {
      public static void actulizarCampoMo(int in, int campo, String cambio) {
       EntityManager manager = Conexion.getConexion().getEmf();   
       try{   
        manager.getTransaction().begin();
        Venta ve = manager.find(Venta.class, in);
        if (ve != null) {
            if (campo == Utilidades.FECHA) {
                ve.setFecha(cambio);
            }
            if (campo == Utilidades.PRECIO) {
                ve.setPrecio( Float.parseFloat(cambio));
            }
        }
        manager.getTransaction().commit();
        manager.close();
       }catch(Exception e){
           manager.getTransaction().rollback();
           manager.close();
       }

    }

    public static void actualizarVenta(Object object, int Campo,int id) {
       EntityManager manager = Conexion.getConexion().getEmf();   
       manager.getTransaction().begin();
       try{    
           
      if(object!=null){
        Venta venta=  manager.find(Venta.class, id);
        if(Campo == Utilidades.COCHE){     
          Coche coche =(Coche)object;
          venta.getCoche().setColor(coche.getColor());
          venta.getCoche().setBastidor(coche.getBastidor());
          venta.getCoche().setModelo(coche.getModelo());
          venta.getCoche().getFabricante().setCif(coche.getFabricante().getCif());
          venta.getCoche().getFabricante().setNombre(coche.getFabricante().getNombre());
          manager.persist(venta);
        }
        
        if(Campo == Utilidades.CONCESIONARIO){     
          Concesionario concesionario =(Concesionario)object;
          venta.getConcesionario().setCif(concesionario.getCif());
          venta.getConcesionario().setLocalidad(concesionario.getLocalidad());
          venta.getConcesionario().setNombre(concesionario.getNombre());
          manager.persist(venta);
        }
        if(Campo == Utilidades.CLIENTE){     
          Cliente cliente =(Cliente)object;
          
          venta.getCliente().setNombre(cliente.getNombre());
          venta.getCliente().setApellidos(cliente.getApellidos());
          venta.getCliente().setDniNie(cliente.getDniNie());
          venta.getCliente().setLocalidad(cliente.getLocalidad());
          venta.getCliente().setFecha(cliente.getFecha());
          venta.getCliente().setCocheFavorito(cliente.getCocheFavorito());
          
          manager.persist(venta);
        }
       }   
        
        
        manager.getTransaction().commit();
        manager.close();
       }catch(Exception e){

           manager.getTransaction().rollback();
           manager.close();
       }
        
        
        
    }

   
    
    
    
    
    
    
    
     
}
