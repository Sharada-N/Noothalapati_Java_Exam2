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
public class DomesticStudents extends StudentType {

    private final double FEE_PER_CREDIT = 1200;

    public DomesticStudents() {
    }

    public DomesticStudents(String firstName, String lastName, int noOfCredits) {
        super(firstName, lastName, noOfCredits);
    }

    @Override
    public double feeCalculator() {
        double fee;
        fee = super.getNoOfCredits() * FEE_PER_CREDIT;
        return fee;
    }

}
