package Seminar_2;

public class Seminar2_2 {
    public static void main(String[] args) {
        /**
         * aaaabbbcdd -> a4b3cd2
         */
        String  str = "ab";
        String res = compress(str);
        System.out.println(res);

    }
        private static String compress(String source) {
            int count = 1;
            StringBuilder st = new StringBuilder(source);
            char simple = source.charAt(0);
            for (int i = 1; i < source.length(); i++) {
                if(source.charAt(i) == simple){
                    count++;
                }else{
                    st.append(simple).append(count);
                    count = 1;
                    simple = source.charAt(i);

                }

            }
            st.append(simple).append(count);

        return  st.toString();
        }

}
