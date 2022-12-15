package HomeWorks02;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;

public class HomeWork02 {
    /**
     * 1. Напишите метод, который принимает на вход строку (String) и
     * определяет является ли строка палиндромом (возвращает boolean значение).
     * шалаш
     * abcdedcba
     * <p>
     * 2. Напишите метод, который определит тип (расширение) файлов из текущей папки
     * и выведет в консоль результат вида
     * 1 Расширение файла: txt
     * 2 Расширение файла: pdf
     * 3 Расширение файла:
     * 4 Расширение файла: jpg
     */
    public static void main(String[] args) throws IOException {

        Scanner iS = new Scanner(System.in);
        String str = iS.nextLine();
        System.out.println(palindrom(str));


        Path file = Paths.get("src", "HomeWorks02");
        System.out.println(file.toAbsolutePath());
        printDirInfo(file);

    }

    public static void printDirInfo(Path path) throws IOException {
        List<Path> direct = Files.list(path).collect(Collectors.toList());

        for (int i = 0; i < direct.size(); i++) {
            String dir = direct.get(i).toString();
            if (dir.contains(".")) {
                String[] split = dir.split("\\.");
                System.out.println("Расширение файла: " + split[1]);
            } else {

                System.out.println("Расширение файла: ");
            }


        }
    }

    public static boolean palindrom(String pal) {
        String result = "";
        for (int i = pal.length() - 1; i >= 0; i--) {
            result += pal.charAt(i);
        }
        if (result.equals(pal)) {
            return true;
        } else {
            return false;
        }

    }
}