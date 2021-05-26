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
public class Circle extends Shape{
    private double radius=1.0;

    public Circle() {
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle["+ super.toString() + ",radius=" + radius + ']';
    }
}
