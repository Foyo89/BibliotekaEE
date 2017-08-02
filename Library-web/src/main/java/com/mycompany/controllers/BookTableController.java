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
    
  
    
     public List<Book> getLibrary() {
        //List<Book> books = bbi.getBooks();
        //<BookDto> collect = books.stream().map(this::map).collect(Collectors.toList());
        
               
        return  bbi.getBooks();
    }
     
//        private BookDto map(Book b) {
//           ModelMapper mapper = new ModelMapper();
//           BookDto map = mapper.map(b, BookDto.class);
//           return map;
//       }
        
        public String getSomething(){
            return "Test";
        }


    
}
