/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class PerfumesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exam 02: Question 7" + "\n" + "****************************");
        for (Perfumes perfume : Perfumes.values()) {
            System.out.println(perfume.getQuantity() + "ml of " + perfume.getBrand() + " " + perfume + "  perfume of flavour " + perfume.getFlavour());
        }
    }

}
