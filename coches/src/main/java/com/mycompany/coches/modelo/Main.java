/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coches.modelo;


import javax.persistence.EntityManager;


/**
 *
 * @author Antonio Martínez Díaz
 */
public class Main {

    public static void main(String[] args) {

        EntityManager manager = Conexion.getConexion().getEmf();
        manager.getTransaction().begin();

        Cliente cli1 = new Cliente("Pedro", "Perez", "Cordoba",  "12345678Z", "01-01-1990");
        Cliente cli2 = new Cliente("Maria", "Prieto", "MAdrid",  "87654321X", "01-01-1999");
        Cliente cli3 = new Cliente("Juan",  "Prieto", "Jaen",    "21635656Q", "01-01-1999");
        Cliente cli4 = new Cliente("Susana",  "Diaz", "Sevilla", "56679842E", "01-01-1999");
       
        Concesionario con1 = new Concesionario("123A", "Concesionario uno", "Cordoba");
        Concesionario con2 = new Concesionario("321A", "Concesionario dos", "Sevilla");
        Concesionario con3 = new Concesionario("321A", "Concesionario tres", "Madrid");
        
        Coche co1 = new Coche("AAA112", "307", "azul");
        Coche co2 = new Coche("BBB112", "Clio", "rojo");
        Coche co3 = new Coche("BBA156", "Seat", "negro");
        
        co1.setFabricante(new Fabricante("FAB1", "Peugeot SA"));
        co2.setFabricante(new Fabricante("FAB2", "Renault SA"));
        co3.setFabricante(new Fabricante("FXDD","Seat SA"));
        
        cli1.setCocheFavorito(new CocheFavorito("Ferrari", "458 Italia"));
        cli2.setCocheFavorito(new CocheFavorito("Ford", "Mondeo"));
        cli3.setCocheFavorito(new CocheFavorito("Ford", "Mondeo"));
        //cli4.setCocheFavorito(new CocheFavorito("Audi","TT"));
        
        Venta ven1 = new Venta("22-01-2020", 4500);
        Venta ven2 = new Venta("08-10-2019", 9000);
        Venta ven3 = new Venta("08-11-2019", 9200);
  
        
       // ven1.setCoche(co1);
       // ven2.setCoche(co2);
       co1.addVenta(ven1);
       co2.addVenta(ven2);
       co3.addVenta(ven3);
       
        
        con1.addVentaCon(ven1);
        con2.addVentaCon(ven2);
        con3.addVentaCon(ven3);
        
        cli1.addVentaCli(ven1);
        cli2.addVentaCli(ven2);
        cli3.addVentaCli(ven3);
        
        
        manager.persist(cli1);
        manager.persist(cli2);
        manager.persist(cli3);
        manager.persist(cli4);
        
        manager.persist(con1);
        manager.persist(con2);
        manager.persist(con3);
        
        manager.persist(co1);
        manager.persist(co2);
        manager.persist(co3);
        
       /* manager.persist(ven1);
        manager.persist(ven2);
        manager.persist(ven3);*/
        
        manager.getTransaction().commit();
        manager.close();
   /*      for(Coche cochec : Listar.rCocheTodos()){
            System.out.println(cochec);
        }*/
   
   
   
   
   
   
   
      //coche mas popular
    /*    EntityManager manager2 = Conexion.getConexion().getEmf();       
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
        }*/
        //fin conculta
    
    
    
    
    
    
    
    
        /*TypedQuery<CocheFavorito> tq = manager2.createQuery(q);
        List<CocheFavorito> coches = tq.getResultList();
         q.groupBy(c.get("cocheFavorito").get("modelo"));
        for (CocheFavorito coche : coches) {
            System.out.println(coche);
        }*/
        // System.out.println(Controlador.Controlador.obtenerCampoMo("id",1));
        // nombre fabricante, modelo coche, nombre concesionario, dni cliente
        /*
       
       select v from Fabricante fab, Coche co, Concesionario con, Cliente cli, Venta v
        where fab.id=co.fabricante.id AND co.ventas.id=v.id AND
        con.ventasCon.id=v.id AND cli.ventasCli.id=v.id
       
       
       select v from Fabricante fab, Coche co, Concesionario con, Cliente cli, Venta v
        where fab.id=co.fabricante.id AND co.id=v.coche.id AND
        cli.id=v.cliente.id AND con.id=v.concesionario.id AND
        fab.nombre LIKE CONCAT('%',:nombreFabricante,'%') AND
        co.modelo LIKE CONCAT('%',:modeloCoche,'%') AND
        con.nombre LIKE CONCAT('%',:nombreConcesionario,'%') AND
        cli.dniNie LIKE CONCAT('%',:dniCliente,'%')
        ORDER BY v.fecha
       
       
       
       
         */
    }
}
