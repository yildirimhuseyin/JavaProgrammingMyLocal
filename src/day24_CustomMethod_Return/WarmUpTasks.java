package day24_CustomMethod_Return;

public class WarmUpTasks {


    public static void main(String[] args) {

        initials("Hasan Kazanci");
        System.out.println("-------------------------------");
        domainOfEmail("HasanMezarci@babanarahmet.com");
        System.out.println("-------------------------------");
        nameOfMonth(4);
        System.out.println("-------------------------------");
        nameOfDay(5);
        System.out.println("-------------------------------");
        nameOfMonth(6);



    }


    // 1. Create a method that can display the initials of the person
    public static void initials(String name ){

        System.out.println(" "+ name.charAt(0)+"."+name.charAt(name.indexOf(" ")+1)+".");

    }

	// 2. Create a method that can display the domain of the email
    public static void domainOfEmail(String email){

        System.out.println(email.substring(email.indexOf("@")+1,email.lastIndexOf(".")));

    }

	// 3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number ){
        if (number>=1 && number<=12){
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
            }else if (number==12) {
                System.out.println("December");
            }
        }
        else {
            System.out.println("Invalid entry");
        }
    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        String day = "";
        if (number>=1 && number<=7){

           day =  (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday" :(number==4)? "Thursday" :(number==5)? "Friday"
                    :(number==6)? "Saturday" : "Sunday";
        }else {
            System.out.println("Invalid Entry");
        }
        System.out.println("day = " + day);

    }

	//5. Create a method that can print how many days a month has
    public static void dayInMonth(int number){
        if (number%2==0){
            System.out.println("month has 30 days");
        } else {
            System.out.println("month has 31 days");
        }
    }

/*





 */

}


