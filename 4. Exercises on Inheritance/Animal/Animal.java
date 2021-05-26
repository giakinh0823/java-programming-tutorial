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
public class Animal {
    private String name;

    public Animal() {
    }


    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[" + "name=" + name + ']';
    }
    
    
}
