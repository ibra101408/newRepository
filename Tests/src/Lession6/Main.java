package Lession6;
import java.util.Arrays;
    public class Main {
        public static void main(String[] args) {
            int[] array = {15, 34, 5, 3, -11, 567, 2, 547, 2, 0, -12, 35};
            int min = getMin(array);
            int max = getMax(array);
            System.out.println("Minimal value = " + min + " and maximum value = " + max);
        }

        private static int getMax(int[] array) {
            int result = array[0];
            for(int value : array) {
                if(value > result) {
                    result = value;
                }
            }
            return result;
        }

        private static int getMin(int[] array) {
            int result = array[0];
            for(int value : array) {
                if(value < result) {
                    result = value;
                }
            }
            return result;
        }
    }