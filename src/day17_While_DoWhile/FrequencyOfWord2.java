package day17_While_DoWhile;
/*

 */
public class FrequencyOfWord2 {


    public static void main(String[] args) {

        String sentence =  "Cat Cat Dog Dog cAT CAT CaT";

        String word = "Cat";

        int result = 0;


        for (int i = 0; i < sentence.length()-2 ; i++) {

            String java = sentence.substring(i,i+3);

            if (java.equalsIgnoreCase(word)){
                ++result;
            }

        }

        System.out.println("result = " + result);




    }
}
