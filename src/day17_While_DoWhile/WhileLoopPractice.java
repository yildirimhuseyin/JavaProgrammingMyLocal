package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // username : "Cydeo"
        // Password : "Cydeo123";

        System.out.println("Enter your username ");
        String userName = scan.nextLine();
        System.out.println("Enter your password ");
        String password =  scan.nextLine();

        if (userName.equals("Cydeo") && password.equals("Cydeo123")){ // if the credential is valid  execute this
            System.out.println("Logged in");
        }else { // if the credential is  not valid execute this

            int attempt = 3;// 3, 2, 1

            while (  !(userName.equals("Cydeo") && password.equals("Cydeo123")) && attempt> 0 ){

                if (attempt == 1){
                    System.out.println("BE CAREFUL YOU ARE ABOUT TO FUCK UP ! ");
                }

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username ");
                 userName = scan.nextLine();
                System.out.println("Enter your password ");
                 password =  scan.nextLine();
                 attempt--;
            }

            if (userName.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("Logged in");
            }else {
                System.out.println("Your account is locked.");
            }

        }


          scan.close();




    }
}
