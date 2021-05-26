/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTriangle;

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

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyPoint getV1() {
        return v1;
    }

    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }

    public MyPoint getV2() {
        return v2;
    }

    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }

    public MyPoint getV3() {
        return v3;
    }

    public void setV3(MyPoint v3) {
        this.v3 = v3;
    }
    
    public double getPerimeter(){
        return this.v1.distance(this.v2) + this.v2.distance(this.v3) + this.v3.distance(this.v1);
    }
    
    public String getType(){
        if(this.v1.distance(this.v2) == this.v2.distance(this.v3) && this.v1.distance(this.v2) ==  this.v3.distance(this.v1)){
            return "Equilateral";
        }else if(this.v1.distance(this.v2) == this.v2.distance(this.v3) || 
                this.v1.distance(this.v2) ==  this.v3.distance(this.v1) ||
                this.v3.distance(this.v1) == this.v2.distance(this.v3)
                ){
            return "Isosceles";
        }else{
            return "Scalene";
        }
    }

    @Override
    public String toString() {
        return "MyTriangle[" + "v1=" + v1.toString() + ",v2=" + v2.toString() + ",v3=" + v3.toString() + ']';
    }
}

class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle myTriangle = new MyTriangle(new MyPoint(5, 5), new MyPoint(15, 15), new MyPoint(5,25));
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());
        System.out.println(myTriangle.getV1());
        System.out.println(myTriangle.getV2());
        System.out.println(myTriangle.getV3());
        System.out.println(myTriangle.toString());
    }
}