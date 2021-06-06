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
public class BigDog extends Dog {

    public BigDog() {
    }

    @Override
    public String toString() {
        return "BigDog[" + super.toString() + ']';
    }

    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooowwwww!");
    }
}
