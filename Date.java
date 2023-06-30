/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author chanakarnkin
 */
public class Date {
    
    // Instance Variable - ตัวแปรของออบเจค
    private int day;
    private int month;
    private int year;
    
    // Constructor - ตัวสร้างออบเจค
    
    public Date (int day, int month, int year) {
//        this.day = day;
//        this.month = month;
//        this.year = year;
           setDate(day, month, year);
    }
    
    // Accessor Methods - การเข้าถึงค่าข้อมูล
    public int getDay() {
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    
    // Mutator Methods - การเปลี่ยนแปลงข้อมูล
    public void setDay(int day){
       if (day > 0 && day <= 31) this.day = day;
       else this.day = 0;
    }
    public void setMonth(int month){
        if (month > 0 && month <= 12) this.month = month;
        else this.month = 0;
    }
    public void setYear(int year){
        if (year >= 1900 && year <= 9999) this.year = year;
        else this.year = 0;
    }
    public void setDate(int day, int month, int year){
        setDay(day); //this.day = day;
        setMonth(month); //this.month = month;
        setYear(year); //this.year = year;
    }
    
    // toString - จัดรูปแบบ output เพื่อแสดงค่าของ object
    
    @Override // การแทนที่ - เขียนเมธอดแทนที่ toString ของ class Object
    public String toString() {
        
        String dayString = "";
        String monthString = "";
        if (day < 10) dayString = "0" + day;
        else dayString = ""+day;
        if (month < 10) monthString = "0"+month;
        else monthString = ""+month;
        
        return dayString + "/" + monthString + "/" + year;
    }
    
}
