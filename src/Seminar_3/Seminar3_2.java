package Seminar_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seminar3_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("s1");
        list.add("s1");
        list.add("s1");
        list.add("s3");
        list.add("s2");
        list.add("s3");
        list.add("s2");
        list.add("s3");
        list.add("s2");

        System.out.println(list);
        removeDuplicates(list);
    }
    private static void removeDuplicates(List<String> list) {
        // TODO: 13.12.2022

        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {
                if (word.equals(list.get(j))) {
                    list.remove(j--);
                }
            }
        }
        System.out.println(list);
//        public static void removeDuplicates (List < String > list) {
//            for (int i = 0; i < list.size(); i++) {
//                String ind = list.get(i);
//                for (int j = i + 1; j < list.size(); j++) {
//                    if (ind.equals(list.get(j))) {
//                        list.remove(j--);
//
//                    }
//                }
//            }
//        }
    }
}
