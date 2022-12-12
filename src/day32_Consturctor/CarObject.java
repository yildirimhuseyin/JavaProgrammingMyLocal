package day32_Consturctor;

public class CarObject {

    public static void main(String[] args) {


        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda","Accord");
        Car car3 = new Car("Lexus","RX350","Blue");
        Car car4 = new Car("BMW","X6","Red",50000);
        Car car5 = new Car("Tesla","Model 3","White",50000,2019);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);




    }





}
