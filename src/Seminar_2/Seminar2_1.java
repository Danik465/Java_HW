package Seminar_2;

public class Seminar2_1 {
    public static void main(String[] args) {
        /**
         * Дано четное число N (>0) и символы c1 и c2.
         * Написать метод, который вернет строку длины N,
         * которая состоит из чередующихся символов c1 и c2, начиная с c1
         */

        char c1 = '1';
        char c2 = '2';
        int n = 11;

        System.out.println(buildString(n,c1,c2));
    }



    private static String buildString(int n, char c1, char c2) {
        StringBuilder  s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if(i%2 == 0){
                s.append(c1);
            }else s.append(c2);
        }

        return s.toString();
    }
}
