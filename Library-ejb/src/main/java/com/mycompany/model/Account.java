/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author RENT
 */
@Entity
@Table(name = "accounts")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Column
    private BigDecimal debit;
    @Column
    private BigDecimal credit;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name="rent_id")
    private Rent rent;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getDate() {
        return date;
    }

    public BigDecimal getDebit() {
        return debit;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public User getUser() {
        return user;
    }

    public Rent getRent() {
        return rent;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDebit(BigDecimal debit) {
        this.debit = debit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }


    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.model.Account[ id=" + id + " ]";
    }
    
}
