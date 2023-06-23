/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkin
 */
public class Time2 {

    // Instance Variables 
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time2() {
//        this.hour = 0;
//        this.minute = 0;
//        this.second = 0;
        this(0,0,0);
    }

    public Time2(int h) {
//        this.hour = h;
//        this.minute = 0;
//        this.second = 0;
        this(h,0,0);
    }

    public Time2(int h, int m) {
//        this.hour = h;
//        this.minute = m;
//        this.second = 0;
//        setHour(h);//this.hour = h;
//        setMinute(m);//this.minute = m;
//        setSecond(0);//this.second = s;
        this(h,m,0); /// Constructor
    }

    public Time2(int h, int m, int s) {
//        setHour(h);//this.hour = h;
//        setMinute(m);//this.minute = m;
//        setSecond(s);//this.second = s;
        setTime(h,m,s);
    }

    public Time2(Time2 time) {
//        this.hour = time.getHour();
//        this.minute = time.getMinute();
//        this.second = time.getSecond();
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    /**
     * @return the hour คือชั่วโมงที่ส่งออกมา
     */
    public int getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set คือ ชั่วโมง
     */
    public void setHour(int hour) {
        this.hour = (hour >= 0 && hour <= 24) ? hour : 0;
    }

    /**
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * @param minute the minute to set
     */
    public void setMinute(int minute) {
        this.minute = (minute >= 0 && minute < 60) ? minute : 0;
    }

    /**
     * @return the second
     */
    public int getSecond() {
        return second;
    }

    /**
     * @param second the second to set
     */
    public void setSecond(int second) {
        this.second = (second >= 0 && second < 60) ? second : 0;
    }

    public void setTime(int h, int m, int s) {
//        hour = ((h >= 0 && h < 24) ? h : 0);
//        minute = ((m >= 0 && m < 60) ? m : 0);
//        second = ((s >= 0 && s < 60) ? s : 0);
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }

}
