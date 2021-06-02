/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cylinder;

/**
 *
 * @author GIA KINH
 */
public class Cylinder extends Circle {

    private Circle base;
    private double height = 1.0;

    public Cylinder() {
        this.base = new Circle();
    }

    public Cylinder(double radius) {
        super(radius);
        this.base = new Circle();
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
        this.base = new Circle();
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.base = new Circle();
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
        this.base = new Circle();
    }
    
    
    public Cylinder(double radius1, String color1, double radius2, String color2) {
        super(radius1, color1);
        this.base = new Circle(radius2, color2);
    }
    
    public Cylinder(double height, double radius1, String color1, double radius2, String color2) {
        super(radius1, color1);
        this.height = height;
        this.base = new Circle(radius2, color2);
    }
    
    public Cylinder(double radius1, String color1, double radius2, String color2, double height) {
        super(radius1, color1);
        this.height = height;
        this.base = new Circle(radius2, color2);
    }
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Cylinder["+ "circle=" + super.toString() + "" + "base=" + base + ", height=" + height + '}';
    }   
}

class TestCylinder{
    public static void main(String[] args) {
        
    }
}