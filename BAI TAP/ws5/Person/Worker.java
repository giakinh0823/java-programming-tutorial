/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author GIA KINH
 */
public class Worker extends Person{

    private double hrs;
    final double RATE=5.5;

    public Worker(String name, double hrs) {
        super(name);
        this.hrs = hrs;
    }

    public Worker(double hrs) {
        this.hrs = hrs;
    }

    public Worker() {
    }    

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Hourse: " + this.hrs);
        System.out.println("RATE: "+this.RATE);
        System.out.println("Salary: "+ this.getSalary());
    }
    
    @Override
    public double getSalary() {
       return hrs*RATE;
    }
    
}
