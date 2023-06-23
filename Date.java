/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkin
 */
public class Date { // "23/06/2566"
    
    // Instance Variable (ตัวแปรของ object !!!!) 
    private int day;
    private int month;
    private int year;
    
    public void setDate(int day, int month, int year) { /// 6
        // Data Validation - Control Logic -- แปลง if...else ให้เป็น ternary operator
        this.day = (day > 0 && day < 32) ? day : 0;
        this.month = (month > 0 && month < 13) ? month : 0;
        this.year = (year >= 1900 && year <= 9999) ? year : 0;
    }
    @Override
    public String toString() {
    
        return this.day + "/" +this.month+"/"+this.year;
    }
    
}

class DateTest {

    public static void main(String[] args) {
        
        Date today = new Date(); // สร้าง object 
        today.setDate(23, 6, 2023);
        System.out.println(today);
       
        // 50/16/50000
        Date future = new Date();
        future.setDate(5, 16, 50000);
        System.out.println(future);
    }
}
