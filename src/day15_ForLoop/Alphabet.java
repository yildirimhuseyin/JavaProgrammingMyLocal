package day15_ForLoop;

public class Alphabet {


    public static void main(String[] args) {
        // print
        // A - Z
        // a - z
        // Z - A
        // z - a


        // A - Z

        for ( int i = 65; i <= 90; i++ ){
            System.out.print((char) i+ " ");
        }

        System.out.println();

        // a - z
        for (char i = 97 ; i <= 122; i++){
            System.out.print(i+" ");
        }

        System.out.println();

        // Z - A

        for (char i = 'Z';i>='A';i--){
            System.out.print(i + " ");
        }

        System.out.println();

        for (char i = 'z'; i >= 'a'; i--){
            System.out.print(i+ " ");
        }

        for (char i = 1; i <= 4000; i++){
            System.out.print(i+" ");
        }




    }
}
