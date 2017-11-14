package Tasks_with_strings;

import java.util.Scanner;

public class Task7 {

    public static final String EXPLANATION_MESSAGE = "предназначена для определения правильности расстановки скобок в выражении.";
    public static final String ENTER_EXPRESSION = "Введите математическое выражение: ";
    public static final String BKT_IN_EXPRESSION = "Скобки в выражениии ";
    public static final String INCORRECT = " расставлены неправильно.";
    public static final String CORRECT = " расставлены правильно.";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(Constants.HELLO_MESSAGE);
        System.out.println(EXPLANATION_MESSAGE);
        String answer;

        do {
            System.out.print(ENTER_EXPRESSION);
            String expr = in.nextLine();
            int k = 0;
            for (char ch : expr.toCharArray()) {
                if (ch == '(') k++;
                if (ch == ')') k--;
                if (k < 0) break;

            }
            if (k != 0) {
                System.out.println(BKT_IN_EXPRESSION + expr + INCORRECT);
            } else {
                System.out.println(BKT_IN_EXPRESSION + expr + CORRECT);
            }
            System.out.print(Constants.REPEAT_MESSAGE);
            answer = in.nextLine();
        } while (answer.equals(Constants.YES));
        System.out.println(Constants.GOOD_BYE_MESSAGE);
    }
}
