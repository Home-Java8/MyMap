//package com.textanalyze;
//
//import static java.lang.System.out;
//
//public class LineAnalyzer extends Analyzer {
//
//    /** @param word передаётся сюда в нижнем регистре */
//    @Override public void put(String word) {
//        int length = word.length();
//
//        if (length > max) {
//            neededWords.clear();
//            neededWords.add(word);
//            max = length;
//
//            countsWords.put(word, new Count());
//            return;
//        }
//
//        if (length == max && !neededWords.contains(word)) {
//            neededWords.add(word);
//        }
//
//        Count count = countsWords.get(word);
//        if (count != null) {
//            count.value++;
//        } else {
//            countsWords.put(word, new Count());
//        }
//    }
//
//    public int maxLength() {
//        return max;
//    }
//
//    //<editor-fold defaultstate="collapsed" desc="reuseCount">
//    private int reuseCount;
//
//    public int reuseCount() {
//        return reuseCount;
//    }
//    //</editor-fold>
//
//    public void clear() {
//        neededWords.clear();
//        countsWords.clear();
//        max = 0;
//        reuseCount++;
//    }
//
//    public void printInfo() {
//        out.print("Строка # ");
//        out.println(reuseCount);
//
//        if (neededWords.isEmpty()) {
//            out.println("Слов нет.");
//        } else {
//            if (neededWords.size() == 1) {
//                out.print("Самое длинное слово: ");
//                out.println(neededWords.get(0));
//            } else {
//                out.print("Самые длинные словa: ");
//                out.println(neededWords);
//            }
//
//            out.print("Повторения: ");
//            out.println(countsWords);
//            out.println("------------------------------------------------");
//        }
//    }
//}