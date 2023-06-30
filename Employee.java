/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author chanakarnkin
 */
public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate; // วันเกิด
    private Date hireDate; // วันจ้างงาน
    
    public Employee(String first, String last, Date dateOfBirth, Date dateOfHire) {
        
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
        System.out.println(this);
    }
    public String toString() {
    
        return String.format("%s %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
    
    
}
