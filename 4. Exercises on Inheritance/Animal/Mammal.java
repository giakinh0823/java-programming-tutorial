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
public class Mammal extends Animal{
    private String name;

    public Mammal() {
    }

    public Mammal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mammal["+super.toString() + ",name=" + name + ']';
    }  
}
