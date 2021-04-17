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
public class Faculty extends Employee {

    private int hours;
    private int subjects;

    public Faculty(int hours, int subjects, String office, double salary, String dateHired, String name, String address, String phoneNum, String email) {
        super(office, salary, dateHired, name, address, phoneNum, email);
        this.hours = hours;
        this.subjects = subjects;
    }

    public int getHours() {
        return hours;
    }

    public int getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "----------------Faculty toString Method----------------"
                + "\n" + "Faculty " + "hours: " + hours + ", subjects: " + subjects;
    }

}
