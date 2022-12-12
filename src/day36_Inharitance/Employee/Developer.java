package day36_Inharitance.Employee;

public class Developer extends Employee {

    public void coding(){
        System.out.println(name+ " "+ jobTitle + " is coding");
    }

    public void fixingBugs(){
        System.out.println(name+ " "+ jobTitle + " is fixing bugs");
    }




}
/*
2.3 Create the subclass of Employee named Developer:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				coding()
				fixingBugs()
				toString()
 */