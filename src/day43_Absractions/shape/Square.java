package day43_Absractions.shape;

public final class Square extends Shape {

    private double side;


    public Square(String name, double side) {
        super(name);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<0){
            throw new RuntimeException("Side can not be smaller than zero: "+ side);
        }
        this.side = side;
    }


    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + getName() + '\'' +
                "side=" + side + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() +
                '}';
    }



}
