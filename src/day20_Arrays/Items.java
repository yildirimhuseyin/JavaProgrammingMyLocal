package day20_Arrays;

import java.util.Scanner;

/*
5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
 */
public class Items {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] itemName = new String[5];

        double[] price = new double[5];

        int sumOfPrice = 0;
        String itemList = "";

        for (int i = 0; i <itemName.length ; i++) {
            System.out.println("Enter a item name: ");
            itemName[i] = scan.next();
            System.out.println("Enter the price of item: ");
            price[i] = scan.nextDouble();

            itemList += "\n"+itemName[i] +  "--"+ price[i];

            sumOfPrice += price[i];
        }


        System.out.println("itemList " + itemList);
        System.out.println("sumOfPrice = " + sumOfPrice);



        scan.close();
    }

}
