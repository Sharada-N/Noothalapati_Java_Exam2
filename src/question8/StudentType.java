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
public abstract class StudentType {

    private String firstName;
    private String lastName;
    private int noOfCredits;

    public StudentType() {
        this("", "", 0);
    }

    public StudentType(String firstName, String lastName, int noOfCredits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.noOfCredits = noOfCredits;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNoOfCredits() {
        return noOfCredits;
    }

    public void setNoOfCredits(int noOfCredits) {
        this.noOfCredits = noOfCredits;
    }

    @Override
    public String toString() {
        return "Student " + "First Name: " + firstName + ", Last Name: " + lastName + ", number Of Credits: " + noOfCredits;
    }

    public abstract double feeCalculator();
}
