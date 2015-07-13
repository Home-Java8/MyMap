package com.example.a;

import java.util.Objects;

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
public class PersonA {

    private String name;
    private int age;

    public PersonA(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == null
           || this.getClass() != obj.getClass() ){
            return false;
        }

        /*
        * 'age' comparing
        * 'name' comparing
        */
        PersonA that = (PersonA) obj;
        if( age != that.age ){
            return false;
        }
        return Objects.equals(this.name, that.name);
    }

    @Override
    public String toString() {
        return "PersonA{name='" + name + '\'' + ", age=" + age + '}';
    }

}
