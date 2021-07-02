/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop3.CarManager;

/**
 *
 * @author giaki
 */
public class Car {
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    public Car() {
    }

    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }
    
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the accelerator button");
    }
    
    public void output(){
        System.out.println("Colour: "+ colour);
        System.out.println("EnginePower: "+ enginePower);
        System.out.println("Convertible: "+ enginePower);
        System.out.println("ParkingBrake: "+ parkingBrake);
    }

    @Override
    public String toString() {
        return "Car{" + "colour=" + colour + ", enginePower=" + enginePower + ", convertible=" + convertible + ", parkingBrake=" + parkingBrake + '}';
    }
}
