import java.util.Arrays;

public class StrBuBu {
    public static void main(String[] args) {
        String[] arr = {"34", "434", "35", "323", "24"};
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : arr) {
            stringBuilder.append(s);
            stringBuilder.append(", ");
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        System.out.println(stringBuilder);
    }
    }