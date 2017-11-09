package Tasks_with_strings;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте! Данная программа удаляет все цифры из строки.");
        String answer;

        do {
        System.out.print("Введите строку: ");
        String string = in.nextLine();
        String res = string.replaceAll("[0-9]","");
        System.out.println("Ваша строка без цифр: "+res);
            System.out.print("Выполнить программу снова? (да/нет) -->  ");
            answer = in.nextLine();
        } while (answer.equals("да"));
        System.out.println("До свидания! Хорошего дня!");
        }
    }
