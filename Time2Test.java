/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkin
 */
public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 = new Time2();
        System.out.println(t1.toUniversalString());
        Time2 t2 = new Time2(2);
        System.out.println(t2.toUniversalString());
        Time2 t3 = new Time2(21, 34);
        System.out.println(t3.toUniversalString());
        Time2 t4 = new Time2(12,25,42);
        System.out.println(t4.toUniversalString());
        Time2 t5 = new Time2(27,74,99);
        System.out.println(t5.toUniversalString());
        Time2 t6 = new Time2(t4);
        System.out.println(t6.toUniversalString());
        Time2 t77 = new Time2(77,77);
        System.out.println(t77.toUniversalString());
   }
    
}
