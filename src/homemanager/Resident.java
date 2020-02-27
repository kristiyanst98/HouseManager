/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homemanager;

import java.io.*;

/**
 *
 * @author Chris
 */
public class Resident implements Serializable {

    private static final long serialVersionUID = -8593701595852178675L;
    private String name;
    private Building b;
    private Tax tax;
    private Apartment app;

    public Resident(String name, Building b) {
        this.name = name;
        this.b = b;

    }

    public String getName() {
        return name;
    }

    public Building getB() {
        return b;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Apartment getApp() {
        return app;
    }

    public void setApp(Apartment app) {
        this.app = app;
    }

}
