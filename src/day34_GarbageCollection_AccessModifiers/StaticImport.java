package day34_GarbageCollection_AccessModifiers;
import static day34_GarbageCollection_AccessModifiers.Circle.*;
public class StaticImport {


    public static void main(String[] args) {

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println(pi); // if we have static import we call directly static variables;







    }


}
