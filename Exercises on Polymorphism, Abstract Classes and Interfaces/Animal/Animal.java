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
public abstract class Animal {
       private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }
    
    
    
    public abstract void greets();
    
}
