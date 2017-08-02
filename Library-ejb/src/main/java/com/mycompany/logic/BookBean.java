/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic;

import com.mycompany.model.Author;
import com.mycompany.model.Book;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author RENT
 */
@Stateless
public class BookBean implements BookBeanIfc{
    
    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    public Book addBook(Book book) {
        try{
            em.persist(book);
        }catch (Exception e){
           e.printStackTrace();
    }
        return book;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Author addAuthor(Author author) {
        try{
            em.persist(author);
        }catch (Exception e){
           e.printStackTrace();
    }
        
        return author;
    }

    @Override
    public List<Book> getBooks() {
        List<Book> books = em.createQuery("FROM Book").getResultList();
        return books;
    }
    
}
