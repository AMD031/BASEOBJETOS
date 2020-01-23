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
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

/**
 *
 * @author Antonio Martínez Díaz
 */
public class Listar {

        //Recuperar cliente
    public static Cliente rClientePorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        Cliente cliente = manager.find(Cliente.class, id);
        manager.close();
        return cliente;
    }

    public static List<Cliente> rclienteTodos() {
        TypedQuery<Cliente> consulta = Conexion.getConexion().getEmf().createNamedQuery("recupearTodoCliente", Cliente.class);
        List<Cliente> clientes = consulta.getResultList();
        Conexion.getConexion().getEmf().close();
        return clientes;
    }

    public static List<Cliente> rClienteCondicion(String fechaVenta, String CIFConcesionario, boolean ordenarClienteDesc) {
        TypedQuery<Cliente> consulta;
        List<Cliente> clientes;
        
        if(ordenarClienteDesc){
            consulta= Conexion.getConexion().getEmf().createNamedQuery("recuperarCriteriaConOrder", Cliente.class).setParameter("fechaVenta", fechaVenta).setParameter("CIFConcesionario", CIFConcesionario);
            clientes = consulta.getResultList();
        }
        else{
            consulta= Conexion.getConexion().getEmf().createNamedQuery("recuperarCriteriaSinOrder", Cliente.class).setParameter("fechaVenta", fechaVenta).setParameter("CIFConcesionario", CIFConcesionario);
            clientes = consulta.getResultList();
        }
        Conexion.getConexion().getEmf().close();
        return clientes;
    }
    
    
    
    //Recuperar coches
    public static Coche rCochePorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        Coche coche = manager.find(Coche.class, id);
        manager.close();
        return coche;
    }

    public static List<Coche> rCocheTodos() {
        TypedQuery<Coche> consulta = Conexion.getConexion().getEmf().createNamedQuery("recupearTodoCoche", Coche.class);
         List<Coche> coches = consulta.getResultList();
        Conexion.getConexion().getEmf().close();
        return coches;
    }

    //Recuperar cocheFavorito
    public static CocheFavorito rCocheFavoritoPorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        CocheFavorito coche = manager.find(CocheFavorito.class, id);
        manager.close();
        return coche;
    }

    public static List<CocheFavorito> rCocheFavoritoTodos() {
        TypedQuery<CocheFavorito> consulta = Conexion.getConexion().getEmf().createNamedQuery("recupearTodoCocheFavorito", CocheFavorito.class);
        List<CocheFavorito> cocheFavoritos=consulta.getResultList();
        Conexion.getConexion().getEmf().close();
        return cocheFavoritos;
    }

    //Recuperar Concesionario
    public static Concesionario rConcesionarioPorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        Concesionario concesionario = manager.find(Concesionario.class, id);
        manager.close();
        return concesionario;
    }

    public static List<Concesionario> rConcesionarioTodos() {
        TypedQuery<Concesionario> consulta = Conexion.getConexion().getEmf().createNamedQuery("recupearTodoConcesionario", Concesionario.class);
        List<Concesionario> concesionarios =consulta.getResultList();
        Conexion.getConexion().getEmf().close();
        return concesionarios;
    }



    //Recuperar Fabricante
    public static Fabricante rFabricantePorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        Fabricante fabricante = manager.find(Fabricante.class, id);
        manager.close();
        return fabricante;
    }

    public static List<Fabricante> rfabricanteTodos() {
        TypedQuery<Fabricante> consulta = Conexion.getConexion().getEmf().createNamedQuery("recupearTodoFabricante", Fabricante.class);
        List<Fabricante> fabricantes =consulta.getResultList();
        Conexion.getConexion().getEmf().close();
        return fabricantes;
    }
    
       public static List<Fabricante> rfabricanteTodosSinRepetir() {
        TypedQuery<Fabricante> consulta = Conexion.getConexion().getEmf().createNamedQuery("recupearTodoFabricanteSinrepetir", Fabricante.class);
        List<Fabricante> fabricantes =consulta.getResultList();
        Conexion.getConexion().getEmf().close();
        return fabricantes;
    }

    //Recuperar Venta   
    public static Venta rVentaPorId(int id) {
        EntityManager manager = Conexion.getConexion().getEmf();
        Venta venta = manager.find(Venta.class, id);
        manager.close();
        return venta;
    }

    public static List<Venta> rVentaTodos() {
        TypedQuery<Venta> consulta = Conexion.getConexion().getEmf().createNamedQuery("recupearTodoVenta", Venta.class);
        List<Venta> ventas =consulta.getResultList();
        Conexion.getConexion().getEmf().close();
        return ventas ;
    }

    public static List<Venta> rVentaTodosByCriteria(String dni, String concesionario, String fabricante, String modelo, boolean ordenAsc) {
        TypedQuery<Venta> consulta = null;
        if(ordenAsc){
            consulta = Conexion.getConexion().getEmf().createNamedQuery("filtroAvanzadoASC", Venta.class).setParameter("nombreFabricante", fabricante).setParameter("modeloCoche", modelo).setParameter("nombreConcesionario", concesionario).setParameter("dniCliente", dni);
        }
        else {
            consulta = Conexion.getConexion().getEmf().createNamedQuery("filtroAvanzadoDESC", Venta.class).setParameter("nombreFabricante", fabricante).setParameter("modeloCoche", modelo).setParameter("nombreConcesionario", concesionario).setParameter("dniCliente", dni);
        }
        List<Venta> ventas =consulta.getResultList();
        for(Venta v : ventas){
        System.out.println(v);
        }
        Conexion.getConexion().getEmf().close();
        return ventas ;
    }
    
    public static String cocheMasPopular(){
        String resultado = "";
        EntityManager manager2 = Conexion.getConexion().getEmf();       
        CriteriaBuilder builder = manager2.getCriteriaBuilder();
        CriteriaQuery<Tuple> criteria = builder.createQuery(Tuple.class);      
        Root<Cliente> root = criteria.from(Cliente.class);
        Expression orden =  builder.count(root);
        
        criteria.multiselect(root.get("cocheFavorito").get("marca"),root.get("cocheFavorito").get("modelo"), orden);
        criteria.groupBy(root.get("cocheFavorito").get("modelo"),root.get("cocheFavorito").get("marca"));
        criteria.orderBy(builder.desc(orden));
        
        List<Tuple> tuples = manager2.createQuery(criteria).setMaxResults(1).getResultList();
       for (Tuple tuple : tuples) {
            String marca= (String) tuple.get(0);
            String modelo =(String) tuple.get(1);
            Long cantidad = (Long) tuple.get(2);
            System.out.println(marca+"  "+modelo+" "+cantidad);
            resultado ="Marca "+marca+" modelo "+modelo+" es deseado por: "+cantidad+" persona/s";
        }
       return resultado;
    }
}
