/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic;

import com.mycompany.model.Author;
import com.mycompany.model.Book;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author RENT
 */
@Local
public interface BookBeanIfc {
    Book addBook(Book book);
    Author addAuthor(Author author);
    List<Book> getBooks();
    List<Author> getAuthors();
    Author getAuthor(Long id);
    Book getBook(Long id);

    
}
