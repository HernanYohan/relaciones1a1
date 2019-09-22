/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

/**
 *pojo
 * @author Hernan
 */
public class CuentaDTO {
    /**
     * Variables que guarda el id
     */
    private int id;
     /**
     * Variables que guaarda el numero de cuenta
     */
    private String numeroCuenta;

    /**
     * constructor vacio
     */
    public CuentaDTO() {
    }
    /**
     * metodo que vuelve publica la variable
     * @return 
     */
    public int getId() {
        return id;
    }
/**
 * metodo que vuelve publica la variable
 * @return 
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * metodo que vuelve publica la variable
 * @return 
 */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
/**
 * metodo que vuelve publica la variable
 * @return 
 */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    
}
