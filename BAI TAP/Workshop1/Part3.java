/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author giaki
 */

class Student{
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}

public class Part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> listStudents = new ArrayList<Student>();
        System.out.print("Enter number student: ");
        int n=scanner.nextInt();
        scanner.nextLine();
        for(int i=0 ; i<n;i++){
            System.out.print("Enter name student " + (i+1) + ": ");
            String name=scanner.nextLine();
            name=name.trim().replaceAll("\\s+", " ");
            StringTokenizer token = new StringTokenizer(name, " ");
            name="";
            while(token.hasMoreTokens()){
                String newName =token.nextToken();
                name+=newName.substring(0,1).toUpperCase() + newName.substring(1) + " ";
            }
            Student student = new Student(name.trim());
            listStudents.add(student);
        }
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }
}