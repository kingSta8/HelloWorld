package Tasks_with_strings;

import java.util.Scanner;

public class Task8 {
    private static final String EXPLANATION_MESSAGE = "меняет camelCase на snake_case.";
    private static final String RESULT_MESSAGE = "Измененная строка: ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(Constants.HELLO_MESSAGE);
        System.out.println(EXPLANATION_MESSAGE);
        String answer;
        do {System.out.print(Constants.ENTER_STRING);
            String str = in.nextLine();
            String res = str.replaceAll("A","_a").replaceAll("B","_b").replaceAll("C","_c").replaceAll("D","_d").replaceAll("E","_e").replaceAll("F","_f").replaceAll("G","_g").replaceAll("H","_h").replaceAll("I","_i").replaceAll("J","_j").replaceAll("K","_k").replaceAll("L","_l").replaceAll("M","_m").replaceAll("N","_n").replaceAll("O","_o").replaceAll("P","_p").replaceAll("Q","_q").replaceAll("R","_r").replaceAll("S","_s").replaceAll("T","_t").replaceAll("U","_u").replaceAll("V","_v").replaceAll("W","_w").replaceAll("X","_x").replaceAll("Y","_y").replaceAll("Z","_z");
            System.out.println(RESULT_MESSAGE + res);
            System.out.print(Constants.REPEAT_MESSAGE);
            answer = in.nextLine();
        }  while (answer.equals(Constants.YES));
        System.out.println(Constants.GOOD_BYE_MESSAGE);
    }
}
