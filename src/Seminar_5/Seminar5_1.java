package Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class Seminar5_1 {
    public static void main(String[] args) {

    }
    private static boolean isMapped(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>(); // [p -> t, a -> i]
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            char first = chars1[i];
            char second = chars2[i];
            if (!map.containsKey(first)) {
                map.put(first, second);
            } else if (first != second) {
                return false;
            }
        }

        return true;
    }

}
