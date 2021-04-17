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
public class Student extends Person {

    private String grade;
    private final String STATUS = "Graduate";

    public Student(String grade, String name, String address, String phoneNum, String email) {
        super(name, address, phoneNum, email);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public String getStatus() {
        return STATUS;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "----------------Student toString Method----------------"
                + "\n" + "Student " + "grade: " + grade + ", status: " + STATUS;
    }

}
