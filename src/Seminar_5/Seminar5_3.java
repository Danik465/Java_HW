package Seminar_5;

import java.util.*;

public class Seminar5_3 {
    /**
     * Взять набор слов, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
     * Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
     */
    public static void main(String[] args) {


        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        отсортироватьПоДлине(text);
    }

    private static void отсортироватьПоДлине(String text) {
        String[]  words = text.split(" ");
        Map<Integer, List<String>> treeMap = new TreeMap<>(); // [длина, список слов]
        // treeMap -> list

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int len = word.length();
            if(!treeMap.containsKey(len)){
                List<String > arr = new ArrayList<>();
                arr.add(word);
                treeMap.put(len, arr);
            }else {
                List<String>  arr = treeMap.get(len);
                arr.add(word);
                treeMap.put(len, arr);
            }
        }
        List<String> newArr= new ArrayList<>();
        for (int key : treeMap.keySet()) {
            newArr.addAll(treeMap.get(key));
        }
        System.out.println(newArr);
        System.out.println(treeMap);

    }

    private static void отсортироватьПоДлине1(String text) {
        String[] words = text.split(" ");
        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(Arrays.toString(words));
    }

}
