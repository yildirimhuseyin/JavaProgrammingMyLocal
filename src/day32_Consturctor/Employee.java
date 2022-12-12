package day32_Consturctor;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

     // we are using methods overloading methods for instance methods and we cannot call intstance methos by name of methods
    // we have to use this() keyword and set parameters that have  already set before
    // this:
    // we can only can call constructor inside another constructor

    public Employee(String name){

        this.name = name;


    }
    public Employee(String name, char gender){
        this(name); // this.name = name
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle){

        this(name, gender); // calling name and gender that we already set
        this.jobTitle = jobTitle;

    }

    public Employee(String name, char gender, String jobTitle, double salary ){

        this(name, gender, jobTitle);
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }


}
