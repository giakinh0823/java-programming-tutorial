/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyRectangle;

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


public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle() {
    }
    
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public void setTopLeftX(int x){
        this.topLeft.setX(x);
    }
    
    public int getTopLeftX(){
        return this.topLeft.getX();
    }
    
    public void setTopLeftY(int y){
        this.topLeft.setY(y);
    }
    
    public int getTopLeftY(){
        return this.topLeft.getY();
    }
    
    public void setTopLeftXY(int x,int y){
        this.topLeft.setXY(x,y);
    }
    
    public int[] getTopLeftXY(){
        return new int[]{this.topLeft.getX(), this.topLeft.getY()};
    }
    
    
    public void setBottomRightX(int x){
        this.bottomRight.setX(x);
    }
    
    public int getBottomRightX(){
        return this.bottomRight.getX();
    }
    
    public void setBottomRightY(int y){
        this.bottomRight.setY(y);
    }
    
    public int getBottomRightY(){
        return this.bottomRight.getY();
    }
    
    public void setBottomRightXY(int x,int y){
        this.bottomRight.setXY(x,y);
    }
    
    public int[] getBottomRightXY(){
        return new int[]{this.bottomRight.getX(), this.bottomRight.getY()};
    }
    
    public MyPoint getBottomLeft(){
        return new MyPoint(this.topLeft.getX(),this.bottomRight.getY());
    }
    
    public MyPoint getTopRight(){
        return new MyPoint(this.bottomRight.getX(), this.topLeft.getY());
    }
    
    public double getDiagonal(){
        return this.topLeft.distance(this.bottomRight);
    }
    
    public String getFullPoint(){
        return "MyRectangle[" + "topLeft=" + topLeft + ",bottomLeft"+ this.getBottomLeft() + ",bottomRight="+ bottomRight + ",topRight"+ this.getTopRight() + ']';
    }
    
    public int getArea(){
        return (int)(this.topLeft.distance(this.getTopRight()) * this.bottomRight.distance(this.getTopRight()));
    }
    
    public int getPerimeter(){
        return (int)((this.topLeft.distance(this.getTopRight()) + this.bottomRight.distance(this.getTopRight()))*2);
    }

    @Override
    public String toString() {
        return "MyRectangle[" + "topLeft=" + topLeft + ",bottomRight="+ bottomRight + ']';
    }
}

class TestMyRectangle{
    public static void main(String[] args) {
        MyRectangle myRectangle = new MyRectangle(new MyPoint(4,8), new MyPoint(14,2));
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());
        System.out.println(myRectangle);
        System.out.println(myRectangle.getFullPoint());
    }
} 
