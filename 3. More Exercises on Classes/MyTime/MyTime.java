/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GIA KINH
 */
public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        String timeString = String.format("%d:%d:%d", hour, minute, second);
        Date time= null;
        try {
            time = new SimpleDateFormat("HH:mm:ss").parse(timeString);
        } catch (ParseException ex) {
            Logger.getLogger(MyTime.class.getName()).log(Level.SEVERE, null, ex);
        }
        timeString = new SimpleDateFormat("HH:mm:ss").format(time);
        return timeString;
    }
    
    public MyTime nextHour(){
        this.hour++;
        return this;
    }
    
    public MyTime nextMinute(){
        this.minute++;
        return this;
    }
    
    public MyTime nextSecond(){
        this.second++;
        return this;
    }
    
    
    public MyTime previousHour(){
        this.hour--;
        return this;
    }
    
    public MyTime previousMinute(){
        this.minute--;
        return this;
    }
    
    public MyTime previousSecond(){
        this.second--;
        return this;
    }   
}

class TestMyTime{
    public static void main(String[] args) {
        MyTime myTime = new MyTime(23,59,59);
        System.out.println(myTime);
        myTime.nextHour();
        System.out.println(myTime);
        myTime.nextSecond();
        System.out.println(myTime);
    }
}
