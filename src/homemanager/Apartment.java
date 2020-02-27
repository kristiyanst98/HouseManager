/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homemanager;

import java.io.Serializable;



/**
 *
 * @author Chris
 */
public class Apartment implements Serializable {
    private static final long serialVersionUID = -5932020864290795399L;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Apartment(int number) {
        this.number = number;
    }
    
    
}
