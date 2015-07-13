package com.example.put;

/**
 * Created by alexandr on 13.07.15.
 */
public class Person {

    private int age;
    private String address;

    public Person(){}
    public Person(int age, String address){
        this.age = age;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Person)) return false;

        Person person = (Person) obj;
        if (age != person.age) return false;
        if (!address.equals(person.address)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + address.hashCode();
        return result;
    }

//    @Override
//    public boolean equals(Object obj){
//        return true;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
