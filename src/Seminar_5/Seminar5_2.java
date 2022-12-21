package Seminar_5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Seminar5_2 {
    /**
     * Написать программу, определяющую правильность расстановки скобок в выражении.
     * Пример 1: () - истина
     * Пример 2: [() - ложь
     * Пример 3: [()] - истина
     * Пример 4: {}[]{()} - истина
     * Пример 5: <{}{()}> - истина
     * Пример 6: {]}{()} - ложь
     */
    public static void main(String[] args) {
        System.out.println(isCorrect("()") + " should be true");
        System.out.println(isCorrect("[()") + " should be false");
        System.out.println(isCorrect("[()]") + " should be true");
        System.out.println(isCorrect("{}[]{()}") + " should be true");
        System.out.println(isCorrect("<{}{()}>") + " should be true");
        System.out.println(isCorrect("{]}{()}") + " should be false");
    }

    private static boolean isCorrect(String sequence) {
        char[] chars = sequence.toCharArray();

        Deque<Character> deq = new ArrayDeque<>();
        for (int i = 0; i < chars.length; i++) {
            if(deq.isEmpty() || chars[i] == '['|| chars[i] == '{'|| chars[i] == '<'|| chars[i] == '('){
                deq.addFirst(chars[i]);


            } else{
                String  char1 = deq.pollFirst().toString();
                String sum = char1 + chars[i];
                if(!sum.equals("()") || !sum.equals("{}") || !sum.equals("<>")|| !sum.equals("[]")){
                    return  false;
                }
            }
            System.out.println(deq);
        }
        return deq.isEmpty();
    }

}
