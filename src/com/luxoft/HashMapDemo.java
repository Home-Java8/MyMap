package com.luxoft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created by Саша on 15.07.2015.
 * ******************************
 * {@link http://www.java-samples.com/showtutorial.php?tutorialid=369}
 */
public class HashMapDemo {

    public static void main(String args[]) {
        /* Create a hash map */
        Map hm = new HashMap();

        /* Put elements to the map */
        hm.put("John Doe", new Double(3434.34));
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Jane Baker", new Double(1378.00));
        hm.put("Todd Hall", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.08));

        /* Get a set of the entries */
        Set set = hm.entrySet();

        /* Get an iterator */
        Iterator iterator = set.iterator();

        /* Display elements */
        while(iterator.hasNext()) {
            Entry entry = (Entry)iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("-------------------------------");

        /* Deposit 1000 into John Doe's account */
        double balance = ((Double)hm.get("John Doe")).doubleValue();
        hm.put("John Doe", new Double(balance + 1000));
        System.out.println("John Doe's new balance: " + hm.get("John Doe"));
    }

}
