/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic;

import com.mycompany.model.Rent;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Grzegorz
 */
@Stateless
public class RentBean implements RentBeanIfc {

    @PersistenceContext(unitName = "pu")
    private EntityManager em;
    
    @Override
    public List<Rent> getRents() {
        return em.createQuery("FROM Rent").getResultList();
    }
    
}
