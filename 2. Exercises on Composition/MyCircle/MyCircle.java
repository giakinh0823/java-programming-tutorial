/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCircle;

import java.util.Arrays;

/**
 *
 * @author GIA KINH
 */

class MyPoint {

    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        return (double) Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }

    public double distance(MyPoint another) {
        return (double) Math.sqrt(Math.pow((another.x - this.x), 2) + Math.pow((another.y - this.y), 2));
    }
    
    public double distance() {
        return (double) Math.sqrt(Math.pow((0 - this.x), 2) + Math.pow((0 - this.y), 2));
    }

    @Override
    public String toString() {
        return "(" +x + "," + y + ')';
    }
}


public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public int getCenterX(){
        return this.center.getX();
    }
    public int getCenterY(){
        return this.center.getY();
    }
    
    public void setCenterX(int x){
        this.center.setX(x);
    }
   
    public void setCenterY(int y){
        this.center.setX(y);
    }
    
    public int[] getCenterXY() {
        return this.center.getXY();
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x,y); 
    }
    
    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
    
    public double getCircumference(){
        return this.radius * 2 * Math.PI;
    }
    
    public double distance(MyCircle another){
        return this.center.distance(another.center);
    }

    @Override
    public String toString() {
        return "MyCircle[" + "radius=" +radius+",center=" + this.center.toString() + ']';
    }
}

class TestMyCircle{
    public static void main(String[] args) {
        MyCircle myCircle = new MyCircle(new MyPoint(5, 8), 6);
        System.out.println(myCircle.distance(new MyCircle(new MyPoint(30,46),2)));
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getCircumference());
        System.out.println(myCircle.toString());
        System.out.println(Arrays.toString(myCircle.getCenterXY()));
    }
}