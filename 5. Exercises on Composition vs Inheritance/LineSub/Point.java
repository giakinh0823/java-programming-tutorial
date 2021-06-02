/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LineSub;

/**
 *
 * @author GIA KINH
 */
public class Point {

    // Các biến 
    private int x;    // x co phan tu 
    private int y;    // y tọa độ

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức công khai
    public String toString() {
        return "Point:(" + x + "," + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
}
