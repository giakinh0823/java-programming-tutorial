/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BigInteger;

import java.math.BigInteger;

/**
 *
 * @author GIA KINH
 */
public class TestBigInteger {
    public static void main (String [] args) { 
      BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111"); 
      BigInteger i2 = new BigInteger("2222222222222343242222222234234234234212222222222222222222"); 
      System.out.println (i1.add(i2));
   } 
}
