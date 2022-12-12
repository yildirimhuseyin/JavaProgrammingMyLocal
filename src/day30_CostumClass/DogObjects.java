package day30_CostumClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {


    public static void main(String[] args) {


        Dog dog1 = new Dog();

        dog1.name = "lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";


        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'F';
        dog2.size = "Large";
        dog2.color = "White & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack","German Shepard", 2,'M',"large","Black");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");



        ArrayList<Dog> femaleDogs =new ArrayList<>(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dog1,dog2,dog3,dog4,dog5));

/*
        for (Dog each : femaleDogs) {
            femaleDogs.removeIf(p -> p.gender == 'M');
        }

        System.out.println("femaleDogs = " + femaleDogs);
        System.out.println("Count of female dog is: "+ femaleDogs.size());
 */

    }
}
