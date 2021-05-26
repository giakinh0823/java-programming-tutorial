/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point3D;

/**
 *
 * @author GIA KINH
 */
public class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
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
