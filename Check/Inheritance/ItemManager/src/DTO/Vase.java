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
public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Vase[" + super.toString() + ",height=" + height + ",material=" + material + ']';
    }

    public void inputVase() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a height: ");
        this.height = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input a material: ");
        this.material = scanner.nextLine();

    }

    public void outputVase() {
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
}
