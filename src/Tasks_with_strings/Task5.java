package Tasks_with_strings;

import java.util.Scanner;

public class Task5 {

    private static final String EXPLANATION_MESSAGE = "предназначена для генерации паролей. Выберите уровень сложности для вашего пароля.";
    private static final String EASY_LEVEL = "Для простого уровня наберите 'простой'.";
    private static final String MIDDLE_LEVEL = "Для среднего уровня наберите 'средний'.";
    private static final String HARD_LEVEL = "Для сложного уровня наберите 'сложный'.";
    private static final String CHOSEN_LEVEL = "Выбранный уровень сложности: ";
    private static final String RESULT_MESSAGE = "Ваш пароль: ";
    private static final String EASY = "простой";
    private static final String MIDDLE = "средний";
    private static final String HARD = "сложный";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(Constants.HELLO_MESSAGE);
        System.out.println(EXPLANATION_MESSAGE);
        System.out.println(EASY_LEVEL);
        System.out.println(MIDDLE_LEVEL);
        System.out.println(HARD_LEVEL);

        String[] letters = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
        String[] numbers = {"1","2","3","4","5","6","7","8","9","0"};
        String password = "";
        String answer;
        String key;

        do {

            do {
                System.out.print(CHOSEN_LEVEL);
                String string = in.nextLine();

                if (string.equals(EASY)) {
                    password = "nickname";
                } else if (string.equals(MIDDLE)) {
                    password = "";
                    for (int y = 1; y <= 3; y++) {
                        int rand1 = (int) (Math.random() * letters.length);
                        int rand2 = (int) (Math.random() * numbers.length);
                        password += letters[rand1].concat(numbers[rand2]);
                    }
                } else if (string.equals(HARD)) {
                    password = "";
                    double x = Math.random() * 10;
                    for (int i = 0; i <= x; i++) {
                        int rand3 = (int) (Math.random() * letters.length);
                        int rand4 = (int) (Math.random() * numbers.length);
                        password += letters[rand3].concat(numbers[rand4]);
                    }
                } else {
                    System.out.print(Constants.SOMETHING_WAS_WRONG);
                    key = in.nextLine();
                    if (key.equals(Constants.NO)) {
                        break;
                    }
                }

            } while (password.equals(""));

            if (password != "" ) System.out.println(RESULT_MESSAGE + password);
            System.out.print(Constants.REPEAT_MESSAGE);
            answer = in.nextLine();
        } while (answer.equals(Constants.YES));
        System.out.println(Constants.GOOD_BYE_MESSAGE);
    }
}
