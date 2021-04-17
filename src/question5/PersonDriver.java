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
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //To Do draw UML diagram
        Person person = new Person("Sharada Devi", "Horizons west", "1234567890", "email@gmail.com");
        Student std = new Student("A", person.getName(), person.getAddress(), person.getPhoneNum(), person.getEmail());
        Employee emp = new Employee("Infosys", 8000.00, "03/27/2017", person.getName(), person.getAddress(), person.getPhoneNum(), person.getEmail());
        Faculty fac = new Faculty(20, 3, emp.getOffice(), emp.getSalary(), emp.getDateHired(), person.getName(), person.getAddress(), person.getPhoneNum(), person.getEmail());
        Staff staff = new Staff("Senior System Engineer", emp.getOffice(), emp.getSalary(), emp.getDateHired(), person.getName(), person.getAddress(), person.getPhoneNum(), person.getEmail());
        System.out.println("Exam 2: Question 5 Done");
        System.out.println("******************************");
        System.out.println(std);
        System.out.println("******************************");
        System.out.println(emp);
        System.out.println("******************************");
        System.out.println(fac);
        System.out.println("******************************");
        System.out.println(staff);
    }

}
