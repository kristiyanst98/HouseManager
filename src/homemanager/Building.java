/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homemanager;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Building implements Serializable   {
    private static final long serialVersionUID = -7356465603351635628L;
    private String address;
    private int floors;
    private int apps;
    private double area;
    private double commonParts;
    private double tax;
    private ArrayList<Resident> residents;

    public Building(String address, int floors, int apps, double area, double commonParts, double tax) {
        this.address = address;
        this.floors = floors;
        this.apps = apps;
        this.area = area;
        this.commonParts = commonParts;
        this.tax = tax;
        this.residents=new ArrayList<Resident>();
    }

    public boolean equals(Building b) {
        if(this.address.equals(b.address) && this.floors==b.floors && this.apps ==b.apps && this.area==b.area && this.commonParts==b.commonParts && this.tax==b.tax){
            return true;
        }else{
            return false;
        }

    }

    public String getAddress() {
        return address;
    }

    public int getFloors() {
        return floors;
    }

    public int getApps() {
        return apps;
    }

    public double getArea() {
        return area;
    }

    public double getCommonParts() {
        return commonParts;
    }

    public double getTax() {
        return tax;
    }
    public void addResident(Resident r){
        residents.add(r);
    }

    public ArrayList<Resident> getResidents() {
        return residents;
    }

    

    @Override
    public String toString() {
        return "Building{" + "address=" + address + ", floors=" + floors + ", apps=" + apps + ", area=" + area + ", commonParts=" + commonParts + ", tax=" + tax + ", residents=" + residents + '}';
    }
    
    
}
