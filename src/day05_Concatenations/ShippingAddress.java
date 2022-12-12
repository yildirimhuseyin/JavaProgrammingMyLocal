package day05_Concatenations;

/*
Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode
Use concatenation to print the full shipping address
    EX:
		Jimmy Joe
		7925 Jones Branch Dr
		McLean, VA 20125
 */

public class ShippingAddress {


    public static void main(String[] args) {

        String name = "James King",
                buildingNumber = "11821B",
                streetName = " jones Branch Dr",
                city = "Mclean",
                state = " VA",
                zipCode = "22031A";

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + state + " "+ zipCode);


        // after this we can make a String for a Shipping address like this String shippingAddress = name + "\n" + buildingNumber + " " + streetName + "\n" + city + state + " "+ zipCode;

        String shippingAdress = name + "\n" + buildingNumber + " " + streetName + "\n" + city + state + " "+ zipCode;

        System.out.println(shippingAdress);


    }
}
