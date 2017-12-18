/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riski.dao;

import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */


@Repository
@org.springframework.transaction.annotation.Transactional
public class UserService {
    
    @PersistenceUnit
    EntityManagerFactory emf;
    
    private EntityManager em;
    
    @org.springframework.transaction.annotation.Transactional
    public void saveUser(com.riski.model.Customer user) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }
     public com.riski.model.Customer findByUsername(String username) {
        com.riski.model.Customer user = new com.riski.model.Customer();
        try {
            em = emf.createEntityManager();
            Query query = em.createQuery("Select c from Customer c where c.username = :username");
            query.setParameter("username", username);
            user = (com.riski.model.Customer) query.getSingleResult();
        } catch (NoResultException nre) {
            java.util.logging.Logger.getLogger(username).log(Level.SEVERE, username, nre);
        }
        return user;
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }

}

    
