package day28_ArrayList;



public class StrongPassword {


    public static void main(String[] args) {


        String password = "Cydeozxc@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; //has lower case
        boolean r4 = false; //has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else { // special char
                r4 = true;
            }

          /*
            if(r2 && r3 && r4 && r5){
                break;
            }
            */

        }


        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);


    }


    public static boolean isStrongPassword(String password) {
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; //has lower case
        boolean r4 = false; //has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else { // special char
                r4 = true;
            }

        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }


    public static void strongPassword(String password) {

        /*
        boolean strong = false;

        boolean longerThan8AndWOSpace = password.length()>=8 && password.contains(" ");
        boolean containsUppercase = false;
        boolean containsLowercase = false;
        boolean containsDigit = false;
        boolean containsSpecialChar = false;

        for (int i = 0; i <password.length() ; i++) {

             if(Character.isUpperCase(password.charAt(i))){
                 containsUppercase = true;
             }
            if(Character.isLowerCase(password.charAt(i))){
                containsLowercase = true;
            }

            if(Character.isDigit(password.charAt(i))){
                containsDigit = true;
            }

            if(!Character.isLetterOrDigit(password.charAt(i)) && password.charAt(i) != ' '){
                containsSpecialChar = true;
            }
        }

        if (longerThan8AndWOSpace && containsUppercase && containsLowercase &&containsDigit && containsSpecialChar
        ){
            strong = true;
        }

        System.out.println("strong = " + strong);

         */

    }
}