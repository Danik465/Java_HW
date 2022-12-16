package HomeWorks03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class HW3 {
    public static void main(String[] args) {
/**
 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
 (в языке уже есть что-то готовое для этого)
 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и
 среднее арифметическое из этого списка.
 */
        Scanner iS = new Scanner(System.in);
        int i = 10;

        ArrayList<Integer> arr = new ArrayList<>();

        while (i>0){
            arr.add(iS.nextInt());
            i--;
        }


        MaxMin(arr);
        arr.removeIf(n-> n%2==0); // функция удаления элементов из массива по условию
        System.out.println(arr);
    }

    public static void MaxMin(ArrayList<Integer> list){

        System.out.println("" +Collections.max(list)); // функция нахождения максимального значения
        System.out.println(Collections.min(list)); // функция нахождения минимального значения
        float sum = 0;
        for (int i = 0; i < list.size(); i++) {

            sum+= list.get(i);


        }
        System.out.println(sum/list.size());

    }

}
