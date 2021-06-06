/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalAbstract;

import Animal.*;

/**
 *
 * @author GIA KINH
 */
public class Dog extends Animal {

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + ']';
    }

    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Woooooooooof!");
    }

}
