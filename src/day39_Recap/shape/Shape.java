package day39_Recap.shape;

public class Shape {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            System.err.println("Name cannot be null");
            System.exit(1); // 1: something went wrong
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);// 1: something went wrong
        }
        this.name = name;
    }


    public Shape(String name) {
        setName(name);
    }

    public double area(){
    return 0;
    }
    public double perimeter(){
    return 0; // we can use 0 when we don't have any formula to return but we want to override our method
    }


    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                '}';
    }

      /*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}
 */






}
