/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author giaki
 */
public class Menu {
    public static int getChoice(ArrayList<String> options){
        int i=1;
        for (String option : options) {
            System.out.println(i+"-"+option);
            i++;
        }
        System.out.print("Choose 1.." + options.size()+": ");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
    
    public static int getChoice(Object[] options){
        int i=1;
        for (Object option : options) {
            System.out.println(i+"-"+option.toString());
            i++;
        }
        System.out.print("Choose 1.." + options.length+": ");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}
