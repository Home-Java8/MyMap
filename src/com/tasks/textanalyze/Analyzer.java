//package com.textanalyze;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public abstract class Analyzer {
//
//    protected int max;
//
//    /** На случай если нужных слов будет несколько. */
//    protected final ArrayList<String> neededWords = new ArrayList<>(1);
//
//    protected final HashMap<String, Count> countsWords = new HashMap<>();
//
//    /** @param word передаётся сюда в нижнем регистре */
//    public abstract void put(String word);
//}