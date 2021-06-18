/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange_money;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author GIA KINH
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first currency code: ");
        String code1 = scanner.nextLine();
        System.out.print("Enter the second currency code: ");
        String code2 = scanner.nextLine();
        System.out.print("Enter the amount of first currency: ");
        double amount = scanner.nextDouble();
        Rate rate = new Rate(code1, code2, amount);
        Exchange exchange = new Exchange();
        System.out.println("The amount after converted: " + exchange.convert(rate.getCODE1(), rate.getCODE2(), rate.getRate()));

    }
}
