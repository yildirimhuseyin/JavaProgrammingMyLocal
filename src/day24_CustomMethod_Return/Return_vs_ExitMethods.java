package day24_CustomMethod_Return;

public class Return_vs_ExitMethods {


    public static void main(String[] args) {

nameOfMonth(30);
        System.out.println("Hello World"); // if we use exit method this statement will not be printed
    }

    public static void nameOfMonth(int number ){

        if (number<1 || number>12){
            System.out.println("Invalid entry");
            ///return; // exits nameOfMethods method, remaining code fragment never gets executed
            System.exit(0);
        }

        if (number == 1){
            System.out.println("January");
        } else if (number==2) {
            System.out.println("February");
        }else if (number==3) {
            System.out.println("March");
        }else if (number==4) {
            System.out.println("April");
        }else if (number==5) {
            System.out.println("May");
        }else if (number==6) {
            System.out.println("June");
        }else if (number==7) {
            System.out.println("July");
        }else if (number==8) {
            System.out.println("August");
        }else if (number==9) {
            System.out.println("September");
        }else if (number==10) {
            System.out.println("October");
        }else if (number==11) {
            System.out.println("November");
        }else {
            System.out.println("December");
        }



    }

}
