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
public class Employee extends Person {

    private String office;
    private double salary;
    private String dateHired;

    public Employee(String office, double salary, String dateHired, String name, String address, String phoneNum, String email) {
        super(name, address, phoneNum, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "----------------Employee toString Method----------------"
                + "\n" + "Employee " + "office: " + office + ", salary: $" + salary + ", Hired on: " + dateHired;
    }

}
