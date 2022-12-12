package day24_CustomMethod_Return;

public class ReturnStatement {


    public static void main(String[] args) {

        nameOfDay(0);




    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){

        if (number<1||number>7){
            System.out.println("Invalid");
            return;// exit the number is ınvalid exit the methods
        }
        String day = "";


            day =  (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday" :(number==4)? "Thursday" :(number==5)? "Friday"
                    :(number==6)? "Saturday" : "Sunday";

        System.out.println("day = " + day);

    }

}
