
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyString implements IString{
    
  
    @Override
    public int f1(String str) {
        return str.replaceAll("[^2357]", "").length();
    }

    @Override
    public String f2(String str) {
        ArrayList<String> listString = new ArrayList<String>();
        StringTokenizer token = new StringTokenizer(str.trim(), " ");
        while(token.hasMoreTokens()){
            listString.add(token.nextToken());
        }
        Collections.reverse(listString);
        str="";
        for(String item: listString){
            str+=item+" ";
        }
        return str.trim();
    }
    
}
