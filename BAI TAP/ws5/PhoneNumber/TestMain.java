/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneNumber;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GIA KINH
 */
public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list of phone numbers");
        System.out.println("-----------------------------------------");
        ArrayList<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
        int choose = 0;
        int area;
        String number;
        String codeCountry; 
        do{
            System.out.print("Type of phone number ? (1 – local phone, 2 – Inter phone number, 0 - exit): ");
            choose = scanner.nextInt();
            switch(choose){
                case 1:
                    System.out.print("Enter area code: ");
                    area = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter number: ");
                    number = scanner.next();
                    scanner.nextLine();
                    phoneNumbers.add(new PhoneNumber(area, number));
                    break;
                case 2:
                    System.out.print("Enter country code: ");
                    codeCountry = scanner.next();
                    scanner.nextLine();
                    System.out.print("Enter area code: ");
                    area = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter number: ");
                    number = scanner.next();
                    scanner.nextLine();
                    phoneNumbers.add(new IntPhoneNumber(codeCountry,area, number));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please enter [0->2]");
                    break;
            }
        }while(choose !=0);
        System.out.println("List of phone number:");
        System.out.println("----------------------------------------");
        for (PhoneNumber phoneNumber: phoneNumbers) {
            phoneNumber.display();
        }
    }
}
