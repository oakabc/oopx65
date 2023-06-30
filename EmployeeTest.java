/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author chanakarnkin
 */
public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Date birthDate = new Date (6, 8 , 1997); // object วันเกิด
        System.out.println(birthDate); // toString()
        Date hireDate = new Date(30, 6 , 2023);
        System.out.println(hireDate);
        Employee oak = new Employee("Chanakarn", "Kingkaew", birthDate, hireDate);
        System.out.println(oak);
    }
    
}
