/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subclasses;

/**
 *
 * @author GIA KINH
 */
public class TestMain {

    public static void main(String[] args) {
        Student s1 = new Student("PRO192", 2021, 300, "Ha Gia Kinh", "Ha Noi");
        System.out.println(s1);
        s1.setAddress("Quang Binh");
        System.out.println(s1);
        s1.setFee(300);
        s1.setProgram("MAD101");
        s1.setYear(2022);
        System.out.println("Name is " + s1.getName());
        System.out.println("Adress is " + s1.getAddress());
        System.out.println("Fee is " + s1.getFee());
        System.out.println("Program is " + s1.getProgram());
        System.out.println("Year is " + s1.getYear());
        
        Staff sf1 = new Staff("Dieu Linh", "Viet Nam", "Ba Vi", 250);
        System.out.println(sf1);

        sf1.setAddress("Japan");
        System.out.println(sf1);
        sf1.setPay(300);
        sf1.setSchool("Tokyo Universe");
        System.out.println("Name is " + sf1.getName());
        System.out.println("Adress is " + sf1.getAddress());
        System.out.println("Pay is " + sf1.getPay());
        System.out.println("School is " + sf1.getSchool());
    }
}
