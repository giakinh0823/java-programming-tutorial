/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop2;

import java.util.Scanner;

/**
 *
 * @author giaki
 */
public class Part1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=0;
        do {
            System.out.print("Enter the number: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number < 1) {
                    throw new Exception();
                }
                System.out.println("The number is " + number);
                break;
            } catch (Exception e) {
                System.out.println("The number is invaild");
            }
        } while (true);
    }
}
