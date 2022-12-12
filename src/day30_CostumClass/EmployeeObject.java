package day30_CostumClass;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObject {


    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.setInfo("Hasan",271,'M',"Manager",60000,true);

        Employee employee2 = new Employee();
        employee2.setInfo("Hüseyin",345,'M',"Amele",90000,false);

        Employee employee3 = new Employee();
        employee3.setInfo("Sümeyye",102,'F',"Scrum Master",50000,true);

        Employee employee4 = new Employee();
        employee4.setInfo("Fadime",1,'F',"Stakeholder",1000002,false);

        Employee employee5 = new Employee();
        employee5.setInfo("Hüsnü",2,'M',"Stakeholder",100001,true);


        Employee[] employees = { employee1, employee2, employee3, employee4, employee5 };

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {

            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }

            if(employee.salary > max){
                max = employee.salary;
            }

            if(employee.salary < min){
                min = employee.salary;
            }

        }


        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("min = " + min);
        System.out.println("max = " + max);



    }


}
/*
CapitalOne Class:
	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary
 */