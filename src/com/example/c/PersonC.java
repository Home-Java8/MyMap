package com.example.c;

import java.util.Objects;

/**
 * @author Lazarchuk Aleksandr
 * @version 1.0
 * @date 13/07/2015
 * {@link http://www.golovachcourses.com/collections-hash/}
 * ***************************************************
 * Лекция 6.5: Коллекции / HashMap/HashSet, hashCode()
 *
 * Третья попытка (hashCode == “calculate”)
 */
public class PersonC {

    public final String name;
    public final int age;

    public PersonC(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return 31 * age + Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        PersonC that = (PersonC) obj;

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
