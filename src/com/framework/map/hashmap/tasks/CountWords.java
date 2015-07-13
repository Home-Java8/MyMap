package com.framework.map.hashmap.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 25/12/2014
 * {@link http://stoflru.org/questions/26230707/count-the-number-of-words-using-hashmap}
 */
public class CountWords {

    public void readFile() {

        Scanner scanner = null;
        try {
//            scanner = new Scanner(new File("/home/alexandr/IdeaProjects/worked/MySpring/MyMap/test.txt"));
            scanner = new Scanner(new File("test.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList(map.entrySet());

        for (int i = 0; i < map.size(); i++) {
            System.out.println(entries.get(entries.size() - i - 1).getKey()
                    + " " + entries.get(entries.size() - i - 1).getValue());
        }
    }

    public static void main(String[] args) {
        CountWords countWords = new CountWords();
        countWords.readFile();
    }

}