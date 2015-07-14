package com.luxoft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Lazarchuk Aleksandr
 * @version 1.0
 * @date 15/07/2015
 * {@link http://www.seostella.com/ru/article/2012/08/09/kollekcii-collections-v-java-map.html}
 * {@link http://habrahabr.ru/post/128017/}
 * ********************************************************************************************
 * Интерфейс Map предоставляет три способа для доступа к данным:
 * 1. используя Set из ключей (метод keySet)
 * 2. коллекцию из значений (метод values)
 * 3. Set из пары ключ-значение (метод entrySet)
 *
 * Порядок элементов в Map зависит от реализации интерфейса.
 * Интерфейс Map.Entry, объект которого возвращает метод entrySet(), выглядит следующим образом:
 * public interface Entry {
 *     K getKey();
 *     V getValue();
 *     V setValue(V value);
 * }
 *
 * {@link http://crunchify.com/how-to-convert-hashmap-to-arraylist-in-java/}
 * {@link http://devcolibri.com/4385}
 * {@link http://metanit.com/java/tutorial/5.8.php}
 * {@link http://www.mkyong.com/java/how-to-sort-a-map-in-java/}
 * {@link http://mabp.kiev.ua/2009/02/20/hashmap-comparator/}
 */
public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("1", "b");
        map.put("2", "c");

        for(Entry<String, String> entry : map.entrySet()){
            System.out.println("(key)" + entry.getKey() + " -> (value)" +entry.getValue());
        }

        System.out.println("---------------------------------");

        /* С помощью метода setValue() интерфейса Entry предоставляется возможность изменять значения во время перебора элементов карты */
        Map<String, String> map2 = new HashMap<>();
        map2.put("1", "a");
        map2.put("2", "b");
        map2.put("3", "c");

        for(Entry<String, String> entry : map2.entrySet())
            if("2".equals(entry.getKey()))
                entry.setValue("x");
        System.out.println(map2);

        System.out.println("---------------------------------");
        /*
        * HashMap хранит ключи в хеш-таблице, из-за чего имеет наиболее высокую производительность, но не гарантирует порядок элементов. Может содержать как null-ключи, так и null-значения;
        * TreeMap хранит ключи в отсортированном порядке, из-за чего работает существенно медленнее, чем HashMap. Не может содержать null-ключи, но может содержать null-значения. Сортироваться элементы будут либо в зависимости от реализации интерфейса Comparable, либо используя объект Comparator, который необходимо передать в конструктор TreeMap;
        * LinkedHashMap отличается от HashMap тем, что хранит ключи в порядке их вставки в Map. Эта реализаци Map лишь немного медленнее HashMap. Может содержать как null-ключи, так и null-значения.
        * ***************************
        * Интерфейс Map содержит устаревшую реализацию Hashtable, которую не рекомендуется использовать.
        * Некоторые существенные различия Map и Hashtable приведены ниже:
        */

        Map<String, String> map3 = new HashMap<>();
        map3.put("1", "a");
        map3.put("2", "b");
        map3.put("3", "c");

        for(Iterator<String> iterator = map3.keySet().iterator(); iterator.hasNext();)
            if("2".equals(iterator.next()))
                iterator.remove();
        System.out.println(map3);

        System.out.println("---------------------------------");

        Map<String, String> hashmap = new HashMap<>();
        hashmap = new HashMap<>(hashmap);
        hashmap.put("1", "a");
        hashmap.put("2", "b");
        hashmap.put("3", "c");

        // 1.
        for (Entry<String, String> entry: hashmap.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());
        // 2.
        for (String key: hashmap.keySet())
            System.out.println(hashmap.get(key));
        // 3.
        Iterator<Entry<String,String>> itr = hashmap.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }

}
