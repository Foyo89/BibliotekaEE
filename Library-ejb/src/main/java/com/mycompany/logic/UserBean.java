/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic;

import com.mycompany.model.Book;
import com.mycompany.model.Rent;
import com.mycompany.model.User;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.hibernate.SessionFactory;

/**
 *
 * @author RENT
 */
@Stateless
public class UserBean implements UserBeanIfc {
    
    private User user = new User();
    private Book book = new Book();
    
    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    
    
    
    
    @Override
    public User createUser(User user) {
        try{
            em.persist(user);      
        }catch(Exception e){
           e.printStackTrace();
       }
        return user;
    } 

    @Override
    public Book rentBook(Long userId, Long bookId) {
        try{
            user = (User)em.createQuery("FROM User Where id=:user")
                   .setParameter("user", userId)
                   .getSingleResult();
            book = (Book)em.createQuery("FROM Book Where id=:book")
                   .setParameter("book", bookId)
                   .getSingleResult();
            
            Rent rent = new Rent();
            rent.setRentalDate(new Date());
            rent.setUser(user);
            rent.setBook(book);
            em.persist(rent);
           
        }catch(Exception e){
           e.printStackTrace();
        }
           
           return book;
    } 
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<User> getUsers() {
        List<User> users = em.createQuery("FROM User").getResultList();
        
        return users;
    }
}
