package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        // assignment: '='
        int number = 100;

        System.out.println("number = " + number); //  100

        number = 200;

        System.out.println("number = " + number);// 200 ( number changed

        String word = " Java Programming";
        System.out.println("word = " + word);// Java Programing

        word= " Wooden Spoon";
        System.out.println("word = " + word);// Wooden Spoon

        word = " Cydeo";
        System.out.println("word = " + word);// Cydeo

        word = "Java Programming";
        System.out.println("word = " + word);// Java programming



        System.out.println("----------------------------------------------------------------------");

        // Additions Assignment:
        int x = 100;

        System.out.println(x+200); // 300

        // x = x + 200

        x +=200;
        System.out.println("x = " + x);

        System.out.println("x = " + x);

        String str = " Wooden";

        str += " Spoon";

        System.out.println("str = " + str);

        double num1 = 2.55;

        System.out.println("num1 = " + num1); //2.5

        num1 +=5.5;

        System.out.println("num1 = " + num1); // 8.0

        double availableBalance= 1000.5;

        availableBalance += 300; //availableBalance = 1000.5 + 300 = 1300.5

        //withdrawing 500$

        availableBalance -= 500; // availableBalance = 1300.5 - 500 = 800.5
        System.out.println("availableBalance = " + availableBalance);

        //withdraw 200$, then deposit 400$
        availableBalance -= 200; // 600.5
        availableBalance += 400; // 1000.5

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("--------------------------------------------------------------");


        double salary = 50000.50;
        salary *= 2; // Salary = 50000.50*2

        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 10000000;

        System.out.println("doge = " + doge);



        System.out.println("--------------------------------------------------------------");

        double num2 = 25000;

        num2 /= 2;  //  num 2 =num2/2

        System.out.println("num2 = " + num2);

        System.out.println("--------------------------------------------------------------");

        double num3 = 100;

        // %=

        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("--------------------------------------------------------------");

        int amount = 127; // cent
        int quarter = 127 / 25;
        int cents = amount%25;

        System.out.println("quarter = " + quarter);
        System.out.println("cents = " + cents);

        System.out.println("--------------------------------------------------------------");

        int cents2 = 127;

        cents2 %= 25; // cents2 = 2

        System.out.println("cents2 = " + cents2);

        System.out.println("--------------------------------------------------------------");

        int y = 300;

        y %= 16;

        System.out.println("y = " + y);

        System.out.println("--------------------------------------------------------------");

        int balance = 3500;
        // insurance fee 153

        balance %= 153;

        System.out.println("balance = " + balance);












    }

}
