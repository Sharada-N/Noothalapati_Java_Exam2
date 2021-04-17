/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class DuplicateList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exam 02: Question 1"+"\n"+"***********************");
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();
        System.out.print("Enter ten integers: ");
        for(int i = 0; i < 10; i++){
            arrayList.add(scan.nextInt());
        }
        /**Set only allows the distinct elements to store. 
         * Hence by using Set we can remove duplicate elements.**/
        Set<Integer> removeDuplicates = new HashSet<>(arrayList);
        newList.addAll(removeDuplicates);
        scan.close();
        arrayList.clear();
        System.out.print("The distinct integers are ");
        for(Integer value : newList){
            System.out.print(value+" ");
        }
        System.out.println();
    }
    
}
