/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class TraingleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exam 02: Question 6" + "\n" + "****************************");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter triangle side 1: ");
        double side1 = scan.nextDouble();
        System.out.print("Enter triangle side 2: ");
        double side2 = scan.nextDouble();
        System.out.print("Enter triangle side 3: ");
        double side3 = scan.nextDouble();
        System.out.print("Enter triangle color: ");
        String color = scan.next();
        System.out.print("Enter whether the triangle is filled or not(true/false):  ");
        boolean check = scan.nextBoolean();
        Triangle tri = new Triangle(side1, side2, side3, color, check);
        System.out.println("Perimeter of Triangle: " + tri.trianglePerimeter());
        System.out.println("Area of Triangle: " + tri.traingleArea());
        System.out.println(tri);
        scan.close();

    }

}
