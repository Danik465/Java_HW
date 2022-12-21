package HomeWork04;

import java.sql.Array;
import java.util.*;

public class HomeWork04 {

    /**
     * 0. Поиграться с разными коллекциями (все которые знаете): создавать, добавлять элементы, печатать.
     * Collection, List, Queue, Deque
     * ArrayList, LinkedList, ArrayDeque
     *
     * 1. Реализовать консольное приложение, которое:
     * Принимает от пользователя строку вида
     * text~num
     * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
     * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
     * > first~1
     * > third~3
     * > print~1
     * < first
     * > print~2
     * < throw new IllegalArgumentException(); (напечатать, что такого элемента нет)
     *
     * 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
     * private static <T> List<T> reverse(LinkedList<T> source) {
     *    return null;
     * }
     */
    public static void main(String[] args) {

        System.out.println("Введите строку вида  text~num");
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList<>();
        String word = "";
        while (!word.equals("quit")){
            word = sc.next();
            if(word.contains("~")){
                String [] words = word.split("~");

                if(isInteger(words[1])){
                    int numb = Integer.parseInt(words[1]);
                    if(words[0].equals("print")){
                        Element(list, numb);
                    } else if(numb >= list.size()){
                        for (int i = list.size(); i <= numb; i++) {
                            list.add("");
                        }

                        list.add(numb,words[0]);
                    }else if (list.get(numb) != ""){
                        System.out.println("Место заданного элемента занято");
                    }else {

                        list.add(numb,words[0]);
                    }
                }
            }



        }
        System.out.println(list);


//             * 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

        LinkedList<Integer> linkedList = new LinkedList<>();


        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(6);
        linkedList.add(3);
        System.out.println(linkedList);
        System.out.println(reverse(linkedList));

    }

    private static <T> LinkedList<T> reverse(LinkedList<T> source) {

        LinkedList<T> list1 = new LinkedList<>();
        int length = source.size();
        for (int i = 0; i <length ; i++) {
            list1.addFirst(source.get(i));

        }

        return list1;
    }
    public  static void  Element(LinkedList<String > list, int numb){
        System.out.println(list.get(numb));
        list.remove(numb);

    }
    public static boolean isInteger(String list) {
        try {
            Integer.parseInt(list);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
