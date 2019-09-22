/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.dto.CuentaDTO;
import com.mycompany.dto.InversorDTO;
import com.mycompany.entity.Cuenta;
import com.mycompany.entity.Inversor;
import com.mycompany.interfaces.InversorFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Hernan
 */
@Stateless
public class InversorFacade extends AbstractFacade<Inversor> implements InversorFacadeLocal {
    @PersistenceContext(unitName = "persistence")
    private EntityManager em;
/**
 * metodos abstrac
 * 
 * @return 
 */
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
/**
 * Constructor de la clase
 */
    public InversorFacade() {
        super(Inversor.class);
    }
    
    /**
     * metodo creado para guardar con relacion uno a uno 
     * @param inversordto
     * @param cuentadto 
     */
    public void nuevoInversor(InversorDTO inversordto,CuentaDTO cuentadto){
    Inversor inversor = new Inversor();
    inversor.setNombre(inversordto.getNombre());
    Cuenta cuenta = new Cuenta();
    cuenta.setNumeroCuenta(cuentadto.getNumeroCuenta());
    inversor.setCuenta(cuenta);
    cuenta.setInversorId(inversor);
    create(inversor);
    }
}
