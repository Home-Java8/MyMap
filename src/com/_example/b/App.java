package com._example.b;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author Lazarchuk Aleksandr
 * @version 1.0
 * @date 13/07/2015
 * {@link http://www.golovachcourses.com/collections-hash/}
 * ***************************************************
 * Лекция 6.5: Коллекции / HashMap/HashSet, hashCode()
 *
 * Вторая попытка (hashCode == 0)
 */
public class App {

    public static void main(String[] args) {
        Collection<PersonB> coll = new HashSet<>();

        System.out.println("add = " + coll.add(new PersonB("Mike", 45)));
        System.out.println("add = " + coll.add(new PersonB("Mike", 45)));

        System.out.println("coll = " + coll);
        System.out.println("contains: " + coll.contains(new PersonB("Mike", 45)));
        System.out.println("remove: " + coll.remove(new PersonB("Mike", 45)));
        System.out.println("coll = " + coll);
        System.out.println("contains: " + coll.contains(new PersonB("Mike", 45)));
        System.out.println("remove: " + coll.remove(new PersonB("Mike", 45)));
    }

}
