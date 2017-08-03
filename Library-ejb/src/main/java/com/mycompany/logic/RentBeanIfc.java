/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.logic;

import com.mycompany.model.Rent;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Grzegorz
 */

@Local
public interface RentBeanIfc {
    
    List<Rent> getRents();
}
