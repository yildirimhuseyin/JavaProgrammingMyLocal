package day24_CustomMethod_Return;

public class ReturnMethodsPractice4 {


    public static void main(String[] args) {

        String removedDuplicated = removeDuplicates("aaabbcc");

        System.out.println(removedDuplicated);


    }

    // 1. create a method that can remove duplicated characters from a string and returns the new value
    //					"aaabbcccc" ===> "abc"
    public static String removeDuplicates(String str){


        String result ="";

        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);

            if (!result.contains(""+ch)){
                result += ch;
            }
        }

        return result;

    }
}
