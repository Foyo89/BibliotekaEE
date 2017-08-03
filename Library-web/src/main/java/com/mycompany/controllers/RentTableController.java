/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.mycompany.logic.RentBeanIfc;
import com.mycompany.model.Rent;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Grzegorz
 */
@ManagedBean(name = "rentTableController")
@RequestScoped
public class RentTableController {
    
    @EJB
    private RentBeanIfc rbi;
    
    public List<Rent> getRents(){
        return rbi.getRents();
    }
    
}
