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
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    @Override
    public String toString() {
        return "Painting[" + super.toString() + "height=" + height + ",width=" + width + ",isWatercolour=" + isWatercolour + ",isFramed=" + isFramed + ']';
    }
    
    
    
    public void inputPainting(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a height: ");
        this.height = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input a width: ");
        this.width = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Is watercolour: ");
        this.isWatercolour = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Is Framed: ");
        this.isFramed = scanner.nextBoolean();
        scanner.nextLine();
    }
    
    public void outputPainting(){
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Is Watercolour: " + isWatercolour);
        System.out.println("Is Framed: " + isFramed);
    }
}
