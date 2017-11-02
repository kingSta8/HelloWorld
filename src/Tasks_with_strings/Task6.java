package Tasks_with_strings;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте! Данная программа меняет местами наибольшее и наименьшее по длине слова в веденной Вами строке.");
        System.out.print("Ваша строка: ");
        String string = in.nextLine();
        char x;
        char y;

        /*for (int i=0; i<= string.length(); i++) {
            x=;
            y=;
        }

        String res = string.replace(x,y);
        System.out.println("Ваша строка с заменой: "+res);*/
        String[] words = string.replaceAll("^\\s+|\\s+|\\s+$", " ").split("\\s");
        for(String subStr:words) {
            System.out.println(subStr);
        }
    }
}
