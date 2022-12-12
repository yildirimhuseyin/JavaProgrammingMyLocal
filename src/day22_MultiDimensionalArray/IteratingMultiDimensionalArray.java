package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray {


    public static void main(String[] args) {


        int[][] arr2D = { {1,2,3},{4,5,6,7},{8,9,10,11,12} };
//indexnumber elements:    0 1 3   0 1 2 3   0 1 2   3  4
//      index of array:      0       1           2


        for (int i = 0; i < arr2D.length; i++) { // index number of single dimensional array


            for (int j = 0; j < arr2D[i].length; j++) { // index of elements


                System.out.print(arr2D[i][j]+ " ");
            }

            System.out.println();

        }



    }
}
