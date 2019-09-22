/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.dto.CuentaDTO;
import com.mycompany.dto.InversorDTO;
import com.mycompany.entity.Inversor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hernan
 */
@Local
public interface InversorFacadeLocal {

 /**
 * metodos para agragr a la bd
 */
    void create(Inversor inversor);
 /**
 * metodos para editar a la bd
 */
    void edit(Inversor inversor);
 /**
 * metodos para remover a la bd
 */
    void remove(Inversor inversor);

    Inversor find(Object id);

    List<Inversor> findAll();

    List<Inversor> findRange(int[] range);
    
    /**
     * funcion para agregar 
     * @param inversordto
     * @param cuentadto 
     */
       public void nuevoInversor(InversorDTO inversordto,CuentaDTO cuentadto);

    int count();
    
}
