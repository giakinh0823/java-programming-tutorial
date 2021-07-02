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
public class Exchange extends ArrayList<String>{
    public Exchange() {
        this.add("USD;VND;17000");
        this.add("EUR;USD;1.2");
        this.add("USD;IDN;15789");
        this.add("USD;EUR;0.83");
        this.add("CAD;IDN;16869");
    }

    public double convert(Rate rate) {
        for (String rateString : this) {
            StringTokenizer tokenizer = new StringTokenizer(rateString, ";");
            String tokenizer_code1 = tokenizer.nextToken();
            String tokenizer_code2 = tokenizer.nextToken();
            Double tokenizer_amount = Double.parseDouble(tokenizer.nextToken());
            if (rate.getCODE1().toLowerCase().equals(tokenizer_code1.toLowerCase()) && rate.getCODE2().toLowerCase().equals(tokenizer_code2.toLowerCase())) {
                return tokenizer_amount * rate.getRate();
            }
        }
        System.out.println("Can not found code!!!!");
        return rate.getRate();
    }
}
