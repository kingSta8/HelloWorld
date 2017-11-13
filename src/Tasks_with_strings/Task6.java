package Tasks_with_strings;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте! Данная программа меняет местами наибольшее и наименьшее по длине слова в веденной Вами строке.");
        String answer;

        do {
            System.out.print("Введите строку: ");
            String str = in.nextLine();
            System.out.println(getStringWithReplaceMinMaxWord(str));
            System.out.print("Выполнить программу снова? (да/нет) -->  ");
            answer = in.nextLine();
        } while (answer.equals("да"));
        System.out.println("До свидания! Хорошего дня!");
    }


    public static String getStringWithReplaceMinMaxWord(String str) {

        String stringBuilderMaxWord = new String();
        String stringBuilderMinWord = new String(String.valueOf(Integer.MAX_VALUE));
        int countMax = 0;
        int countMin = 0;
        int count = 0;

        for (String s : str.split(" ")) {
            if (stringBuilderMaxWord.length() < s.length()) {
                stringBuilderMaxWord = s;
                countMax = count + 1;
            }

            if (stringBuilderMinWord.length() > s.length()) {
                stringBuilderMinWord = s;
                countMin = count + 1;
            }
            count++;
        }

        if (countMax > countMin) {
            str = str.replaceFirst(stringBuilderMaxWord, stringBuilderMinWord);
            str = str.replaceFirst(stringBuilderMinWord, stringBuilderMaxWord);
        } else {
            str = str.replaceFirst(stringBuilderMinWord, stringBuilderMaxWord);
            str = str.replaceFirst(stringBuilderMaxWord, stringBuilderMinWord);

        }

        return str;
    }
}
