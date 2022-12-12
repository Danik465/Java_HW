package Seminar_1;

import java.util.Scanner;

public class Seminar1_3 {
    /**
     * Текст задачи:
     * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
     * Java по курс на пожаловать Добро
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = sc.nextLine(); // состоит из слов и пробелов

        reverse(text);


        // TODO: 06.12.2022 Развернуть строку и вывести в консоль.


    }
    public  static  void reverse(String text){
        String[] words = text.split(" ");
        String  word = "";



        for (int i = words.length-1; i >=0; i--) {
            for (int j = 0; j < words[i].length(); j++) {
                if(words[i].charAt(j)== ' '){
                    continue;
                }else {
                    word+=words[i].charAt(j);
                }

            }
            word+= " ";

        }
        System.out.println(word);

    }

}
