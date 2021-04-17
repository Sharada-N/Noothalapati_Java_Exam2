/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Sharada Devi Noothalapatio
 */
public class ShoesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exam 02: Question 7: Example 2"+"\n"+"****************************");
        for (Shoes shoes : Shoes.values()) {
            System.out.println(shoes.getBrand()+" is of "+ shoes +" available in size "+shoes.getSize());
        }
    }
    
}
