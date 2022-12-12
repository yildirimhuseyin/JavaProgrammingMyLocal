package day37_Inheritance.phone;

public class Samsung extends Phone{








    public void freeze(){
        System.out.println(brand+ " "+ model + " is freezing");
    }

    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }
}
