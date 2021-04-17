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
public class Insurance {

    private String firstName;
    private String lastName;
    private int incNumber;

    public Insurance(String firstName, String lastName, int incNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.incNumber = incNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIncNumber() {
        return incNumber;
    }

    @Override
    public String toString() {
        return "---------------------Insurance tostring method---------------------"
                + "\n"
                + "First Name: " + firstName + ", Last Name: " + lastName + ", Insurance Number: " + incNumber;
    }

}
