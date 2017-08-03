/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic;

import com.mycompany.model.Book;
import com.mycompany.model.Rent;
import com.mycompany.model.User;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author RENT
 */
@Local
@Remote
public interface UserBeanIfc {
    User createUser(User user);
    Rent rentBook(Long userId, Long bookId);
    List<User> getUsers();
    User getUser(Long id);
    

}
