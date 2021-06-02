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
public class TestMain {

    public static void main(String[] args) {
        Cat c1 = new Cat("Gia Kinh");
        System.out.println(c1);
        c1.greets();
        Dog d1 = new Dog("Lan Anh");
        Dog d2 = new Dog("Noki");
        System.out.println(d1);
        System.out.println(d2);
        d1.greets();
        d1.greets(d2);
    }
}
