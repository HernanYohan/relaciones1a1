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
    
    private String nombre;
    private String cuenta;

    @EJB
    InversorFacadeLocal inversonCon;
    
    public void agregarInversor(){
    InversorDTO inversordto = new InversorDTO();
    CuentaDTO cuentadto = new CuentaDTO();
    inversordto.setNombre(nombre);
    cuentadto.setNumeroCuenta(cuenta);
    
    inversonCon.nuevoInversor(inversordto, cuentadto);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"agregado","inversor"+nombre));
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    

    /**
     * Creates a new instance of index
     */
    public index() {
    }
    
}
