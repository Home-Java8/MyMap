package com.example.b;

import java.util.Objects;

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
public class PersonB {

    public final String name;
    public final int age;

    public PersonB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        PersonB that = (PersonB) obj;

        // 'age' comparing
        if (age != that.age) {
            return false;
        }
        // 'name' comparing
        return Objects.equals(this.name, that.name);
    }

    @Override
    public String toString() {
        return "PersonB{name='" + name + '\'' + ", age=" + age + '}';
    }

}
