package com._example;

/**
 * Created by alexandr on 13.07.15.
 */
public class My {

    private int age;
    private String name;
    private String surname;
    private int phone_number;
    private String address;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof My)) return false;

        My my = (My) o;

        if (age != my.age) return false;
        if (phone_number != my.phone_number) return false;
        if (address != null ? !address.equals(my.address) : my.address != null) return false;
        if (name != null ? !name.equals(my.name) : my.name != null) return false;
        if (surname != null ? !surname.equals(my.surname) : my.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + phone_number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "My{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone_number=" + phone_number +
                ", address='" + address + '\'' +
                '}';
    }
}
