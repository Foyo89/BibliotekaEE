/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author Grzegorz
 */

@Remote
@Local
public interface NewSessionBeanRemote {
    
    public void addBook(String bookName);
    public List<String> getBooks();
    
}
