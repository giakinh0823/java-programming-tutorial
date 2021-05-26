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
public class Cat extends Mammal{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
    
    public void greets(){
        System.out.println("Meow");
    }
    
    @Override
    public String toString() {
        return "Cat[" + super.toString() + ']';
    }
}
