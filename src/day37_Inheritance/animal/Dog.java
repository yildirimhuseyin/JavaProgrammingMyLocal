package day37_Inheritance.animal;

public class Dog extends Animal {

    public int a;

    public Dog(String name,String breed, char gender, int age, String size, String color) {

        super(name, breed, gender, age, size, color);

    }

    public void bark(){
        System.out.println(name+ " is barking");
    }
}


/*
    dog:
        6 variables
        7 methods
 */
