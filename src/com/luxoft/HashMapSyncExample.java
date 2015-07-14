package com.luxoft;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;

/**
 * Created by Саша on 15.07.2015.
 * ******************************
 * {@link http://beginnersbook.com/2013/12/how-to-synchronize-hashmap-in-java-with-example/}
 */

public class HashMapSyncExample {

    public static void main(String args[]) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(2, "Anil");
        hashmap.put(44, "Ajit");
        hashmap.put(1, "Brad");
        hashmap.put(4, "Sachin");
        hashmap.put(88, "XYZ");

        Map map = Collections.synchronizedMap(hashmap);
        Set set = map.entrySet();
        synchronized(map){
            Iterator iterator = set.iterator();
            /* Display elements */
            while(iterator.hasNext()) {
                Entry entry = (Entry)iterator.next();
                System.out.println(entry.getKey() + ": '" + entry.getValue() + "'");
            }
        }
    }

}