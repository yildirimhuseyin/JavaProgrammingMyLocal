package day43_Absractions.car;

final public class Honda extends Car {


    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public String start() {
        return "twist the key to ignition";
    }




}
