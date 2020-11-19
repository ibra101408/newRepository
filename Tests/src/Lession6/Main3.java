package Lession6;

public class Main3 {
    public static void main(String[] args) {
        int[] array = {15, 34, 5, 3, -11, 567, 2, 547, 2, 0, -12, 35};
        printOdd(array);
    }

    private static int printOdd(int[] array) {
        for(int i=0; i<array.length; i++)
            if(array[i] % 2!= 0)
                System.out.println(array[i]);
        return 0;

    }

}