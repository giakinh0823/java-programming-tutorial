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
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void display(){
        System.out.println("Name: "+ this.name);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
    
    public abstract double getSalary();
    
}
