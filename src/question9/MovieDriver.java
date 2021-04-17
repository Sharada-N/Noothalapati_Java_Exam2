/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Sharada Devi Noothalapti
 */
public class MovieDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exam 02: Question 9" + "\n" + "****************************");
        Actor actor = new Actor("Prabhas", "Bahubali", 10000);
        Actress actress = new Actress("Anushka", "Bahubali", 90000);
        System.out.println("Actor Record: " + actor.actorRecord());
        System.out.println("Actress Record: " + actress.actressRecord());
    }

}
