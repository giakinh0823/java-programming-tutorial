/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;


/**
 *
 * @author GIA KINH
 */
class Customer {

    private int ID;
    private String name;
    private char gender;
    private double discount;

    public Customer(int ID, String name, double discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }


    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            System.out.println("Gender of 'm' or 'f'");
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            System.out.println("Gender of 'm' or 'f'");
        }
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    

    @Override
    public String toString() {
        return name + "(" + ID + ")";
    }

}

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String getCustomerName(){
        return this.customer.getName();
    }
    
    public Account deposit(double amount){
        this.balance+=amount;
        return this;
    }
    
    public Account withdraw(double amount){
        if(amount>this.balance){
            System.out.println("amount withdraw exceeds the current balance!");
        }else{
            this.balance -= amount;
        }
        return this;
    }

    @Override
    public String toString() {
        return this.customer.getName() +"("+this.id+")" + " balance="+String.format("$%.2f", this.balance);
    }
    
}

class TestAccount{
    public static void main(String[] args) {
        Account account = new Account(1, new Customer(2, "Ha Gia Kinh", 'm'),10000.0);
        System.out.println(account);
        account.withdraw(100);
        System.out.println(account);
        System.out.println(account.getCustomerName());
        account.deposit(500);
        System.out.println(account);
    }
}
