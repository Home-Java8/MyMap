package com._example.put;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandr on 13.07.15.
 */
public class MyArrayList {

    public static void main(String[] args) {
        Person sasha = new Person(14, "Kiev");
        Person nilolay = new Person(15, "Odessa");
        Person vasya = new Person(10, "Nikolaev");
        Person petya = new Person(11, "Dnepropetrovsk");
        Person misha = new Person(13, "Vinnitca");

        List<Person> persons = new ArrayList<>();
        System.out.println( persons.add(vasya) );
        System.out.println( persons.add(petya) );
        System.out.println( persons.add(misha) );
        System.out.println( persons.add(sasha) );
        System.out.println( persons.add(nilolay) );

        for(Person person : persons)
            System.out.println( person );
    }

}
