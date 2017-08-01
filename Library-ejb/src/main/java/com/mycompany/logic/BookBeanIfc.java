/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic;

import com.mycompany.model.Author;
import com.mycompany.model.Book;
import javax.ejb.Local;

/**
 *
 * @author RENT
 */
@Local
public interface BookBeanIfc {
    Book addBook(Book book);
    Author addAuthor(Author author);

    
}
