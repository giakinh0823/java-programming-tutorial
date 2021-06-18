/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author GIA KINH
 */
public class Number_String {
    
    public static void menu(){
        System.out.println("1. search words \"me\", \"why\", \"well\"");
        System.out.println("2. \"you\" word appear in @str how many times?");
        System.out.println("3. Replace the first character of each word by its UPPER CASE");
        System.out.println("4. Replace the first character of each word by its LOWER CASE, and the last character of each word by its UPPER CASE");
        System.out.println("5. Extract @str string to an array of words, then display those words by increasing order.");
        System.out.println("6. Give a character named c, remove from @str the first character which is equals to c. ");
        System.out.println("7. Count how many words in @str, display “empty string” if @str is an empty string.");
        System.out.println("8. Print all letters of @str only.");
        System.out.println("9. Reserve @str.");
        System.out.println("10. Replace all letter ‘a’ by ‘A’ and ‘b’ by ‘B’.");
        System.out.println("11. How many upper letters in @str?");
        System.out.println("12. Show menu");
        System.out.println("0. exit");
    }
    
    public static boolean checkMeWhyWell(String string){
        if (string.toLowerCase().contains("me") && string.toLowerCase().contains("why") && string.toLowerCase().contains("well")) {
            return true;
        }
        return false;
    }
    
    public static int countWordYou(String string){
        StringTokenizer tokenizer = new StringTokenizer(string, " ");
        int count=0;
        while(tokenizer.hasMoreTokens()){
            if (tokenizer.nextToken().toLowerCase().equals("you")) {
                count++;
            }
        }
        return count;
    }
    
    public static String upperFisrtCharWord(String string){
        StringTokenizer tokenizer = new StringTokenizer(string, " ");
        String newString = "";
        while(tokenizer.hasMoreTokens()){
            String str = tokenizer.nextToken();
            newString+= str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase() + " ";
        }
        return newString.trim();
    }
    
    public static String upperLastCharWord(String string){
        StringTokenizer tokenizer = new StringTokenizer(string, " ");
        String newString = "";
        while(tokenizer.hasMoreTokens()){
            String str = tokenizer.nextToken();
            newString+= str.substring(0, str.length()-1).toLowerCase()+ str.substring(str.length()-1).toUpperCase() + " ";
        }
        return newString.trim();
    }
    
    public static void sortWord(String string){
        String[] listStrings = string.trim().replaceAll("\\s+", " ").split(" ");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(listStrings));
        Collections.sort(list);
        System.out.println("After string sort word: " + list.toString());
    }
    
    public static String removeCharString(String string, char c){
        StringBuilder stringBuilder = new StringBuilder(string);
        if (string.indexOf(c)!=-1) {
            stringBuilder.deleteCharAt(string.indexOf(c));
            return stringBuilder.toString();
        }
        System.out.println("Can not found character");
        return string;
    }
    
    
    public static int countWords(String string){
        if(!string.isEmpty()){
            String[] listStrings = string.trim().split("\\s+"); 
            return listStrings.length;
        }else{
            System.out.println("Empty String");
            return 0;
        }
    }
    
    public static void showAllLetters(String string){
        System.out.println("All letters: " + string.replaceAll("[^a-zA-Z]", ""));
    }
    
    
    public static String reserveString(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }
    
    public static String replaceLetterAandB(String string){
        return string.replaceAll("a", "A").replaceAll("b", "B");
    }
    
    public static int countUpperLetter(String string){
       String[] liStrings = string.trim().replaceAll("[^A-Z]", " ").replaceAll("\\s+", " ").split(" ");
       return  liStrings.length;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        menu();
        do {
            System.out.print("Select option: ");
            int choose = scanner.nextInt();
            switch(choose){
                case 1:
                    System.out.println("String have contains \"me\", \"why\", \"well\"? " +checkMeWhyWell(string));
                    break;
                case 2:
                    System.out.println("Have "+ countWordYou(string) +" word \"you\" in string");
                    break;
                case 3:
                    string = upperFisrtCharWord(string);
                    System.out.println("After String: " + string);
                    break;
                case 4:
                    string = upperLastCharWord(string);
                    System.out.println("After String: " + string);
                    break;
                case 5:
                    sortWord(string);
                    break;
                case 6:
                    System.out.print("Enter char: ");
                    char c = scanner.next().charAt(0);
                    string = removeCharString(string, c);
                    System.out.println("After string remove char: "+ string);
                    break;
                case 7:
                    int count = countWords(string);
                    if (count > 0) {
                        System.out.println("Words in string: " + count);
                    }
                    break;
                case 8:
                    showAllLetters(string);
                    break;
                case 9:
                    System.out.println("Reserve string: " + reserveString(string));
                    break;
                case 10:
                    string = replaceLetterAandB(string);
                    System.out.println("After string: "+string);
                    break;
                case 11:
                    System.out.println("Have upper letter: "+countUpperLetter(string));
                    break;
                case 12:
                    menu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please enter [0->12]");
                    break;
            }
            if (choose==0) {
                break;
            }
        } while (true);
    }
}
