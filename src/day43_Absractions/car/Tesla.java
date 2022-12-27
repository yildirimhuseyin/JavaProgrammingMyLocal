package day43_Absractions.car;

public final class  Tesla  extends Car{

    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public String start() {
        return "say \"Start\" ";
    }

    public void autoPilot(){
        System.out.println(getMake()+ " " + getModel()+ " has auto pilot feature");
    }


}
