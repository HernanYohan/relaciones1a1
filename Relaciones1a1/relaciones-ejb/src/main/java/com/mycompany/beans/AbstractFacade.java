/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *Clase padre
 * @author Hernan
 */
public abstract class AbstractFacade<T> {
    private Class<T> entityClass;
    
    /**
     * metodos creados al mapear la bd
     * @param entityClass 
     */
    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
    /**
     * metodos creados al mapear la bd
     * @param entityClass 
     */
    protected abstract EntityManager getEntityManager();
    /**
     * metodos creados al mapear la bd
     * @param entityClass 
     */
    public void create(T entity) {
        getEntityManager().persist(entity);
    }
    /**
     * metodos creados al mapear la bd
     * @param entityClass 
     */
    public void edit(T entity) {
        getEntityManager().merge(entity);
    }
    /**
     * metodos creados al mapear la bd
     * @param entityClass 
     */
    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }
    /**
     * metodos creados al mapear la bd
     * @param entityClass 
     */
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }
    /**
     * metodos creados al mapear la bd
     * @param entityClass 
     */
    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }
    /**
     * metodos creados al mapear la bd
     * @param entityClass 
     */
    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }
    /**
     * metodos creados al mapear la bd
     * @param entityClass 
     */
    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
}
