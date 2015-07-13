package com.framework.map.hashmap.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 25/12/2014
 * {@link http://bestpupils.ru/stati/150-zadacha-ob-uprugom-stolknovenii-sharov}
 */
public class MyHashMap {

    public static void main(String[] args) {
        //Create HashMap
        Map<String, String> studentGrades = new HashMap<String, String>();

        //Add Key/Value pairs
        studentGrades.put("Alvin", "A+");
        studentGrades.put("Alan", "A");
        studentGrades.put("Becca", "A-");
        studentGrades.put("Sheila", "B+");

        //find element using key
        System.out.println("(Find element using key)");
        System.out.println("Becca :: " + studentGrades.get("Becca"));

        //remove element
        studentGrades.remove("Becca");

        //Iterate over HashMap
        System.out.println("\n(Iterate over HashMap)");
        for(String key: studentGrades.keySet()){
            System.out.println(key  + " :: " + studentGrades.get(key));
        }
    }

}