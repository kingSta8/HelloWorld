package Tasks_with_strings;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте! Данная программа меняет подряд идущие пробелы на один пробел.");
        String answer;

        do {
        System.out.print("Введите строку: ");
        String string = in.nextLine();
        String res = string.replaceAll("^\\s+|\\s+|\\s+$", " ");
        System.out.println("Ваша строка без подряд идущих пробелов: "+res);
            System.out.print("Выполнить программу снова? (да/нет) -->  ");
            answer = in.nextLine();
        } while (answer.equals("да"));
        System.out.println("До свидания! Хорошего дня!");
    }
}
