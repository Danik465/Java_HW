package Seminar_1;

public class Seminar1_4 {
//    * Задан массив, например, nums = [1,7,3,6,5,6].
//    * Написать программу, которая найдет индекс i для этого массива такой,
//    * что сумма элементов с индексами < i равна сумме элементов с индексами > i.
//    * Если такого индекса нет, то вывести -1
public static void main(String[] args) {

    int[] nums = new int[]{1,7,3,6,5,6};

    System.out.println(new Seminar1_4().index(nums));


}

public  int index (int[] arr){
    int index = -1;
    int leftsum = 0;
    int rightsum = 0;
    for (int i = 1; i < arr.length-1; i++) {
        for (int j = 0; j < arr.length; j++) {
            leftsum+= arr[j];
            rightsum+= arr.length- j;

        }
        if(leftsum == rightsum){
            index = i;
        }else {
            leftsum = 0;
            rightsum = 0;
        }
    }


    return  index;
}





}
