/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MovablePoint;

/**
 *
 * @author GIA KINH
 */
public class Point {
    private float x;
    private float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public float[] getXY(){
        return new float[]{this.x,this.y};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
}
