/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop3.Guitar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author giaki
 */
public class Tester {

    public static void main(String[] args) {
        ArrayList<Guitar> listGuitars = new ArrayList<Guitar>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Guitar guitar = new Guitar("G12" + random.nextInt(10 + 1), random.nextInt((9000 - 1000) + 1) + 1000, "Sony" + i, "Mode" + i, "hardWood" + i, "softWood" + i);
            listGuitars.add(guitar);
        }
        Collections.sort(listGuitars, new Comparator<Guitar>() {
            @Override
            public int compare(Guitar t, Guitar t1) {
                return t.getSerialNumber().compareTo(t1.getSerialNumber());
            }
        });
        for (Guitar guitar : listGuitars) {
            System.out.println(guitar.toString());
        }

        Guitar obj1 = new Guitar();
        Guitar obj2 = new Guitar("G123", 2000, "Sony", "Model123", "hardWood", "softWood");
        System.out.println("State of obj1:");
        obj1.createSound();
        System.out.println("State of obj2:");
        obj2.createSound();

        System.out.println("set price = 3000 of obj1");
        obj1.setPrice(3000);
        System.out.println("get price of obj1:" + obj1.getPrice());

    }
}
