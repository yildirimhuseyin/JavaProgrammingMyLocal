package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {
    public static void main(String[] args) {


        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        // System.out.println(AccessModifiers.privateData); // private is nt usable with in the other class,  private is not visible outside the class

        AccessModifiers.method1(); // we can call public methods with in same class
        AccessModifiers.method2(); // we can call default methods with in same package
       // AccessModifiers.method3(); // we cannot call private methods outside the class


    }



}
