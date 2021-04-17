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
public class Staff extends Employee {

    private String title;

    public Staff(String title, String office, double salary, String dateHired, String name, String address, String phoneNum, String email) {
        super(office, salary, dateHired, name, address, phoneNum, email);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "----------------Staff toString Method----------------"
                + "\n" + "Staff " + "title: " + title;
    }

}
