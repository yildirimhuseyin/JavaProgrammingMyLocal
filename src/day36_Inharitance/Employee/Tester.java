package day36_Inharitance.Employee;

public class Tester extends Employee {



    public void testing(){
        System.out.println(name+" "+ jobTitle + " performs testing");
    }
    public void creatingTicket(){
        System.out.println(name+" "+ jobTitle + " creating ticket");
    }


}
/*
2.2 Create the subclass of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
				toString()

 */