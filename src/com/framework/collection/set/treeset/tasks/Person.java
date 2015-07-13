package com.framework.collection.set.treeset.tasks;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 25/12/2014
 * {@link http://www.javable.com/tutorials/fesunov/lesson12/}
 */

public class Person implements Comparable {

    private String name;
    private String phone;

    Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    Person() {
        this(null, null);
    }

    String getName() {
        return name;
    }

    String getPhone() {
        return phone;
    }

    @Override
    public int compareTo(Object another) {
        return name.compareTo( ((Person)another).name );
    }

    @Override
    public String toString() {
        return ("\nФамилия:  " + name + "\nТелефоны: " + phone + "\n");
    }
}