/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MovableRectangle;

/**
 *
 * @author GIA KINH
 */
public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle() {
    }

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MovableRectangle[" + "topLeft=" + topLeft + ",bottomRight=" + bottomRight + ']';
    }

    @Override
    public void moveUp() {
        this.topLeft.setY(this.topLeft.getY() - this.topLeft.getySpeed());
        this.bottomRight.setY(this.bottomRight.getY() - this.bottomRight.getySpeed());
    }

    @Override
    public void moveDown() {
        this.topLeft.setY(this.topLeft.getY() + this.topLeft.getySpeed());
        this.bottomRight.setY(this.bottomRight.getY() + this.bottomRight.getySpeed());
    }

    @Override
    public void moveLeft() {
        this.topLeft.setX(this.topLeft.getX() - this.topLeft.getxSpeed());
        this.bottomRight.setX(this.bottomRight.getX() - this.bottomRight.getxSpeed());
    }

    @Override
    public void moveRight() {
        this.topLeft.setX(this.topLeft.getX() + this.topLeft.getxSpeed());
        this.bottomRight.setX(this.bottomRight.getX() + this.bottomRight.getxSpeed());
    }

}
