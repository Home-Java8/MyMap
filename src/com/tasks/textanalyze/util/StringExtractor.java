//package com.textanalyze.util;
//
//import java.lang.reflect.Field;
//
//public class StringExtractor {
//
//    private StringExtractor() {}
//
//    private static Extractor<String, char[]> extractor = new Extractor<String, char[]>() {
//        @Override public char[] extract(String from) {
//            try {
//                Field field = String.class.getDeclaredField("value");
//                field.setAccessible(true);
//                char[] result = (char[]) field.get(from);
//
//                extractor = new NormalExtractor(field);
//
//                return result;
//            } catch (Throwable any) {
//                //<editor-fold defaultstate="collapsed" desc="dummyCopier">
//                DummyCopier dummyCopier = new DummyCopier();
//                extractor = dummyCopier;
//                return dummyCopier.extract(from);
//                //</editor-fold>
//            }
//        }
//    };
//
//    private static class NormalExtractor implements Extractor<String, char[]> {
//
//        private final Field field;
//        public NormalExtractor(Field field) {
//            this.field = field;
//        }
//
//        @Override public char[] extract(String from) {
//            try {
//                return (char[]) field.get(from);
//            } catch (IllegalArgumentException | IllegalAccessException reallyDoubltWhatThisWillBeThrown) {
//                //<editor-fold defaultstate="collapsed" desc="dummyCopier">
//                DummyCopier dummyCopier = new DummyCopier();
//                extractor = dummyCopier;
//                return dummyCopier.extract(from);
//                //</editor-fold>
//            }
//        }
//    }
//
//    private static class DummyCopier implements Extractor<String, char[]> {
//        @Override public char[] extract(String from) {
//            return from.toCharArray();
//        }
//    }
//
//    /**
//     * ОСТОРОЖНО! Может привести к изменению строки (по контракту immutable объекта).
//     * Возможно есть ссылки на экземпляр этой строки, там где мы не предпологали.
//     */
//    @Deprecated
//    public static char[] extractChars(String text) {
//        return extractor.extract(text);
//    }
//}