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
public class LineSub extends Point {
    
    private Point end;
    
    public LineSub(Point begin, Point end) {  // caller to construct the Points
        super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
        this.end = end;
    }
    
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);             // construct the begin Point
        this.end = new Point(endX, endY);  // construct the end Point
    }
    
    @Override
    public String toString() {
        return "LineSub[" + "begin=" + super.toString() + ",end=" + end + ']';
    }
    
    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }

    public Point getEnd() {        
        return this.end;
    }

    public void setBegin(int beginX, int beginY) {
        setXY(beginX, beginY);        
    }

    public void setEnd(int endX, int endY) {        
        this.end.setXY(endX, endY);
    }
    
    public int getBeginX() {
        return getX();
    }

    public int getBeginY() {        
        return getY();
    }

    public int getEndX() {        
        return this.end.getX();
    }

    public int getEndY() {        
        return this.end.getY();
    }
    
    public void setBeginX(int beginX) {        
        setX(beginX);
    }

    public void setBeginY(int beginY) {
        setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {        
        setXY(beginX, beginY);
    }

    public void setEndX(int endX) {        
        this.end.setX(endX);
    }

    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        this.end.setXY(endX, endY);
    } 
    
    public int getLength() { 
        return (int)(Math.sqrt(Math.pow(this.end.getX()-super.getX(), 2)+ Math.pow(this.end.getY()-super.getY(), 2)));
    } // Length of the line
                                     // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
   public double getGradient() { 
       return (double)(Math.atan2(this.end.getY()-super.getY(), this.end.getX()-super.getX()));
   } // Gradient in radians
                                          // Math.atan2(yDiff, xDiff)
    
}


class TestLineSub {
    public static void main(String[] args) {
        LineSub lineSub = new LineSub(8, 9,6,7);
        System.out.println(lineSub.getBegin());
        System.out.println(lineSub.getEnd());
        System.out.println(lineSub.getLength());
        System.out.println(lineSub.getGradient());
    }
}
