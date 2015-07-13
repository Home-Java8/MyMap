//package com.textanalyze;
//
//import java.util.ArrayList;
//
//public class FullTextAnalyzer extends Analyzer {
//
//    public FullTextAnalyzer() {
//        max = 1;
//    }
//
//    /** @param word передаётся сюда в нижнем регистре */
//    @Override public void put(String word) {
//        Count count = countsWords.get(word);
//        if (count != null) {
//            count.value++;
//
//            if (count.value > max) {
//                neededWords.clear();
//                neededWords.add(word);
//                max = count.value;
//            } else if (count.value == max) {
//                neededWords.add(word);
//            }
//
//        } else {
//            countsWords.put(word, new Count());
//        }
//    }
//
//    public ArrayList<String> mostRepeatableWords() {
//        return neededWords;
//    }
//
//    public int maxRepeated() {
//        return max;
//    }
//}