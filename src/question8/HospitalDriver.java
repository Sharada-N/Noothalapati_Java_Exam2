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
public class HospitalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exam 02: Question 8: Example 2" + "\n" + "****************************");
        Hospital hospital = new Doctor(500, "Oxygen", 1000.0);
        System.out.println("Total Bill: " + hospital.totalBill());
    }

}
