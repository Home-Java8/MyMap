//package com.textanalyze;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import lombok.experimental.ExtensionMethod;
//
//import static java.lang.System.out;
//import static com.jframe.util.StringExtractor.extractChars;
//
//@ExtensionMethod(Character.class)
//public class TextAnalyze {
//
//    private static final String SRC =
//            " \n  Какой- нибудь нибудь  нибудь  текст, \t для примера. Или для примеров?.. " +
//            "Все-таки для примера-примеры.  \n  Или даже какой-нибудь пример-примеР";
//
//    public static void main(String[] a) throws IOException {
//
//        StringBuilder sb = new StringBuilder(100);
//        LineAnalyzer lineAnalyzer = new LineAnalyzer();
//        FullTextAnalyzer fullTextAnalyzer = new FullTextAnalyzer();
//
//        for (char ch : extractChars(SRC)) {
//            if (ch.isLetterOrDigit()) {
//                sb.append(ch.toLowerCase());
//            } else {
//                if (sb.length() > 0) {
//                    String word = sb.toString();
//                    lineAnalyzer.put(word);
//                    fullTextAnalyzer.put(word);
//                    sb.setLength(0);
//                }
//                if (ch == '\n') {
//                    lineAnalyzer.printInfo();
//                    lineAnalyzer.clear();
//                }
//            }
//        }
//
//        if (sb.length() > 0) {
//            String word = sb.toString();
//            lineAnalyzer.put(word);
//            fullTextAnalyzer.put(word);
//
//            lineAnalyzer.printInfo();
//        } else if (lineAnalyzer.maxLength() > 0) {
//            lineAnalyzer.printInfo();
//        }
//
//
//        ArrayList<String> mostRepeatableWords = fullTextAnalyzer.mostRepeatableWords();
//
//        if (mostRepeatableWords.isEmpty()) {
//            out.println("Повторяющихся слов нет");
//        } else {
//            if (mostRepeatableWords.size() == 1) {
//                out.print("Наиболее часто повторяющееся слово: ");
//                out.println(mostRepeatableWords.get(0));
//            } else {
//                out.print("Наиболее часто повторяющееся слова: ");
//                out.println(mostRepeatableWords);
//            }
//            out.print("Повторено: ");
//            out.println(fullTextAnalyzer.maxRepeated());
//        }
//    }
//}