package com.luxoft;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by Саша on 15.07.2015.
 * ******************************
 * {@link http://beginnersbook.com/2013/12/hashmap-in-java-with-example/}
 * {@link http://beginnersbook.com/2013/12/treemap-in-java-with-example/}
 */

public class Details {

    public static void main(String args[]) {
      /* This is how to declare HashMap */
        Map<Integer, String> hashmap = new HashMap<>();

      /* Adding elements to HashMap */
        hashmap.put(12, "Chaitanya");
        hashmap.put(2, "Rahul");
        hashmap.put(7, "Singh");
        hashmap.put(49, "Ajeet");
        hashmap.put(3, "Anuj");

        /* Display content using Iterator */
        Set set = hashmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Entry entry = (Entry)iterator.next();
            System.out.println("(key)" + entry.getKey() + " -> (value)" + entry.getValue());
        }

        System.out.println("------------------------------------");

        /* Get values based on key */
        String var = hashmap.get(7);
        System.out.println("Value at index '7' is: " + var);

        System.out.println("------------------------------------");

        /* Remove values based on key */
        hashmap.remove(7);
        System.out.println("Map key and values after removal:");
        Set set2 = hashmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Entry entry2 = (Entry)iterator2.next();
            System.out.println("(key)" + entry2.getKey() + " -> (value)" + entry2.getValue());
        }



        System.out.println("------------------------------------");

        /* This is how to declare TreeMap */
        TreeMap<Integer, String> tmap = new TreeMap<>();

        /* Adding elements to TreeMap */
        tmap.put(1, "Data1");
        tmap.put(23, "Data2");
        tmap.put(70, "Data3");
        tmap.put(4, "Data4");
        tmap.put(2, "Data5");

        /* Display content using Iterator */
        Set set3 = tmap.entrySet();
        Iterator iterator3 = set3.iterator();
        while(iterator3.hasNext()) {
            Entry entry3 = (Entry)iterator3.next();
            System.out.println("(key)" + entry3.getKey() + " -> (value)" + entry3.getValue());
        }
    }
}
