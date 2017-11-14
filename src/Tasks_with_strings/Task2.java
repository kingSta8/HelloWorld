package Tasks_with_strings;

import java.util.Scanner;

public class Task2 {

    private static final String EXPLANATION_MESSAGE = "удаляет все цифры из строки.";
    private static final String RESULT_MESSAGE = "Ваша строка без цифр: ";

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println(Constants.HELLO_MESSAGE);
        System.out.println(EXPLANATION_MESSAGE);
        String answer;

        do {
        System.out.print(Constants.ENTER_STRING);
        String string = in.nextLine();
        String res = string.replaceAll("[0-9]","");
        System.out.println(RESULT_MESSAGE +res);
            System.out.print(Constants.REPEAT_MESSAGE);
            answer = in.nextLine();
        } while (answer.equals(Constants.YES));
        System.out.println(Constants.GOOD_BYE_MESSAGE);
        }
    }
