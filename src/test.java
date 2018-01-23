import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            String power = s.next();
        if (reg(power)) {
            System.out.println("fuck uuuuuuu");
        }
        else {
         System.out.println("Try again input only digits and comma");
         }
        }
        }

           private static boolean reg(String S) {
         Pattern p =Pattern.compile("[0-9]");
         Matcher m = p.matcher(S);
         return m.matches();
         }
}
