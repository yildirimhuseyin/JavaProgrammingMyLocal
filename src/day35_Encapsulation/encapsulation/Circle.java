package day35_Encapsulation.encapsulation;

public class Circle {
    private int radius;

    public static int pi;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius<=0){
            System.out.println("Radius of circle can not be less then or equals to zero");
            System.exit(0);
        }
        this.radius = radius;
    }
    static {
        pi = 3;
    }

    public static int getPi() {
        return pi;
    }

    public static void setPi(int pi) {
        Circle.pi = pi;
    }

    public int calcArea(){
        return radius*radius*pi;
    }

    public int calcPerimeter(){
        return 2*pi*radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +", "+
                "area=" + calcArea() + ", "+
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
2. Create a class named Circle

			private variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the radius of circle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()
 */
