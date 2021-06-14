/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneNumber;

/**
 *
 * @author GIA KINH
 */
public class PhoneNumber {
    protected int area;
    protected String number;

    public PhoneNumber(int area, String number) {
        this.area = area;
        this.number = number;
    }

    public PhoneNumber() {
    }
    
     public void display(){
        if (this.area!=0) {
            System.out.print(this.area + "-");
        }
        if(!this.number.isEmpty()){
            System.out.print(this.number);
        }
         System.out.println();
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    
    
    @Override
    public String toString() {
        return "PhoneNumber{" + "area=" + area + ", number=" + number + '}';
    }
    
}
