/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class Person {

    private String name;
    private String address;
    private String phoneNum;
    private String email;

    public Person(String name, String address, String phoneNum, String email) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "----------------Person toString Method----------------" + "\n"
                + "Person " + "Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNum + ", Email: " + email;
    }

}
