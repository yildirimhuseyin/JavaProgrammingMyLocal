package day35_Encapsulation.encapsulation;

public class CircleObject {


    public static void main(String[] args) {

        Circle circle1 = new Circle(28);

        circle1.setRadius(5);

        System.out.println("circle1.calcArea() = " + circle1.calcArea());
        System.out.println("circle1.calcPerimeter() = " + circle1.calcPerimeter());

        System.out.println(circle1);


    }


}
