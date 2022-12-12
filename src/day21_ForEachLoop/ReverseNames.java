package day21_ForEachLoop;

public class ReverseNames {


    public static void main(String[] args) {

        String[] classmates = {"Andrei Ard", "Natalia Nan", "Akos Kosma", "Anamaria Bos", "Muhammet Yılmaz",
                "Savas Yıldırım", "Kadir Karaman", "Haden Z", "Regna Knos", "Metin Yıldırım"};

        for (String each : classmates) { // each representing every single name that we have

            String reverse = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);

            }
            System.out.println(reverse);
        }

    }
}
