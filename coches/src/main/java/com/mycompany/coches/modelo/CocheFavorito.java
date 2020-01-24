package com.mycompany.coches.modelo;

import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@NamedQueries({
@NamedQuery(name="recupearTodoCocheFavorito", query="select c from CocheFavorito c")
  
})



@Entity
@Table(name = "CocheFavorito")
public class CocheFavorito {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cochefavorito", updatable = false, nullable = false)
    private int id;
    @Column(name = "marca")
    private String marca;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "modelo")
    private String modelo;
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public CocheFavorito() {
    }

    public CocheFavorito(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "CocheFavorito{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.marca);
        hash = 97 * hash + Objects.hashCode(this.modelo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CocheFavorito other = (CocheFavorito) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

 
    
    
    
}
