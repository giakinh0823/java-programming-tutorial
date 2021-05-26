/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GIA KINH
 */
public class Circle {
    private double radius;

    public Circle() {
        radius = 1.0;
    }


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
      return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ']';
    }
}

class TestCircle{
    public static void main(String[] args) {
        // Test Constructors and toString()
      Circle c1 = new Circle(1.1);
      System.out.println(c1);   // toString()
      Circle c2 = new Circle(); // default constructor
      System.out.println(c2);

      // Test setter and getter
      c1.setRadius(2.2);
      System.out.println(c1);      // toString()
      System.out.println("radius is: " + c1.getRadius());

      // Test getArea() and getCircumference()
      System.out.printf("area is: %.2f%n", c1.getArea());
      System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}

