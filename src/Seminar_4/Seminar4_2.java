package Seminar_4;

import java.util.*;

public class Seminar4_2 {
    /**
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя и “запоминает” строки.
     * Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * Если введено revert, удаляет предыдущую введенную строку из памяти.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String > deque = new ArrayDeque<>();
        String index = "";

        do {
            index = sc.nextLine();
            deque.addFirst(index);
            if(index.equals("quit") || index.equals("revert")){
                deque.pollFirst();
            }

        }
        while (!index.equals("quit"));

        System.out.println(deque);

        // java ....
        // > string
        // > ok
        // > java
        // > print
        // < [java, ok, string]
        // > revert
        // > print
        // < [ok, string]

    }

    public static Deque<String> print(Deque<String> list){
        return null;
    }


}
