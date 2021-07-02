/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange_money;

/**
 *
 * @author GIA KINH
 */
public class Rate {
    private String CODE1;
    private String CODE2;
    private double rate;

    public Rate(String CODE1, String CODE2, double rate) {
        this.CODE1 = CODE1;
        this.CODE2 = CODE2;
        this.rate = rate;
    }

    public Rate() {
    }

    public String getCODE1() {
        return CODE1;
    }

    public void setCODE1(String CODE1) {
        this.CODE1 = CODE1;
    }

    public String getCODE2() {
        return CODE2;
    }

    public void setCODE2(String CODE2) {
        this.CODE2 = CODE2;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Rate{" + "CODE1=" + CODE1 + ", CODE2=" + CODE2 + ", rate=" + rate + '}';
    }
    
}
