/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;


import com.mycompany.dto.CuentaDTO;
import com.mycompany.dto.InversorDTO;
import com.mycompany.interfaces.InversorFacadeLocal;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Hernan
 */
@ManagedBean
@SessionScoped
public class index {
    /**
     * variable que aloja el nombre
     */
    private String nombre;
     /**
     * variable que aloja la cuenta
     */   
    private String cuenta;

    /**
     * etiqueta para llamar el ejb
     */
    @EJB
    InversorFacadeLocal inversonCon;
    
    /**
     * funcion llamada desde la vista y que se comunica con el dto para guardar los datos
     */
    public void agregarInversor(){
    InversorDTO inversordto = new InversorDTO();
    CuentaDTO cuentadto = new CuentaDTO();
    inversordto.setNombre(nombre);
    cuentadto.setNumeroCuenta(cuenta);
    
    inversonCon.nuevoInversor(inversordto, cuentadto);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"agregado","inversor"+nombre));
    }
    
    
    /**
     * metodos que hacen publicos las variables
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodos que hacen publicos las variables
     * @return 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodos que hacen publicos las variables
     * @return 
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * metodos que hacen publicos las variables
     * @return 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    

    /**
     * Creates a new instance of index
     */
    public index() {
    }
    
}
