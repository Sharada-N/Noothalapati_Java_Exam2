/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Sharada Devi Noothalapti
 */
public abstract class Hospital {
    private String name;
    private double charge;

    public Hospital() {
        this("",0.0);
    }

    public Hospital(String name, double charge) {
        this.name = name;
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public double getCharge() {
        return charge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "Hospital{" + "name=" + name + ", charge=" + charge + '}';
    }
    
    public abstract double totalBill();
}
