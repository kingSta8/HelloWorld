package Tasks_with_strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте! Данная программа меняет местами наибольшее и наименьшее по длине слова в веденной Вами строке.");
        System.out.print("Ваша строка: ");
        String string = in.nextLine();
        String[] mas = string.split(" ");

        int posmax = 0, posmin = 0;

        String[] chAr1 = string.split(" ");
        String max = chAr1[0];
        for(int i=1;i<chAr1.length;i++){
            if(max.length()<chAr1[i].length())
                max = chAr1[i];
                posmax = i;
        }


        String[] chAr2 = string.split(" ");
        String min = chAr2[0];
        for(int j=1;j<chAr2.length;j++){
            if(min.length()>chAr2[j].length())
                min = chAr2[j];
                posmin = j;
        }

        /*String res = string.replace('posmax','posmin');*/



        /*String res = "";
        String[] sentenses = string.split("(?<=[.!?])");
        for (String str : sentenses) {
            String newSentense = str.trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$2$1$4");
            System.out.println(newSentense);
        }*/

       /* mas[posmax] = min;
        mas[posmin] = max;
        System.out.println ("Полученная строка: ");
        System.out.println (Arrays.toString(mas));*/

       /* System.out.println("Ваша строка с заменой: "+res);*/
        /*String[] words = string.replaceAll("^\\s+|\\s+|\\s+$", " ").split("\\s");
        for(String subStr:words) {
            System.out.println(subStr);
        }*/
    }
}
