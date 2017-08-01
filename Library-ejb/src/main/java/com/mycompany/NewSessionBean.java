/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.mycompany.model.Book;
import com.mycompany.model.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author martin
 */
@Stateless
@LocalBean
public class NewSessionBean implements NewSessionBeanRemote{
    
    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    public void businessMethod() {
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void addBook(String bookName) {
        try{
        Book book = new Book();
        book.setIsbn("1234567890");
        book.setTitle(bookName);        
        em.persist(book);
       }catch(Exception e){
           e.printStackTrace();
       }
        
    }

    @Override
    public List<String> getBooks() {
       Query query = em.createQuery("from Book");
        return query.getResultList();
    }
    
    @Override
    public void addUser() {
        try{
            User u = new User();
            u.setCity("Katowice");
            u.setName("Grzegorz");
            u.setStreet("Ordona");
            u.setZipCode("40-164");
            em.persist(u);
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

}
