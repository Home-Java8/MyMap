package com.example.put;

/**
 * Created by alexandr on 13.07.15.
 */
public class MyList {

    private int capacity;
    private int[] data;
    private int lenght;

    public MyList(){}
    public MyList(int capacity){
        this.capacity = capacity;
        data = new int[capacity];
        lenght = -1;
    }

    public boolean put(int value){
        if(lenght < capacity){
            lenght++;
            data[lenght] = value;
            return true;
        } else {
            return false;
        }
    }

    public int remote(){
        if(-1 < lenght){
            int value = data[lenght];
            lenght--;
            return value;
        } else {
            throw new NullPointerException("-1");
        }
    }


    public static void main(String[] args) {
        MyList list = new MyList(10);
        list.put(123);
        list.put(456);
        list.put(789);
        list.put(222);
        list.put(444);

        System.out.println(list.remote());
        System.out.println(list.remote());
        System.out.println(list.remote());
        System.out.println(list.remote());
        System.out.println(list.remote());
    }
}
