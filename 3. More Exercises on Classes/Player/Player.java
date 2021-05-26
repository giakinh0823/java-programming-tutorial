/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import java.util.Random;

/**
 *
 * @author GIA KINH
 */

class Ball{
    private float x;
    private float y;
    private float z;

    public Ball(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+ x + "," + y + "," + z + ")";
    }
}

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y, float z) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
     public void move(float xDisp, float yDisp){
        this.x +=xDisp;
        this.y +=yDisp;
    }
    
    public void jump(float zDisp){
        this.z+=zDisp;
    }
    
    public boolean near(Ball ball){
        if(Math.sqrt(Math.pow(ball.getX() - this.x, 2) + Math.pow(ball.getY()-this.y, 2) + Math.pow(ball.getZ()-this.z, 2)) < 8){
            return true;
        }else{
            return false;
        }
    }
    
    public void kick(Ball ball){
        Random rand = new Random();
        ball.setX(ball.getX()+rand.nextInt(20));
        ball.setY(ball.getY()+rand.nextInt(20));
        ball.setZ(ball.getZ()+rand.nextInt(5));
    }
 
}

class TestPlayer{
    public static void main(String[] args) {
        
    }
}
