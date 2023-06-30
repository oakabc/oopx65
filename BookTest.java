/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author chanakarnkin
 */
public class BookTest {
    public static void main(String[] args) {
        Author a = new Author ("CK", "oakabc@gmail.com", 'M');
        System.out.println(a);
        Book b = new Book ("My name is CK", a , 100);
        System.out.println(b);
    }
}
