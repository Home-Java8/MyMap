package com._example;

import java.util.HashMap;

/**
 * @author Lazarchuk Aleksandr
 * @version 1.0
 * @date 13/07/2015
 * {@link http://www.programcreek.com/2011/07/java-equals-and-hashcode-contract/}
 * ******************************************************************************
 */
public class Apple {

    private String color;

    public Apple(String color) {
        this.color = color;
    }

    public boolean equals(Object obj) {
        if( !(obj instanceof Apple) )
            return false;

        if( obj == this )
            return true;

        return color.equals( ((Apple) obj).color );
    }

    public static void main(String[] args) {
        Apple a1 = new Apple("green");
        Apple a2 = new Apple("red");

        /* hashMap stores apple type and its quantity */
        HashMap<Apple, Integer> apples = new HashMap<>();
        System.out.println( "put #1: " + apples.put(a1, 10) );
        System.out.println( "put #2: " + apples.put(a2, 20) );
        System.out.println( "get #green: " + apples.get(new Apple("green")) );
    }

}
