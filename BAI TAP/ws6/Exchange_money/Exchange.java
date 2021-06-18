/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange_money;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author GIA KINH
 */
public class Exchange {

    public static ArrayList<String> listRates = new ArrayList<String>();

    public static void createRete() {
        listRates.add("USD;VND;17000");
        listRates.add("EUR;USD;1.2");
        listRates.add("USD;IDN;15789");
        listRates.add("USD;EUR;0.83");
        listRates.add("CAD;IDN;16869");
    }

    public double convert(String code1, String code2, double amount) {
        createRete();
        for (String rateString : listRates) {
            StringTokenizer tokenizer = new StringTokenizer(rateString, ";");
            String tokenizer_code1 = tokenizer.nextToken();
            String tokenizer_code2 = tokenizer.nextToken();
            Double tokenizer_amount = Double.parseDouble(tokenizer.nextToken());
            if (code1.toLowerCase().equals(tokenizer_code1.toLowerCase()) && code2.toLowerCase().equals(tokenizer_code2.toLowerCase())) {
                return tokenizer_amount * amount;
            }
        }
        System.out.println("Can not found code!!!!");
        return amount;
    }
}
