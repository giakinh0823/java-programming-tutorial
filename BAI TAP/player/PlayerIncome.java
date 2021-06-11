/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author GIA KINH
 */
public class PlayerIncome extends Player implements Tax{

    private double income;

    public PlayerIncome(double income) {
        this.income = income;
    }

    public PlayerIncome(double income, String name) {
        super(name);
        this.income = income;
    }
    
    public PlayerIncome() {
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    
    
    
    
    @Override
    public void displayDetails() {
        System.out.println("Name player: "+super.getName());
        System.out.println("Salary: " + (this.income - this.calculateTax())+ "$");
        System.out.println("Tax: " + this.calculateTax()+"$");
    }

    @Override
    public double calculateTax() {
        if(this.income<=10000){
            return this.income*15/100;
        }else if(this.income <=20000){
            return this.income * 20 / 100;
        }else{
            return this.income * 30 / 100;
        }
    }
    
}
