package day11_Switch_Scanner;

/**
 * 1. Create a class called Browser. Write a program that can display the name of selected browser
 * 	        1. declear a String variable named browserName
 * 	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
 * 	        3. if the browser name does not match with the valid browsers' names,
 * 	        out put should be: Invalid Browser Name
 *
 * 	        Ex:
 * 	        	String browser = "chrome";
 *
 * 	    	Output:
 * 	    		Chrome Browser is selected
 *
 * 			Note: MUST use nested if
 */
public class Browser {


    public static void main(String[] args) {

        String browserName = "chorme";
        String result = "";
        if (browserName=="safari"||browserName=="firefox"||browserName=="opera"|| browserName=="chorme"||browserName=="edge"){

        if(browserName=="safari"){
            result = browserName+" Browser is selected";
        } else if (browserName=="chorme") {
            result = browserName+" Browser is selected";
        } else if (browserName=="firefox") {
            result = browserName+" Browser is selected";
        } else if (browserName=="opera") {
            result = browserName+" Browser is selected";
        } else {
            result = browserName+" Browser is selected";
        }

        } else{
                  result = "Invalid Browser Name";
        }
        System.out.println(result);






    }
}
