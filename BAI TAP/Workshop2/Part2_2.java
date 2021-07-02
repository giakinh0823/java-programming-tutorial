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
public class Part2_2 {

    public String inputString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        if (!Pattern.matches("SE\\d+", str)) {
            throw new Exception();
        }
        return str;
    }

    public static void main(String[] args) {
        do {
            try {
                Part2_2 part2 = new Part2_2();
                String str = part2.inputString();
                System.out.println("The string is " + str);
                break;
            } catch (Exception e) {
                System.out.println("The string is invaild");
            }
        } while (true);
    }
}
