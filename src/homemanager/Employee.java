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
public class Employee implements Serializable {
    private static final long serialVersionUID = 5650984270748696538L;
    private String name;
    private int age;

    private int staffNr;
    private double salary;

    public Employee(String name, int age, int staffNr, double salary) {
        this.name = name;
        this.age = age;
        this.staffNr = staffNr;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStaffNr() {
        return staffNr;
    }

    public void setStaffNr(int staffNr) {
        this.staffNr = staffNr;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + '}';
    }

}
