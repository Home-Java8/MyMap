package com.luxoft;

/**
 * Created by Саша on 15.07.2015.
 * ******************************
 * {@link http://examples.javacodegeeks.com/java-basics/java-map-example/}
 */

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> vehicles = new ConcurrentHashMap();

        /* Add some vehicles. */
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

        System.out.println("Total vehicles: " + vehicles.size());

        /* Iterate over all vehicles, using the keySet method. */
        for(String key: vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));

        System.out.println("-----------------------------------");

        String searchKey = "Audi";
        if(vehicles.containsKey(searchKey))
            System.out.println("Found total '" + vehicles.get(searchKey) + "' " + searchKey + " cars!\n");

        Enumeration elems = vehicles.elements();
        while(elems.hasMoreElements())
            System.out.println(elems.nextElement());

        System.out.println("-----------------------------------");

        Integer val = vehicles.putIfAbsent("Audi", 9);
        if(val != null)
            System.out.println("Audi was found in the map and its value was updated!");

        val = vehicles.putIfAbsent("Nissan", 9);
        if(val == null)
            System.out.println("Nissan wasn't found in map, thus a new pair was created!");

        System.out.println("-----------------------------------");

        // The next statements throw a NullPointerException, if uncommented.
        //vehicles.put("Nissan", null);
        //vehicles.put(null, 6);

        /* Clear all values. */
        vehicles.clear();

        /* Equals to zero. */
        System.out.println("After clear operation, size: " + vehicles.size());
    }
}
