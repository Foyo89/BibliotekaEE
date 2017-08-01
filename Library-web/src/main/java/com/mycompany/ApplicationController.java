/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Grzegorz
 */


@ManagedBean(name = "applicationController")
@ApplicationScoped
public class ApplicationController {
    @EJB
    private NewSessionBeanRemote bean;
    
    public String getText(){
        bean.addBook("Test");
        bean.addUser();
        return "hsfadfsd";
    }
    
}
