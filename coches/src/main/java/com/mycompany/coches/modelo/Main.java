/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coches.modelo;

import crud.Listar;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Antonio Martínez Díaz
 */
public class Main {

    public static void main(String[] args) {
        
          
         
        EntityManager manager = Conexion.getConexion().getEmf();
        manager.getTransaction().begin();
         /*Venta venta = new Venta("hoy", 1000);
         Cliente cliente = new Cliente("Pedro", "Perez", "Madrid", "jfldsjkl", "hoy");
         Cliente cliente2 = new Cliente("Maria", "Perez", "Madrid", "jfldsjkl", "hoy");
         Coche coche =  new Coche("341223ab", "seat sport", "rojo");
       
         coche.setFabricante(new Fabricante("131223CX", "Seat"));
         coche.addVenta(venta);
         cliente.setCocheFavorito(new CocheFavorito("ferrari", "f40"));
         venta.setCliente(cliente);
         venta.setConcesionario(new Concesionario("12378291b", "opel", "sevill"));
        
         
         manager.persist(venta);
         manager.persist(cliente2);
        */
       
        Cliente cli1 = new Cliente("Pedro", "Porro", "Cordoba", "123456789A", "1-1-1990");
        Cliente cli2 = new Cliente("Maria", "Prieto", "MAdrid", "123456789B", "1-1-1999");
       
        Concesionario con1 = new Concesionario("123A", "Concesionario uno", "Cordoba");
        
        Coche co1 = new Coche("AAA112", "307", "azul");
        Coche co2 = new Coche("BBB112", "Clio", "Renault");
        
        co1.setFabricante(new Fabricante("FAB1", "Peugeot SA"));
        co2.setFabricante(new Fabricante("FAB2", "Renault SA"));
        
        cli1.setCocheFavorito(new CocheFavorito("Ferrari", "458 Italia"));
        cli2.setCocheFavorito(new CocheFavorito("Ford", "Mondeo"));
        
        Venta ven1 = new Venta("22-01-2020", 4500);
        Venta ven2 = new Venta("08-10-2019", 9000);
        
        ven1.setCoche(co1);
        ven2.setCoche(co2);
        
        ven1.setConcesionario(con1);
        ven2.setConcesionario(con1);
         
        cli1.addVentaCli(ven1);
        cli2.addVentaCli(ven2);
        
        manager.persist(cli1);
        manager.persist(cli2);
        manager.persist(con1);
        manager.persist(co1);
        manager.persist(co2);
        manager.persist(ven1);
        manager.persist(ven2);
        
        manager.getTransaction().commit();
        manager.close();

      
        
        for(Coche cochec : Listar.rCocheTodos()){
            System.out.println(cochec);
        }

      
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
