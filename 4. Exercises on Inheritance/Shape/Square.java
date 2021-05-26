/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author GIA KINH
 */
public class Square extends Rectangle{

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    public double getSide(){
        return this.getLength();
    }
    
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    public double getArea(){
        return this.getSide()*this.getSide();
    }
    
    public double getPerimeter(){
        return this.getSide()*4;
    }
    
    @Override
    public String toString(){
        return "Square["+super.toString()+"]";
    }
}
