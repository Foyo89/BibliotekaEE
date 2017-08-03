/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.mycompany.logic.UserBeanIfc;
import com.mycompany.model.User;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Grzegorz
 */
@ManagedBean(name = "userTableController")
@RequestScoped
public class UserTableController {
    
    @EJB
    private UserBeanIfc ubi;
    
    public List<User> getUsers(){
        return ubi.getUsers();
    }
}
