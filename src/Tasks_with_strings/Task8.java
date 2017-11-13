package Tasks_with_strings;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте! Данная программа меняет camelCase на snake_case.");
        String answer;
        do {System.out.print("Введите строку: ");
            String str = in.nextLine();
            String res = str.replaceAll("A","_a").replaceAll("B","_b").replaceAll("C","_c").replaceAll("D","_d").replaceAll("E","_e").replaceAll("F","_f").replaceAll("G","_g").replaceAll("H","_h").replaceAll("I","_i").replaceAll("J","_j").replaceAll("K","_k").replaceAll("L","_l").replaceAll("M","_m").replaceAll("N","_n").replaceAll("O","_o").replaceAll("P","_p").replaceAll("Q","_q").replaceAll("R","_r").replaceAll("S","_s").replaceAll("T","_t").replaceAll("U","_u").replaceAll("V","_v").replaceAll("W","_w").replaceAll("X","_x").replaceAll("Y","_y").replaceAll("Z","_z");
            System.out.println("Измененная строка: "+res);
            System.out.print("Выполнить программу снова? (да/нет) -->  ");
            answer = in.nextLine();
        }  while (answer.equals("да"));
        System.out.println("До свидания! Хорошего дня!");
    }
}
