package day43_Absractions.shape;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        if (name == null ||name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Name cannot be null, blank or empty: "+ name);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public abstract double area();
    public abstract double perimeter();


    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Shape task:

	Shape:
		name

		Encapsulate the fields

		Add constructor to set the fields

		area()
		perimeter()
		toString(): name, area, perimeter


	Create the following subclasses of Shape and add the aditional features that are needed:

				Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)

				Square:
					area(): s * s
					perimeter: 4 * s

				Circle:
					area(): r * r * pi
					perimeter(): 2 * r * pi
 */