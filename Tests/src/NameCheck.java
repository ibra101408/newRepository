import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NameCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Pattern pattern = Pattern.compile("[A-Z][a-z]*\\s[A-Z][a-z]*\\s[A-Z][a-z]*");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            System.out.println("Имя корректно!");
        } else System.out.println("Имя некорректно!");
    }


}
