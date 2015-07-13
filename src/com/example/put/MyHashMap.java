package com.example.put;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alexandr on 13.07.15.
 */
public class MyHashMap {

    public static void main(String[] args) {
        Person sasha = new Person(14, "Kiev");
        Person nilolay = new Person(15, "Odessa");
        Person vasya = new Person(10, "Nikolaev");
        Person petya = new Person(11, "Dnepropetrovsk");
        Person misha = new Person(13, "Vinnitca");

        System.out.println("---------------------");

        Map<Person, String> persons = new HashMap<>();
        System.out.println( persons.put(vasya, "vasya") );
        System.out.println( persons.put(petya, "petya") );
        System.out.println( persons.put(misha, "misha") );
        System.out.println( persons.put(sasha, "sasha") );
        System.out.println( persons.put(nilolay, "nilolay") );

        for(Map.Entry person : persons.entrySet())
            System.out.println( person );

        System.out.println("---------------------");

        System.out.println( "nilolay=" + persons.get(new Person(15, "Odessa")) );
        System.out.println( "petya=" + persons.get(new Person(11, "Dnepropetrovsk")) );
        System.out.println( "misha=" + persons.get(new Person(13, "Vinnitca")) );
    }

}
