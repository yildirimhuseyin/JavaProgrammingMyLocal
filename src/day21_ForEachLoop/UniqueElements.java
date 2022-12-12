package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {



        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};



        for (String each : words) {

            int counter = 0;
            for (String elements : words) {

                if (elements.equals(each)){
                    counter++;
                }
            }

            if (counter==1){
                System.out.println(each);
            }

        }


    }


}
