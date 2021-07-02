/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop1;

import java.util.Scanner;

/**
 *
 * @author giaki
 */
public class Part2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number 1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Input number 2: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the operator(+-*/): ");
        char op = scanner.nextLine().charAt(0);
        switch (op) {
            case '+':
                System.out.println("The result of: " + number1 + op + number2 + "=" + (number1 + number2));
                break;
            case '-':
                System.out.println("The result of: " + number1 + op + number2 + "=" + (number1 - number2));
                break;
            case '*':
                System.out.println("The result of: " + number1 + op + number2 + "=" + (number1 * number2));
                break;
            case '/':
                System.out.println("The result of: " + number1 + op + number2 + "=" + (number1 / number2));
                break;
            default:
                System.out.println("Please enter operator");
                break;
        }
    }
}
