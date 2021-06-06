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
public class BigDog extends Dog{

    public BigDog() {
    }

    public BigDog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "BigDog[" + super.toString() + ']';
    }
   
    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }
    
    public void greets(BigDog another) {
        System.out.println("Wooooooooow");
    }
}
