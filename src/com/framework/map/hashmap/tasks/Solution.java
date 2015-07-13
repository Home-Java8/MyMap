package com.framework.map.hashmap.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 25/12/2014
 * {@link http://info.javarush.ru/JavaRush_tasks_discussion/2014/07/01/level10-lesson11-home09.html}
 */

/* Одинаковые слова в списке
 * Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
 * Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка, а второй – число, сколько раз данная строка встречалась в списке.
 * Вывести содержимое словаря на экран.
 */

public class Solution {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list){
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for (int i = 0; i < list.size(); i++){
            String slovo = list.get(i); //разбиваем лист на строки
            int      num = 0; //число для каждого слова

            for(int j = 0; j < list.size(); j++){
                if( slovo.equals(list.get(j)) ){ //подсчет количества слов
                    num++;
                }
            }
            result.put(slovo, num);

            if( list.contains(slovo) ){ //удаляем это слово из листа, т.к. оно уже использовано.
                list.remove(slovo);
            }
        }

        //Напишите тут ваш код
        return result;
    }
}