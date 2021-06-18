/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author GIA KINH
 */
public class Dictionary {
    public static ArrayList<String> listwords = new ArrayList<String>();
    
    public static void createWords(){
        listwords.add("apple: qua tao");
        listwords.add("ball: qua bong");
        listwords.add("cat: con meo");
        listwords.add("dog: con cho");
        listwords.add("elephant: con voi");
        listwords.add("fish: con cao");
        listwords.add("gift: mon qua");
        listwords.add("home: nha");        
    }
    
    public String lookup(String word){
        createWords();
        for(String wordString: listwords){
            StringTokenizer tokenizer = new StringTokenizer(wordString, ":");
            String english = tokenizer.nextToken().toLowerCase().trim();
            String vietname = tokenizer.nextToken().toLowerCase().trim();
            if(word.toLowerCase().equals(english)){
                return vietname;
            }
        }
        return "not found";
    }
}
