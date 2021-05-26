/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Container;

/**
 *
 * @author GIA KINH
 */
class Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * (float) Math.cos(Math.toRadians(direction));
        this.yDelta = -speed * (float) Math.sin(Math.toRadians(direction));
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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public int getSpeed() {
        return (int) Math.sqrt(xDelta * xDelta + yDelta * yDelta);
    }

    public int getDirection() {
        return (int) Math.toDegrees(Math.atan2(-yDelta, xDelta));
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta = -this.xDelta;
    }

    public void reflectVertical() {
        this.yDelta = -this.yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}

public class Container {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width - 1;
        this.y2 = y1 + height - 1;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX() {
        return x1;
    }

    public int getY(int y2) {
        return y1;
    }

    public int getWidth() {
        return this.x2-this.x1+1;
    }

    public int getHeight() {
        return this.y2-this.y1+1;
    }

    public boolean collides(Ball ball) {
        if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }
        return false;
    }
    
    public boolean collidesWith(Ball ball) {
        if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container[" + "(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}

class TestContainer {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        System.out.println(box.getHeight());
        System.out.println(box.getWidth());
        for (int step = 0; step < 10; ++step) {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball); // manual check the position of the ball
        }
    }
}
