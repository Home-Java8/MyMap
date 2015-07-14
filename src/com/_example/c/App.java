package com._example.c;

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
 * Сравнение второй и третей попыток: Обе – корректны, но третья ПОЗВОЛЯЕТ HashSet РАБОТАТЬ НАМНОГО БЫСТРЕЕ.
 */
public class App {

    public static void main(String[] args) {
        /* Скорость второй реализации */
//        Collection<PersonB> coll = new HashSet<>();
//        long t0 = System.nanoTime();
//        for (int k = 0; k < 30000; k++) {
//            // add
//            coll.add(new PersonB("", k));
//        }
//        long t1 = System.nanoTime();
//        System.out.println("dT(add)      = " + (t1 - t0));
//
//        long t2 = System.nanoTime();
//        // contains
//        coll.contains(new PersonC("", -1));
//        long t3 = System.nanoTime();
//        System.out.println("dT(contains) = " + (t3 - t2));

        /* Скорость третей реализации */
        /* Как видим на добавлении (add) выигрыш в 80 раз, на проверке вхождения (contains) – более чем в 200 раз */
        Collection<PersonC> coll = new HashSet<>();
        long t0 = System.nanoTime();
        for (int k = 0; k < 30_000; k++) {
            // add
            coll.add(new PersonC("", k));
        }
        long t1 = System.nanoTime();
        System.out.println("dT(add)      = " + (t1 - t0));

        long t2 = System.nanoTime();
        // contains
        coll.contains(new PersonC("", -1));
        long t3 = System.nanoTime();
        System.out.println("dT(contains) = " + (t3 - t2));
    }

}
