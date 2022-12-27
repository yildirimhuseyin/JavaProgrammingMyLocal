
package day43_Absractions.employee;

public final class Developer extends Employee{


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is coding");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " is sleeping 6 hours");
    }

    public void unitTest(){
        System.out.println(getName()+ " is unit testing");
    }





}
