package day43_Absractions.shape;

public final class Circle extends Shape{

        private double radius;
        public static double pi = 3.14;

    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0){
            throw new RuntimeException("Radius can not be smaller than zero: "+ radius);
        }
        this.radius = radius;
    }

    @Override
    public  double area() {
       return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() + '\'' +
                "radius=" + radius +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
