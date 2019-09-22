/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

/**
 *
 * @author Hernan
 */
public class InversorDTO {
    /**
     * variable que guarda el id
     */
    private int id;
    /**
     * variable que guarda el nombre
     */
    private String nombre;
/**
 * constructor
 */
    public InversorDTO() {
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
    public String getNombre() {
        return nombre;
    }
/**
 * metodo que vuelve publica la 
 * @return 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
