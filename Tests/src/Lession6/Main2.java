package Lession6;
//import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {15, 34, 5, 3, -11, 567, 2, 547, 2, 0, -12, 35};
        int number = 567;
        int index = getFirstIndex(array, number);
        System.out.println("Index of number in array = " + index);
    }

    private static int getFirstIndex(int[] array, int number) {


            for(int i=0;i<array.length;i++)
                if(array[i]==number) return i;
            return 0;



        /*int result = array[0];
        for(int value : array) {
            if(value == number) {
                result = getFirstIndex(array, number);
                System.out.println(value);
            }
        }*/
      //  return 0;
    }
}