package day36_Inharitance.Employee;

public class Teacher extends Employee{



    public void teaching(){
        System.out.println(name+ " "+ jobTitle+ " is teaching");
    }



}
/*
2.4 Create the subclass of Employee named Teacher:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				teaching()
				toString()
 */