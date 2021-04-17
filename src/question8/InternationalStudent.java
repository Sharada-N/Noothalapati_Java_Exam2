/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class InternationalStudent extends StudentType {

    private final double INTERNATIONAL_CHARGES = 100.0;
    private final double FEE_PER_CREDIT = 1400.0;

    public InternationalStudent() {
    }

    public InternationalStudent(String firstName, String lastName, int noOfCredits) {
        super(firstName, lastName, noOfCredits);
    }

    @Override
    public double feeCalculator() {
        double fee;
        fee = super.getNoOfCredits() * INTERNATIONAL_CHARGES * FEE_PER_CREDIT;
        return fee;
    }

}
