/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic;

import com.mycompany.model.Author;
import com.mycompany.model.Book;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
        
//        try {
//            Query createQuery = em.createQuery("from Book b");
//            return createQuery.getResultList();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return new ArrayList();
//        }

    }

    @Override
    public List<Author> getAuthors() {
        List<Author> authors = em.createQuery("FROM Author").getResultList();
        return authors;
    }

    @Override
    public Author getAuthor(Long id) {
        try{
            Author author = (Author)em.createQuery("FROM Author Where id=:autID")
                    .setParameter("autID", id)
                    .getSingleResult();
            return author;
        }catch (Exception e){
            e.printStackTrace();
        } return null;
    }

    @Override
    public Book getBook(Long id) {
        try{
            Book book = (Book)em.createQuery("FROM Book Where id=:bID")
                    .setParameter("bID", id)
                    .getSingleResult();
            return book;
        }catch (Exception e){
            e.printStackTrace();
        }return null;
    }
    
}
