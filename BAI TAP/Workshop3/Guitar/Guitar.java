/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop3.Guitar;

/**
 *
 * @author giaki
 */
public class Guitar implements Comparable<Guitar> {

    private String serialNumber;
    private double price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;

    public Guitar() {
    }

    public Guitar(String serialNumber, double price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (!serialNumber.isEmpty()) {
            this.serialNumber = serialNumber;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    public void createSound() {
        System.out.println("serialNumber: " + getSerialNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Builder: " + getBuilder());
        System.out.println("Model: " + getModel());
        System.out.println("BackWood: " + getBackWood());
        System.out.println("TopWood: " + getTopWood());
    }

    @Override
    public String toString() {
        return "Guitar{" + "serialNumber=" + serialNumber + ", price=" + price + ", builder=" + builder + ", model=" + model + ", backWood=" + backWood + ", topWood=" + topWood + '}';
    }

    @Override
    public int compareTo(Guitar t) {
        if (this.getPrice() > t.getPrice()) {
            return 1;
        } else if(this.getPrice() < t.getPrice()){
            return -1;
        }else return this.getSerialNumber().compareTo(t.getSerialNumber());
    }
}
