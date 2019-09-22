/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Hernan
 */
@Entity
@Table(name = "inversor")
public class Inversor implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column
    private String nombre;
    /**
     * reacion one to one
     */
    @OneToOne(mappedBy = "inversorId",cascade = CascadeType.ALL,fetch = FetchType.LAZY,optional = false)
     private Cuenta cuenta;
/**
 * constructor vacio
 */
    public Inversor() {
    }
/**
 * metodo que vueve publica la variable
 * @return 
 */
    public int getId() {
        return id;
    }
/**
 * metodo que vueve publica la variable
 * @return 
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * metodo que vueve publica la variable
 * @return 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * metodo que vueve publica la variable
 * @return 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * metodo que vueve publica la variable
 * @return 
 */
    public Cuenta getCuenta() {
        return cuenta;
    }
/**
 * metodo que vueve publica la variable
 * @return 
 */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    
    
}
