/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author GIA KINH
 */
public class Dog extends Mammal{

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }
    
    public void greets(){
        System.out.println("Woof");
    }
    
    public void greets(Dog another){
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + ']';
    }
}
