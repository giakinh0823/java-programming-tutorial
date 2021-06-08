/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resizable;

/**
 *
 * @author GIA KINH
 */
public class TestMain {
    public static void main(String[] args) {
         GeometricObject g1 = new Circle(1.2);
        System.out.println(g1);
        System.out.println("Perimeter = "+g1.getPerimeter());
        System.out.println("Area = "+ g1.getArea());

        Resizable g2 = new ResizableCircle(3.4);
        System.out.println(g2);
        g2.resize(56);
        System.out.println(g2);
        

        GeometricObject g3 = (GeometricObject) g2;
        System.out.println(g3);
        System.out.println("Perimeter = "+g3.getPerimeter());
        System.out.println("Area = "+g3.getArea());
    }
}
