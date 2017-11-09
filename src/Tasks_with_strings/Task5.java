package Tasks_with_strings;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте! Вас приветствует программа генерации паролей. Выберите уровень сложности для вашего пароля.");
        System.out.println("Для простого уровня наберите 'простой'.");
        System.out.println("Для среднего уровня наберите 'средний'.");
        System.out.println("Для сложного уровня наберите 'сложный'.");

        String[] letters = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
        String[] numbers = {"1","2","3","4","5","6","7","8","9","0"};
        String password = "";
        String answer;
        String key;

        do {

            do {
                System.out.print("Выбранный уровень сложности: ");
                String string = in.nextLine();

                if (string.equals("простой")) {
                    password = "nickname";
                } else if (string.equals("средний")) {
                    password = "";
                    for (int y = 1; y <= 3; y++) {
                        int rand1 = (int) (Math.random() * letters.length);
                        int rand2 = (int) (Math.random() * numbers.length);
                        password += letters[rand1].concat(numbers[rand2]);
                    }
                } else if (string.equals("сложный")) {
                    password = "";
                    double x = Math.random() * 10;
                    for (int i = 0; i <= x; i++) {
                        int rand3 = (int) (Math.random() * letters.length);
                        int rand4 = (int) (Math.random() * numbers.length);
                        password += letters[rand3].concat(numbers[rand4]);
                    }
                } else {
                    System.out.print("Что-то пошло не так! Попробуете еще раз? (да/нет) --> ");
                    key = in.nextLine();
                    if (key.equals("нет")) {
                        break;
                    }
                }

            } while (password.equals(""));

            if (password != "" ) System.out.println("Ваш пароль: " + password);
            System.out.print("Сгенерировать пароль снова? (да/нет) -->  ");
            answer = in.nextLine();
        } while (answer.equals("да"));
        System.out.println("До свидания! Хорошего дня!");
    }
}
