package com.framework.map.hashmap.tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 25/12/2014
 * {@link http://fkn.ktu10.com/?q=node/6024}
 */
public class CountWords2 {

    public static void main(String[] args) {
        Map<String, Integer>            map = new HashMap<String, Integer>(); // для подсчёта вхождений
        Map.Entry<String, Integer> maxEntry = null;                           // будет хранить слово с максимальным числом вхождений

//        String []values = {"Before","Java","the","way","to","loop","through","an","array","involved","getting","the","number","of","elements","in","the","array","With","the","advent","of","Java","5","we","can","make","our","for","loops","a","little","cleaner","and","easier","to","read","so","looping","through","an","array","is","even","easier","Here's","a","complete","source","code","example","that","demonstrates","the","new"};
        String []values = {"A","binary","tree","is","a","tree","data","structure","in","which","each","node","has","at","most","two","children","which","are","referred","to","as","the","left","child","and","the","right","child","Example","of","binary","tree","I","have","posted","various","programs","on","binary","tree","so","that","you","can","practice","them","for","interviews","and","it","will","also","help","in","understanding","recursion","Binary","tree","traversals","PreOrder","traversal","In","PreOrder","traversal","each","node","is","processed","before","either","of","its","sub-trees","In","simpler","words","Visit","each","node","before","its","children","InOrder","traversal","In","InOrder","traversal","each","node","is","processed","between","subtrees","In","simpler","words","Visit","left","subtree","node","and","then","right","Read","more","at"};
//        String []values = "Поиск или удаление элемента зависит от длины списка, худший случай: когда, все элементы хешируются одну и ту же ячейку. Если функция распределяем n ключей по m ячейкам таблицы равномерно, то в каждом списке будет содержаться порядка k=n/m ключей. Это число называется коэффициентом заполнения хеш-таблицы. этом случае время поиска:  это показано книжке Кормана, могу скинуть ссылку на нее, если интересно.".split(" ");

        // "Подсчёт слов" с помощью hashmap, обходим некоторую коллекцию
        for (String val : values) {
            if (map.containsKey(val)) {
                map.put(val.toString() , (Integer) (map.get(val) + 1)); // если "слово" уже есть наращиваем счётчик для данного слова
            } else {
                map.put(val.toString(), (Integer) (1)); // если такое слово не известно добавляем в индекс со значением = 1
            }
        }

        // обойдём коллекцию и найдём максимальное значение
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
                maxEntry = entry; // если максимум не определен или очередное значение ещё больше то присваем максимуму новое значение
            }
        }

        // после завершения цикла в "maxEntry" лежит элемент с максиальным value (значением)
        System.out.println( maxEntry.toString() );
    }
}