/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SpecCar extends Car{
    int type;

    public SpecCar() {
    }

    public SpecCar(int type) {
        this.type = type;
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public void setData(){
        super.setMaker("XZ"+super.getMaker());
        super.setPrice(super.getPrice() + 20);
    }
    
    public int getValue(){
        return (type<7) ? super.getPrice() + 10 : super.getPrice() + 15;
    }

    @Override
    public String toString() {
        return  super.toString() + ", "+ type ;
    }

    
}

