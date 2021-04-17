/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class LoanCircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exam 02: Question 3" + "\n" + "**********************************");
        ArrayList<Object> objectList = new ArrayList<>();
        Loan loan = new Loan(1234567890, "Mary Kiranmai", "SBI");
        objectList.add(loan);
        Date date = new Date();
        objectList.add(date);
        String statement = "Loan and Circle driver class";
        objectList.add(statement);
        Circle circle = new Circle(30.9);
        objectList.add(circle);
        System.out.println("Objects List is as below:");
        for (Object object : objectList) {
            System.out.println(object);
        }

    }

}
