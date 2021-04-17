/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Sharad Devi Noothalapati
 */
public class Doctor extends Hospital {

    private double consultancyFee;

    public Doctor(double consultancyFee, String name, double charge) {
        super(name, charge);
        this.consultancyFee = consultancyFee;
    }

    public double getConsultancyFee() {
        return consultancyFee;
    }

    public void setConsultancyFee(double consultancyFee) {
        this.consultancyFee = consultancyFee;
    }

    @Override
    public double totalBill() {
        double bill = super.getCharge() + consultancyFee;
        return bill;
    }

}
