package day37_Inheritance.cydeo;

public class Developer extends Employee{


    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void fixingBugs(){
        System.out.println(getName()+ getJobTitle()+ " is fixing bugs");
    }


    public void work(){
        System.out.println(getName()+ getJobTitle()+ " is developing the app");
    }



}
/*
 4. Create a sub class of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()
 */