package day31_Costructors;

public class PersonObject {


    public static void main(String[] args) {

        Person person1 = new Person("Hasan", 'M',26);

        System.out.println(person1);

        Person person2 = new Person("Kseniia", 'F',28);

        person2.age = 39;

        System.out.println(person2);

    }
}
