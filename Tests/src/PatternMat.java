import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMat {
    public static void main(String[]args){
        String text = "Java";
        String text2 = "Java";
        Pattern pattern = Pattern.compile(text2);
        Matcher matcher = pattern.matcher(text);
        boolean b = matcher.matches();
        System.out.println(b);


    }


}
