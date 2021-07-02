/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop6;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author giaki
 */
public class Inputter {

    public static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String msg, int min, int max) {
        if (min > max) {
            int z = min;
            min = max;
            max = z;
        }
        int data;
        do {
            System.out.print(msg);
            data = Integer.parseInt(scanner.nextLine());
        } while (data < min || data > max);
        return data;
    }

    public static String inputStr(String msg) {
        System.out.print(msg);
        String data = scanner.nextLine().trim();
        return data;
    }

    public static String inputNonBlankStr(String msg) {
        String data = null;
        do {
            System.out.print(msg);
            data = scanner.nextLine().trim();
        } while (data.length() == 0 || data == null);
        return data;
    }

    public static String inputPattern(String msg, String pattern) {
        String data = null;
        do {
            System.out.print(msg);
            data = scanner.nextLine().trim();
        } while (!data.matches(pattern));
        return data;
    }
}
