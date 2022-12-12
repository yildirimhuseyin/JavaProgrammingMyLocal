package day17_While_DoWhile;

import day13_StringClass.StringIntro;

public class FrequencyOfWord_WhileWord {


    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java"))
        {
            str = str.replaceFirst("Java", "");
            frequency++;
        }


        System.out.println(frequency);

        System.out.println("-------------------------------------------------------");

        String sentence = "cat cat cat cat dog dog dog cat cat CAT CAT CAT";
        sentence= str.toLowerCase(); // we are making all the sentence in lower case to compare to lowercase cat
        int countCat = 0;

        while (sentence.contains("cat"))
        {
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println(countCat);

        System.out.println("-------------------------------------------------------");


        String s = "java java java Python python Python";
        s = s.toLowerCase();

        int countJava = 0;
        int countPython = 0;



        while (s.contains("java") || s.contains("python")){

            if (s.contains("java")){
               s =  s.replaceFirst("java","");
                countJava++;
            }

            if
            (s.contains("python")){
              s =  s.replaceFirst("python","");
                countPython++;

            }
        }


        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);
    }
}