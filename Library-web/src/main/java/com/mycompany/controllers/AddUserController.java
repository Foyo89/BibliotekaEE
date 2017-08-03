/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.mycompany.logic.UserBeanIfc;
import com.mycompany.model.User;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Grzegorz
 */

@ManagedBean(name = "addUserController")
@RequestScoped
public class AddUserController {
    
    @EJB
    private UserBeanIfc ubi;
    
    private String name;
    private String street;
    private String city;
    private String zipCode; 

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public void save(){
        User user = new User();
        user.setName(this.name);
        user.setStreet(this.street);
        user.setCity(this.city);
        user.setZipCode(this.zipCode);
        ubi.createUser(user);
    }
    
}
