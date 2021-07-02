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
public class Part1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of cols: ");
        int cols = scanner.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "]= ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix inputted: ");
        int  sum=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
                sum+=matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum: "+sum);
        System.out.println("Average: " +(float)sum/(rows*cols));
    }
}
