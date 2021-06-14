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
public class Officer extends Person{
    
    private double bSalary;

    public Officer(String name, double bSalary) {
        super(name);
        this.bSalary = bSalary;
    }

    public Officer(double bSalary) {
        this.bSalary = bSalary;
    }

    public Officer() {
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Salary: "+this.bSalary);
    }
    
    @Override
    public double getSalary() {
       return this.bSalary;
    }
    
}
