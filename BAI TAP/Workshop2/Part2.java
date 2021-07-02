/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop2;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author giaki
 */
public class Part2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Enter the string: ");
                String str = scanner.nextLine();
                if (!Pattern.matches("SE\\d+", str)) {
                    throw new Exception();
                }
                System.out.println("The string is " + str);
                break;
            } catch (Exception e) {
                System.out.println("The string is invaild");
            }
        } while (true);

    }
}
