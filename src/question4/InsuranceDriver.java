/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class InsuranceDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exam 02: Question 4" + "\n" + "****************************");
        //Inheritance Example
        CarInsurance car = new CarInsurance("C5432", "Lessa", "William", 12);
        System.out.println("***************Inheritance***************");
        System.out.println(car);

        //Polymorphism  Example
        Insurance inc;
        CarInsurance carPoly = new CarInsurance("Poly18", "Monica", "Bing", 18);
        inc = carPoly;
        System.out.println("\n" + "***************Polymorphism***************");
        System.out.println(inc);

        //Late Binding Polymorphism Example
        Insurance lateInc = new CarInsurance("Late123", "Rachel", "Karen Green", 19);
        System.out.println("\n" + "***************Late Binding Polymorphism***************");
        System.out.println(lateInc);
    }

}
