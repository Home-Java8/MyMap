package com.framework.map.hashmap.example;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 25/12/2014
 * {@link http://cybern.ru/java-map.html}
 */
public class StudentHashtable {

    public static void main(String[] args){
        Map<String, Student> map = new Hashtable<String, Student>();
        Student         student1 = new Student(1, "Alex", 18);
        Student         student2 = new Student(2, "Dmitry", 23);
        Student         student3 = new Student(3, "Patric", 35);
        map.put("Alex", student1);   // добавляю студента Alex по ключу Alex
        map.put("Dmitry", student2); // добавляю студента Alex по ключу Alex
        map.put("Patric", student3); // добавляю студента Alex по ключу Alex

//        System.out.println( map.get("Alex") );            // работает
//        System.out.println( map.get("Al" + "ex") );       // работает
//        System.out.println( map.get(student1.getName()) ); // работает
//
//        String s = "a".toUpperCase() + "lex";             // пытаюсь обмануть компилятор
//        System.out.println( map.get(s) );                 // работает

        for(String student: map.keySet()){
            System.out.println(student  + " : " + map.get(student));
        }
    }
}
