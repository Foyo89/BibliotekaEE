/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.mycompany.logic.BookBeanIfc;
import com.mycompany.model.Author;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Grzegorz
 */
@ManagedBean(name = "addAuthorController")
@RequestScoped
public class AddAuthorController {
    
    @EJB
    private BookBeanIfc bbi;
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public void save(){
        Author author = new Author();
        author.setName(this.name);
        bbi.addAuthor(author);
    }
    
}
