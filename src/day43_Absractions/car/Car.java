package day43_Absractions.car;

public abstract class Car {

    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);
        if (year < 1886){ // first car invested in 1886
            throw new RuntimeException("Invalid year"+ year);
        }

        this.year = year;

        if (price<=0){ // price cannot be smaller than zero
            throw new RuntimeException("Invalid price"+ price);
        }
        setPrice(price);

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String start();


    public  void stop(){
        System.out.println("Press the brake");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
Car Task:
	abstract Car:
		make, model, color, year, price....
		start();
		stop()

	Honda extends Car:
		start(): twist the key to ignition

	Adui extends Car:
		start(): push the start button

	Tesla extends Car:
		start(): Say "Start"
 */