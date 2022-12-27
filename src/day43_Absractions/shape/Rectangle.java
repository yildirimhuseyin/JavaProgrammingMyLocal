package day43_Absractions.shape;

public final class Rectangle extends Shape{

    private double weight , length;

    public Rectangle(String name, double weight, double length) {
        super(name);
        setLength(length);
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight<0){
            throw new RuntimeException("Weight can not be smaller than zero: "+ weight);
        }
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<0){
            throw new RuntimeException("Length can not be smaller than zero: "+ length);
        }
        this.length = length;
    }

    @Override
    public double area() {
        return weight*length;
    }

    @Override
    public double perimeter() {
        return 2* (weight+ length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + getName() + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +

                '}';
    }
}
