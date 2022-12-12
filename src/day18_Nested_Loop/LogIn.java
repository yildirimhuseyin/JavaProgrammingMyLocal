package day18_Nested_Loop;

import java.util.Scanner;

/*
 2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."



Nested loop:  loop inside another loop (inner & outer loops)

        one iteration of the outer loop, executes all the iteration of the inner loop
 */
public class LogIn {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your username:");
        String userName = scan.nextLine();
        System.out.println("Enter your password:");
        String password = scan.nextLine();


        for (int i = 0; i < 3; i++) {

        }


        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {

            for (int i = 0; i < 3; i++) {
                System.out.println("Incorrect user name and password");
                System.out.println("Enter your username:");
                userName = scan.nextLine();
                System.out.println("Enter your password:");
                password = scan.nextLine();

                if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;
                }

            }

            if (!(userName.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.err.println("Your account is locked. Please contact to support team.");

            }

        }
        scan.close();
    }

}
