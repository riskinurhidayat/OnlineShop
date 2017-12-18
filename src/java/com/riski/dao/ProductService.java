/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riski.dao;

import com.riski.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
@Transactional

public class ProductService {
    
    @PersistenceContext
    EntityManager em;

    public ProductService() {
    }

    public ProductService(EntityManager em) {
        this.em = em;
    }
    
    @Transactional
    public void register(Product pro) {
        // Save employee
        this.em.persist(pro);
    }
    
    public List<Product> findAll() {
        List<Product> product;
        product = this.em.createNamedQuery("Product.findAll").getResultList();
        return product;
    }
    
    public Product findById(Integer productId) {
        return em.find(Product.class, productId);
    }
}
