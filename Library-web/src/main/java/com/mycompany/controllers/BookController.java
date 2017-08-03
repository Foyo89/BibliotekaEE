/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.mycompany.logic.BookBeanIfc;
import com.mycompany.model.Author;
import com.mycompany.model.Book;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.dom4j.Node;

/**
 *
 * @author Grzegorz
 */

@ManagedBean(name = "bookController")
@RequestScoped
public class BookController {
    
    
    private String title;
    private String isbn;
    private int releaseDate;
    private List<Author> authors = new ArrayList<>();
    

    
    @EJB
    private BookBeanIfc bbi;
    
    
    public void save(){
        try{
            Book book = new Book();
            book.setTitle(title);
            book.setIsbn(isbn);
            book.setReleaseDate(releaseDate);
            book.setAuthors(authors);
            bbi.addBook(book);
        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setAuthors(ArrayList<String> authors) {
        for(String element:authors){
            Long temp = Long.parseLong(element);
        Author author = bbi.getAuthor(temp);
        this.authors.add(author);
    }
        
    }
    
    

   
    
    
    
    
    
    
}
