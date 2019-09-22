/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.Cuenta;
import java.util.List;
import javax.ejb.Local;

/**
 *interface
 * @author Hernan
 */
@Local
public interface CuentaFacadeLocal {
/**
 * metodos para agragr a la bd
 * @param cuenta 
 */
    void create(Cuenta cuenta);
/**
 * metodos para editar la bd
 * @param cuenta 
 */
    void edit(Cuenta cuenta);
/**
 * metodos para eliminar a la bd
 * @param cuenta 
 */
    void remove(Cuenta cuenta);

    Cuenta find(Object id);

    List<Cuenta> findAll();

    List<Cuenta> findRange(int[] range);

    int count();
    
}
