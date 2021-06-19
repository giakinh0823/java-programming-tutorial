/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GIA KINH
 */
public class Dictionary {

    public static ArrayList<String> listwords = new ArrayList<String>();

    public static void readDataFormFile() {
        File file = new File("D:\\FPT UNIVERSITY\\STUDY\\KY 2\\PRO\\BIN\\STRING WORK SHOP\\String_workshop\\src\\Dictionary\\en-vi.txt");
        try {
            if (file.exists()) {
                Scanner scanner = new Scanner(file);
                while(scanner.hasNextLine()){
                    String data = scanner.nextLine();
                    listwords.add(data.trim().replaceAll("\\s+", " "));
                }
            }else{
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    System.out.println("Can not create file");
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File data not found");
        }
    }

    public Dictionary() {
        readDataFormFile();
    }
    

    public String lookup(String word) {
        for (String wordString : listwords) {
            StringTokenizer tokenizer = new StringTokenizer(wordString, ":");
            String english = tokenizer.nextToken().toLowerCase().trim();
            String vietname = tokenizer.nextToken().toLowerCase().trim();
            if (word.toLowerCase().equals(english)) {
                return vietname;
            }
        }
        return "not found";
    }
}
