package day21_ForEachLoop;

public class Initials {


    public static void main(String[] args) {

        String[] names = {"Andrei Ard", "Natalia Nan", "Akos Kosma", "Anamaria Bos", "Muhammet Yılmaz",
                "Savas Yıldırım", "Kadir Karaman", "Haden Z", "Redla Knos", "Metin Yıldırım"};

        for (String each : names) {
            System.out.println(each.charAt(0) + "."+ each.charAt(each.indexOf(" ")+1)+ "." );
        }





    }
}
