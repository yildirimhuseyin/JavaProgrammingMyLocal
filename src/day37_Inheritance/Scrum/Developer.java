package day37_Inheritance.Scrum;

public class Developer extends Employee {


    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }


    public void fixingBugs(){
        System.out.println(jobTitle+ " "+ name+ " fixing bug");
    }


}
