/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Sharada devi Noothalapti
 */
public class LaptopDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exam 02: Question 9: Example 2" + "\n" + "****************************");
        Dell dell = new Dell("Dell Latitude");
        Hp hp = new Hp("Hp Spectre");
        System.out.println(dell.dellDetails());
        System.out.println(hp.hpDetails());
    }

}
