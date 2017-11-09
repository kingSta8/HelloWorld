package Tasks_with_strings;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте! Данная программа предназначена для определения правильности расстановки скобок в выражении.");
        String answer;

        do {
            System.out.print("Введите математическое выражение: ");
            String expr = in.nextLine();
            int k = 0;
            for (char ch : expr.toCharArray()) {
                if (ch == '(') k++;
                if (ch == ')') k--;
                if (k < 0) break;

            }
            if (k != 0) {
                System.out.println("Скобки в выражениии " + expr + " расставлены неправильно.");
            } else {
                System.out.println("Скобки в выражении " + expr + " расставлены правильно.");
            }
            System.out.print("Выполнить программу снова? (да/нет) -->  ");
            answer = in.nextLine();
        } while (answer.equals("да"));
        System.out.println("До свидания! Хорошего дня!");
    }
}
