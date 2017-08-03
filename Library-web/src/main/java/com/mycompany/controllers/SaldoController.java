/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.mycompany.logic.AccountingBeanIfc;
import com.mycompany.logic.UserBeanIfc;
import com.mycompany.model.User;
import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Grzegorz
 */
@ManagedBean(name = "saldoController")
@RequestScoped
public class SaldoController {
    
    private BigDecimal saldo;
    private Long userId;
    private User user;
    
    
    
    @EJB
    private AccountingBeanIfc abi;
    
    @EJB
    private UserBeanIfc ubi;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
        this.setUser(userId);
    }
    
    

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public void setUser(Long id) {
        this.user = ubi.getUser(id);
    }
    
    public void setSaldo(){
        this.saldo = abi.saldo(user);
    }
    
    public BigDecimal getSaldo(){
        return this.saldo;
    }
    
    
    
    
    
    
    
}
