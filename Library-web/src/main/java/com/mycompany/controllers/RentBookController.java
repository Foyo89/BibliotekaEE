/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.mycompany.logic.AccountingBeanIfc;
import com.mycompany.logic.UserBeanIfc;
import com.mycompany.model.Rent;
import com.mycompany.model.User;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Grzegorz
 */

@ManagedBean(name = "rentBookController")
@RequestScoped
public class RentBookController {
    
    @EJB
    private UserBeanIfc ubi;
    
    @EJB
    private AccountingBeanIfc abi;
    
    private Long userId;
    private Long bookId;

    public Long getUserId() {
        return userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    
    public void save(){
        Rent rent = ubi.rentBook(this.userId, this.bookId);    
        abi.doDebit(rent);
        
    }
    
}
