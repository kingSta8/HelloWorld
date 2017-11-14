package Tasks_with_strings;

import java.util.Scanner;

public class Task6 {

    public static final String EXPLANATION_MESSAGE = " Данная программа меняет местами наибольшее и наименьшее по длине слова в веденной Вами строке.";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(Constants.HELLO_MESSAGE);
        System.out.println(EXPLANATION_MESSAGE);
        String answer;

        do {
            System.out.print(Constants.ENTER_STRING);
            String str = in.nextLine();
            System.out.println(getStringWithReplaceMinMaxWord(str));
            System.out.print(Constants.REPEAT_MESSAGE);
            answer = in.nextLine();
        } while (answer.equals(Constants.YES));
        System.out.println(Constants.GOOD_BYE_MESSAGE);
    }


    private static String getStringWithReplaceMinMaxWord(String str) {

        String stringBuilderMaxWord = "";
        String stringBuilderMinWord = String.valueOf(Integer.MAX_VALUE);
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
