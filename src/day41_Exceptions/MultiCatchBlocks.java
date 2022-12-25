package day41_Exceptions;



public class MultiCatchBlocks {

    public static void main(String[] args) {

        //Employee employee = null;

        try {

           // System.out.println(employee.getSalary()); // Null Pointer Exception // I didn't create employee class that's why commented out

        }catch (NullPointerException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }


        System.out.println("Tested Completed");


        System.out.println("---------------------------------------------------");

        try {
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }




    }



}
