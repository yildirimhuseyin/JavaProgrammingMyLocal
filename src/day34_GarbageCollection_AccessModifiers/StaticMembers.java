package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    static class class1{ // we can only create static class inside the another class

    }

    public static int num = 100; // we have static variable

    public static void method(){ // we have static method

    }

    static { // we have static block to initialize static variables

    }

}

class A { // outer class

    static class B { // inner class

        public static void method1(){

        }

    }

}


class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}


class X{

}

class Y{

}

class Z{
    static class Q{

    }
}