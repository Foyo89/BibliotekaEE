/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.mycompany.logic.BookBeanIfc;
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
//    
//    @EJB
//    private BookBeanIfc bookbean;
    
    
    
    public String getText(){
        
//        Author author = new Author();
//        author.setName("Stanisław Lem");
//        bookbean.addAuthor(author);
//        Book book = new Book();
//        ArrayList<Author> authors = new ArrayList<>();
//        authors.add(author);
//        book.setAuthors(authors);
//        
//        book.setTitle("To jest tytul");
//        book.setIsbn("4324332");
//        book.setReleaseDate(2003);
//                
//        bookbean.addBook(book);
        
        return "hsfadfsd";
    }
    
}
