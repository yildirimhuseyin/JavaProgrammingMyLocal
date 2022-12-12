package day04_Variables;
/*

Calculating salary of a person Weekly Hours, Hourly rate

 */
public class SalaryCalculator {

    public static void main(String[] args) {

     int hourlyRate    = 65;                   // Calculating salary of a person Weekly Hours, Hourly rate
     int weeklyHours   = 45;
     int numberOfWeeks = 52;

     int salary =  hourlyRate * weeklyHours * numberOfWeeks;


                                            // System.out.println(salary); Calculating salary ( shortcut of these formul is "soutv" and select the thing


        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = " + salary);

    }


}
