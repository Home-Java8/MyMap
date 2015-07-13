package com.example.a;

import java.util.ArrayList;
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
 * Первая попытка (нет hashCode)
 */
public class App {

    public static void main(String[] args) {
        /*  Посмотрим, как она ведет себя с List-ом (ХОРОШО ведет) */
        Collection<PersonA> coll = new ArrayList<>();
        coll.add(new PersonA("Mike", 45));
        System.out.println("coll = " + coll);
        System.out.println("contains: " + coll.contains(new PersonA("Mike", 45)));
        System.out.println("remove: " + coll.remove(new PersonA("Mike", 45)));
        System.out.println("coll = " + coll);
        System.out.println("contains: " + coll.contains(new PersonA("Mike", 45)));
        System.out.println("remove: " + coll.remove(new PersonA("Mike", 45)));

        /* Посмотрим, как она ведет себя с HashSet-ом (ПЛОХО ведет: не обнаруживает в коллекции и не удаляет) */
//        Collection<PersonA> coll = new HashSet<>();
//        coll.add(new PersonA("Mike", 45));
//        System.out.println("coll = " + coll);
//        System.out.println("contains: " + coll.contains(new PersonA("Mike", 45)));
//        System.out.println("remove: " + coll.remove(new PersonA("Mike", 45)));
//        System.out.println("coll = " + coll);

        /* А вот для стандартного класса java.lang.String – все отлично */
//        Collection<String> coll = new HashSet<>();
//        coll.add("Mike-45");
//        System.out.println("coll = " + coll);
//        System.out.println("contains: " + coll.contains("Mike-45"));
//        System.out.println("remove: " + coll.remove("Mike-45"));
//        System.out.println("coll = " + coll);
//        System.out.println("contains: " + coll.contains("Mike-45"));
//        System.out.println("remove: " + coll.remove("Mike-45"));

        /* И для java.lang.String не допускает дубликатов */
//        Collection<String> coll = new HashSet<>();
//        System.out.println(coll.add("Mike-45"));
//        System.out.println(coll.add("Mike-45"));
//        System.out.println("coll = " + coll);

        /* Для нашего же класса – допускает дубликаты */
//        Collection<PersonA> coll = new HashSet<>();
//        System.out.println(coll.add(new PersonA("Mike", 45)));
//        System.out.println(coll.add(new PersonA("Mike", 45)));
//        System.out.println("coll = " + coll);
    }

}
