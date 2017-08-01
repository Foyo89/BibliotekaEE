/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic;

import com.mycompany.model.Rent;
import com.mycompany.model.User;
import java.math.BigDecimal;
import javax.ejb.Local;

/**
 *
 * @author RENT
 */

@Local
public interface AccountingBeanIfc {
    BigDecimal doDebit(Rent rent);
    BigDecimal doCredit(User user, BigDecimal credit);
    BigDecimal saldo(User user);

}
