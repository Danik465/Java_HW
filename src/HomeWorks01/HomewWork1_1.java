package HomeWorks01;

import java.util.Arrays;
import java.util.Scanner;

public class HomewWork1_1 {
    public static void main(String[] args) {
        HomewWork1_1 mn =  new HomewWork1_1();
//        mn.task1();
//        mn.task2();
//        mn.task3();
//        mn.task4();
//        mn.task5();
//        mn.task7();
//        mn.task8();
//        mn.task9();
//        mn.task10();
//        mn.task11();
//        mn.task12();

    }

    public void task1(){
        //1.Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        System.out.println("Введите число n:");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        HomewWork1_1 main = new HomewWork1_1();
        System.out.println("сумма чисел от 1 до n равна: " + main.Sum(n));
        System.out.println();
        System.out.println("Введите число m:");
        int m = iScanner.nextInt();
        System.out.printf("произведение чисел от 1 до m равна: " + main.mult(m));
        iScanner.close();
    }
    int Sum (int n){
        int sum = 0;
        for (int  i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    int mult (int m){
        int mult = 1;
        for (int  i = 1; i <= m; i++) {
            mult = mult * i;
        }
        return mult;
    }

    public void task2() {
//2.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        System.out.println("Введите число a:");
        Scanner iScanner = new Scanner(System.in);
        int a = iScanner.nextInt();
        System.out.println("Введите число b:");
        int b = iScanner.nextInt();
        iScanner.close();
        System.out.println(a+b>=10 && a+b<=20? true:false);
    }

    public void task3(){
//3.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        System.out.println("Введите число:");
        Scanner iScanner = new Scanner(System.in);
        int z = iScanner.nextInt();
        iScanner.close();
        System.out.println(z>=0? "положительное":"отрицательное");

    }

    public void task4(){
//4.Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        System.out.println("Введите число:");
        Scanner iScanner = new Scanner(System.in);
        int z = iScanner.nextInt();
        iScanner.close();
        System.out.println(z>=0? false:true);
    }

    public void task5(){
//5.Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
        System.out.println("ведите строку для повтора:");
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.nextLine();
        System.out.println("Введите число:");
        int k = iScanner.nextInt();
        HomewWork1_1 main = new HomewWork1_1();
        main.string(k,str);
        iScanner.close();
    }
    void string (int k, String stri){
        for (int i = 0; i < k; i++) {
            System.out.println(stri);
        }

    }

    public void task7() {
//7.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
        }
        String array1 = Arrays.toString(array);
        System.out.println(array1);
    }

    public void task8(){
//8.Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        String array2 = Arrays.toString(array);
        System.out.println(array2);
    }
    public void task9(){
//9.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i]<6){
                array[i] = array[i]*2;
            }
        }
        String array3 = Arrays.toString(array);
        System.out.println(array3);
    }
    public void task10(){
//10.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
//(можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i==j) {
                    array[i][j] = 1;
                }
                if (i+j==array.length-1){
                    array[i][j]=1;
                }
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }

    //11.Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public void task11(){
        Scanner iScan = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int len = iScan.nextInt();
        System.out.println("Введите числа:");
        int[] initialValue = new int[len];
        for (int i = 0; i < initialValue.length; i++) {
            initialValue[i] = iScan.nextInt();
        }
        HomewWork1_1 mn = new HomewWork1_1();
        String  arr2 = Arrays.toString (initialValue);
        System.out.println(arr2);

    }
    int[] Array(int len, int[] initialValue) {
        int[] arr = new int[len];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue[index];
            index++;
        }
        return arr;
    }
    public void task12(){
//12.Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        int len = 5;
        int[] arr = new int[]{1,10,4,6,8,4,0,3};
        HomewWork1_1 mn = new HomewWork1_1();

        mn.MaxMin(arr);

    }
    void MaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];

            }
            else if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
