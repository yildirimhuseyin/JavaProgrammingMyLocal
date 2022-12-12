package day24_CustomMethod_Return;

public class ReturnMethodsPractice {


    public static void main(String[] args) {

        // find max number between 100 & 200

       int maxNumber = max(100,200);

        System.out.println("maxNumber = " + maxNumber);

        // multiply the max by 2
        int multiplication = maxNumber*2;
        System.out.println("multiplication = " + multiplication);


    }




    public static int max(int num, int num2){

        int result =0;

        if (num>num2){
            result = num;
        }else {
            result = num2;
        }
        return result;
    }
}
