/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.mycompany.dto.BookDto;
import com.mycompany.logic.BookBeanIfc;
import com.mycompany.model.Book;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.modelmapper.ModelMapper;


/**
 *
 * @author RENT
 */
@ManagedBean(name = "bookTableController")
@RequestScoped
public class BookTableController {

    /**
     * Creates a new instance of BookTableController
     */
    
    @EJB
    private BookBeanIfc bbi;
    
  
    
     public List<BookDto> getList() {
        List<Book> books = bbi.getBooks();
        List<BookDto> collect = books.stream().map(this::map).collect(Collectors.toList());
        
               
        return collect;
    }
     
        private BookDto map(Book b) {
           ModelMapper mapper = new ModelMapper();
           BookDto map = mapper.map(b, BookDto.class);
           return map;
       }
        
        private String getSomething(){
            return "Test";
        }


    
}
