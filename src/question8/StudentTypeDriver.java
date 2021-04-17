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
public class StudentTypeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exam 02: Question 8"+"\n"+"****************************");
        StudentType type = new InternationalStudent("sravani", "Megha", 9);
        System.out.println("Internation Student: "+type.feeCalculator());
        type = new DomesticStudents("Lessa", "Giller", 9);
        System.out.println("Domestic Student: "+type.feeCalculator());
    }
    
}
