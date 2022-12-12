package day37_Inheritance.phone;

public class Nokia extends Phone {



    public void selfDefence(){
        System.out.println("You can use "+brand+ " "+ model+ " as self defence");
    }

    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }



}
