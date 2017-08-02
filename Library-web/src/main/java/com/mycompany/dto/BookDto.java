/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

import com.mycompany.model.Author;
import java.util.Collection;

/**
 *
 * @author RENT
 */
public class BookDto {
    private Long id; 
    private String title;
    private String isbn;
    private int releaseDate;
    private Collection<Author> authors;
    
    

    public Long getId() {
        return id;
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

    public Collection<Author> getAuthors() {
        return authors;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setAuthors(Collection<Author> authors) {
        this.authors = authors;
    }
    
    
    
}
