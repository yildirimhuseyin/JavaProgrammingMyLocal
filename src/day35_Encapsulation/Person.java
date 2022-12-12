package day35_Encapsulation;

public class Person {

    public String name, language;
    public int age;
    public char gender;

    public static String planet;
    public static int numberOfWings, numberOfHead;
    public static boolean isHuman, hasNose;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    } // we are creating constructions to assign our instance variable


    static {

        planet = "Earth";
        numberOfHead = 1;
        numberOfWings = 0;
        isHuman = true;
        hasNose = true;
    }

    public void printPlanetName(){
        System.out.println("Planet ");
    }

    public void eat(String food){
        System.out.println(name +" is eating"+ food);
    }

    public void drink(String drink){
        System.out.println(name+ " is drinking"+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet=" + planet +
                '}';
    }
}
/*
warmup tasks:
	1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */