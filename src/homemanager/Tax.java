/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homemanager;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Tax implements Serializable {

    private static final long serialVersionUID = -798480820219264055L;
    private double tax;
    private Date date;

    public Tax(double tax) {
        this.tax = tax;
        date = new Date();
    }

    @Override
    public String toString() {
        return "Tax{" + "tax=" + tax + '}';
    }

    public double getTax() {
        return tax;
    }

    public void usesElevator() {
        this.tax = tax + 0.5 * tax;
    }

    public Date getDate() {
        return date;
    }

}
