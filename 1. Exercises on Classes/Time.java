/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GIA KINH
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
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
    
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public Time nextSecond(){
        this.second+=1;
        return this;
    }
    
    public Time previousSecond(){
        this.second-=1;
        return this;
    }

    @Override
    public String toString() {
        String timeString = String.format("%d:%d:%d", hour, minute, second);
        Date time = null;
        try {
            time = new SimpleDateFormat("HH:mm:ss").parse(timeString);
        } catch (ParseException ex) {
            Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
        }
        timeString = new SimpleDateFormat("HH:mm:ss").format(time);
        return timeString;
    }
        
}

class TestTime {
   public static void main(String[] args) {
      // Test constructors and toString()
      Time t1 = new Time(1, 2, 3);
      System.out.println(t1);  // toString()

      // Test Setters and Getters
      t1.setHour(4);
      t1.setMinute(5);
      t1.setSecond(6);
      System.out.println(t1);  // toString()
      System.out.println("Hour: " + t1.getHour());
      System.out.println("Minute: " + t1.getMinute());
      System.out.println("Second: " + t1.getSecond());

      // Test setTime()
      t1.setTime(23, 59, 58);
      System.out.println(t1);  // toString()

      // Test nextSecond();
      System.out.println(t1.nextSecond());
      System.out.println(t1.nextSecond().nextSecond());

      // Test previousSecond()
      System.out.println(t1.previousSecond());
      System.out.println(t1.previousSecond().previousSecond());
   }
}
