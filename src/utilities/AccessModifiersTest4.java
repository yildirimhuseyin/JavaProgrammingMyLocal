package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiersTest4 extends ProtectedAccessModifier {


    public static void main(String[] args) {

        // System.out.println(ProtectedAccessModifier.name1);   // default is not visible outside the package
        System.out.println(ProtectedAccessModifier.name2); // if we inherited class we can use protected object inside the subclass


    }


}
