/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resizable;

/**
 *
 * @author GIA KINH
 */
public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    public ResizableCircle() {
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() +']';
    }

    
    
    @Override
    public void resize(int percent) {
        radius *= percent/100;
    }
    
}
