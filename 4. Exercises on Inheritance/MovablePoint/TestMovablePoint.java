/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MovablePoint;

/**
 *
 * @author GIA KINH
 */
public class TestMovablePoint{
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint();
        System.out.println(m1);
        MovablePoint m2 = new MovablePoint(1, 2);
        System.out.println(m2);
        MovablePoint m3 = new MovablePoint(3, 4, 5, 6);
        System.out.println(m3);
        
        m1.setX(7);
        m1.setY(8);
        m1.setxSpeed(9);
        m1.setySpeed(10);
        System.out.println(m1);
        System.out.println("Move: " + m1.move());
    }
}
