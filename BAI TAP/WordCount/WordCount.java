/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordCount;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author giaki
 */
public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().trim();
        StringTokenizer token = new StringTokenizer(str," ");
        Hashtable<String, Integer> hashWords = new Hashtable<String, Integer>(100,0.2f);
        while(token.hasMoreTokens()){
            String word = token.nextToken().toLowerCase();
            hashWords.put(word, hashWords.containsKey(word.toLowerCase())? hashWords.get(word)+1 :1);
        }
//        Enumeration<String> enumeration = hashWords.keys();
//        while (enumeration.hasMoreElements()) {
//            String key = enumeration.nextElement();
//            System.out.println(key + " " + hashWords.get(key));
//        }
        hashWords.forEach((key,value)-> System.out.println(key + " "+ value));
    }
}
