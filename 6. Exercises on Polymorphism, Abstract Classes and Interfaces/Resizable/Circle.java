/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resizable;

import GeometricObject.*;

/**
 *
 * @author GIA KINH
 */
public class Circle implements GeometricObject{

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ']';
    }
    
    
    
    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPgetPerimeter() {
        return radius*2*Math.PI;
    }
    
}
