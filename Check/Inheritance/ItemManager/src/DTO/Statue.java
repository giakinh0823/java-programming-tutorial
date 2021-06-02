/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author GIA KINH
 */
public class Statue extends Item{
    private int weight;
    private String color;

    public Statue() {
    }

    public Statue(int value, String creator, int weight, String color) {
        super(value, creator);
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Statue[" + super.toString() + ",weight=" + weight + ",color=" + color + ']';
    }
    
    public void inputStatue(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a weight: ");
        this.weight = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input a color: ");
        this.color = scanner.nextLine();
    }
    
    public void outputStatue(){
        super.output();
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }
    
}
