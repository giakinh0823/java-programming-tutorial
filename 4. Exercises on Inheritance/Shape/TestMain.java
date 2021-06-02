/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author GIA KINH
 */
public class TestMain {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(1);
        System.out.println(c2);
        Circle c3 = new Circle(2, "black", true);
        System.out.println(c3);

        c1.setColor("yellow");
        c1.setFilled(false);
        c1.setRadius(3);
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        Rectangle r2 = new Rectangle(1, 2);
        System.out.println(r2);
        Rectangle r3 = new Rectangle(3, 4, "black", true);
        System.out.println(r3);

        r1.setColor("yellow");
        r1.setFilled(false);
        r1.setLength(5);
        r1.setWidth(6);
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        Square s1 = new Square();
        System.out.println(s1);
        Square s2 = new Square(1);
        System.out.println(s2);
        Square s3 = new Square(3, "black", true);
        System.out.println(s3);

        s1.setColor("yellow");
        s1.setFilled(false);
        s1.setLength(5);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
    }
}
