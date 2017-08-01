/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic;

import com.mycompany.model.Account;
import com.mycompany.model.Rent;
import com.mycompany.model.User;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author RENT
 */
@Stateless
public class AccountingBean implements AccountingBeanIfc{
    
    @PersistenceContext(unitName = "pu")
    private EntityManager em; 

  
    
    
    

    @Override
    public BigDecimal doDebit(Rent rent) {
        try{      
            Account account = new Account();
            account.setUser(rent.getUser());
            account.setDebit(BigDecimal.TEN);
            account.setDate(new Date());
            account.setRent(rent);
            em.persist(account);
            return account.getDebit();
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public BigDecimal doCredit(User user, BigDecimal credit) {
        
        try{
            Account account = new Account();
            account.setUser(user);
            account.setCredit(credit);
            account.setDate(new Date());
            em.persist(account);
            return account.getCredit();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        
    }

    @Override
    public BigDecimal saldo(User user) {
        
        try{
            BigDecimal debit = (BigDecimal)em.createQuery("SELECT SUM(debit) FROM Account a  Where a.user=:user")
                    .setParameter("user", user)
                    .getSingleResult();
            BigDecimal credit = (BigDecimal)em.createQuery("SELECT SUM(credit) FROM Account a  Where a.user=:user")
                    .setParameter("user", user)
                    .getSingleResult();
            BigDecimal saldo = new BigDecimal(0);
            saldo.add(credit);
            saldo.subtract(debit);
            return saldo;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        
    }
    
}
