package Seminar_1;

public class Seminar1_2 {
    /**
     * Текст задачи:
     * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
     */
    public static void main(String[] args) {
        int result;
        //int[] array=new int[5];
        int[] array={1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1};
        result=method(array);
        System.out.println(result);
    }



    private static int method(int[] array) {
        int max=0;
        int tmp=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1) {
                tmp++;
            }
            else {
                    if (tmp>max)
                {
                    max=tmp;
                    tmp=0;
                } else {
                    tmp=0;
                }
            }
                if (tmp>max)
                {
                    max=tmp;
                }
        }


        return max;
    }

    }
