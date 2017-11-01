package Tasks_with_strings;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Здравствуйте! Вас приветствует программа генерации паролей. Выберите уровень сложности для вашего пароля.");
        System.out.println("Для простого уровня наберите 'простой'.");
        System.out.println("Для среднего уровня наберите  'средний'.");
        System.out.println("Для сложного уровня наберите 'сложный'.");
        System.out.print("Выбранный уровень сложности: ");
        String string = in.nextLine();
        String letters = "qwertyuiopasdfghjklzxcvbnm";
        String numbers = "1234567890";
        String password = "";

        if (string.equals("простой")) {
            password = "nickname";
        }

        if (string.equals("средний")) {
            /*password = letters[random % letters.length()];*/
        }

        if (string.equals("сложный")) {

        }

        System.out.println("Ваш пароль: "+password);
    }
}
