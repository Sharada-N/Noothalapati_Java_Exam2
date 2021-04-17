/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class dimensionalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exam 02: Question 2" + "\n" + "***********************");
        Scanner scan = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        System.out.print("Enter list1: ");
        for (int i = 0; i < m1[0].length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m1[i][j] = scan.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for (int i = 0; i < m2[0].length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                m2[i][j] = scan.nextInt();
            }
        }
        /**
         * Calling equals method to check whether the given arrays are identical
         * or not
         */
        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
        scan.close();
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        //Checking the lengths.
        if ((m1.length != m2.length) || (m1.length == 0) || (m2.length == 0)) {
            return false;
        }
        //comparing each element in the arrays
        for (int i = 0; i < m1.length; i++) {
            if (!Arrays.equals(m1[i], m2[i])) {
                return false;
            }
        }
        return true;
    }
}
