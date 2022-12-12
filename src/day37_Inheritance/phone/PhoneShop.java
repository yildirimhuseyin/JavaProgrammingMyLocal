package day37_Inheritance.phone;

public class PhoneShop {


    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(78945613);
        iphone.faceTime("yahoo@gmail.com");

        iphone.call(911);
        iphone.text(12345789);
        iphone.faceTime(789234274);
        iphone.faceTime("yahoo@gmail.com");
        System.out.println("--------------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefence();

        System.out.println("-------------------------------------------------");

        System.out.println( Phone.hasBattery );
        System.out.println( Iphone.hasBattery );
        System.out.println( Samsung.hasBattery );
        System.out.println( Nokia.hasBattery );


    }


}
