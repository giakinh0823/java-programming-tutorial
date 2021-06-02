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
public class Item {

    private int value;
    private String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Item[" + "value=" + value + ",creator=" + creator + ']';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        this.value = 0;
        do {
            System.out.print("Input a value: ");
            this.value = scanner.nextInt();
            scanner.nextLine();
        } while (this.value <= 0);
        do {
            System.out.print("Input a creator: ");
            this.creator = scanner.nextLine();
        } while(this.creator.isEmpty());
    }

    public void output() {
      System.out.println("Value: " + value);
      System.out.println("Creator: " + creator);
    }
}
