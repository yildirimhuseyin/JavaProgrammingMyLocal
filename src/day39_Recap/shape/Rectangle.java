package day39_Recap.shape;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("Invalid length: "+ length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.err.println("Invalid width");
            System.exit(1);
        }
        this.width = width;
    }

    public Rectangle(String name, double length, double width) {
        super(name);
        setLength(length);
        setWidth(width);
    }


    public double area() {
        return width*length;
    }


    public double perimeter() {
        return 2*(width+length);
    }


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Rectangle extends Shape:
	variables:
		length
		width

	Encapsulate the fields

	Add a constructor to set the filed

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
 */