package Seminar_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seminar3_1 {
    /**
     * Заполнить список (названиями планет Солнечной системы) какими-то строкам в произвольном
     * порядке с повторениями.
     * Вывести название каждой планеты и количество его повторений в списке.
     */
    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    Scanner iS = new Scanner(System.in);
    int i = 0;
    while (i<10){
        list.add(iS.next());
        i++;

    }
        Planets((ArrayList<String>) list);
    }
    public static void Planets(ArrayList<String> list){
        List<String> found= new ArrayList<>();
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            String  ind = list.get(i);
            if (!found.contains(ind)) {
            for (int j = i+1; j < list.size(); j++) {
                if (ind.equals(list.get(j))) {
                    count++;
                }
            }
            System.out.println(ind + " " + count);
            count = 1;
            found.add(ind);
        }
        }
    }

}
