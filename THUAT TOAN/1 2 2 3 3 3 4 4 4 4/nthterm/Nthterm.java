/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nthterm;

import java.util.Scanner;

/**
 *
 * @author GIA KINH
 */
public class Nthterm {

    /**
     * @param args the command line arguments
     */
    
    public static int nthterm(int n){
        return (int)Math.floor((1+Math.sqrt(1+8*(n-1)))/2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Value: " + nthterm(n));
    }
}
