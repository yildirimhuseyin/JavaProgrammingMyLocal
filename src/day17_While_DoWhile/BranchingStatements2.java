package day17_While_DoWhile;

public class BranchingStatements2 {


    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {


            if (i=='C'){
                continue;
            }
            System.out.println(i); // A, B, D, E

        }

        System.out.println("----------------------------------------");
          // print all even number btw 1-10

        for (int i = 0; i <= 10; i++) {
            if  (i%2 != 0) {
                continue;
            }
            System.out.println(i);

        }

        System.out.println("----------------------------------------");


        // print all odd number btw 1-10

        for (int i = 0; i <= 10 ; i++) {
            if (i%2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
