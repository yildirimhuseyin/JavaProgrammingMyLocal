package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence =  "JavaJavaJava";

        String word = "Java";

        int result = 0;


        for (int i = 0; i < sentence.length()-3 ; i++) {

            String java = sentence.substring(i,i+4);

            if (java.equalsIgnoreCase(word)){
                ++result;
            }

        }

        System.out.println("result = " + result);




    }




}
