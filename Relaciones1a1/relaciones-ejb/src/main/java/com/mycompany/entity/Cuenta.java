/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Hernan
 */

@Entity
@Table(name = "cuenta")
public class Cuenta implements Serializable {
    /**
     * mapeo de las tablas 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "numero_cuenta")
    private String numeroCuenta;
    /**
     * relacion one to one 
     */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inversor_id")
    //@MapsId
    private Inversor inversorId;
    
    /**
     * constructor vacio
     */
    public Cuenta() {
    }
    
    
/**
 * metodo que vuelve publica la 
 * @return 
 */
    public int getId() {
        return id;
    }
/**
 * metodo que vuelve publica la 
 * @return 
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * metodo que vuelve publica la 
 * @return 
 */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
/**
 * metodo que vuelve publica la 
 * @return 
 */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
/**
 * metodo que vuelve publica la 
 * @return 
 */
    public Inversor getInversorId() {
        return inversorId;
    }
/**
 * metodo que vuelve publica la 
 * @return 
 */
    public void setInversorId(Inversor inversorId) {
        this.inversorId = inversorId;
    }

  
    
    
    
}
