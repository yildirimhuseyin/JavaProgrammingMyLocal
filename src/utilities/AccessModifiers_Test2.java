package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {


        System.out.println(AccessModifiers.publicData);
       // System.out.println(AccessModifiers.defaultData);// default access modifiers is not visible outside the page
        // System.out.println(AccessModifiers.privateData);// private access modifiers is not visible outside of class

        AccessModifiers.method1(); // we can call public methods with in same class
        // AccessModifiers.method2(); // we can not call default methods outside of package
        // AccessModifiers.method3(); // we cannot call private methods outside the class




    }



}
