package day27_WrapperClasses;

public class WrapperClassMethods {


    public static void main(String[] args) {


        String str = "123";

        int num = Integer.parseInt(str);

        System.out.println(num+1);// 124
        System.out.println(str+1);// 1231

        System.out.println("-------------------------------------------------------------------------------");
        String str2 = "10.5";

        double num2 =  Double.parseDouble(str2); // double

        System.out.println(num2+1);


        int max= Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        System.out.println("-------------------------------------------------------------------------------");

        String s1 = "true";

        boolean r1= Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("-------------------------------------------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); // Integer
        int y = Integer.valueOf(s2); // Integer

        System.out.println(x);
        System.out.println(y);

        System.out.println("-------------------------------------------------------------------------------");

        String s3 = "1.5";

        double z = Double.valueOf(s3);// Double

        System.out.println(z);

        System.out.println("-------------------------------------------------------------------------------");

        // isDigit()

        char ch1 = 'A';

        boolean r2 =Character.isDigit(ch1);


        // isLetter()

        boolean r3 = Character.isLetter(ch1);


        // specialChar
        boolean r4= !Character.isLetterOrDigit(ch1); // checking if character is special character

        // isUpperCase()

        boolean r5 = Character.isUpperCase(ch1);

        // isLowerCase()
        boolean r6 = Character.isLowerCase(ch1);




        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("-------------------------------------------------------------------------------");

        String s = "asda1asdsd2dawd3ft4";
        int sum = 0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+each);

            }
        }


        System.out.println("sum = " + sum);
    }



}
