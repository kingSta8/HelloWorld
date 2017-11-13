package Tasks_with_strings;

import java.util.Scanner;

public class Task4 {

        public static String convert(int in) {
            StringBuilder a = new StringBuilder("");

            int m1 = in / 1000;
            a.append(M(m1));
            int m2 = in % 1000;

            int d1 = m2 / 500;
            a.append(D(d1));
            int d2 = m2 % 500;

            int c1 = d2 / 100;
            a.append(C(c1));
            int c2 = d2 % 100;

            int l1 = c2 / 50;
            a.append(L(l1));
            int l2 = c2 % 50;

            int x1 = l2 / 10;
            a.append(X(x1));
            int x2 = l2 % 10;

            a.append(basic(x2));
            return a.toString();
        }


        private static String M(int in) {
            StringBuilder a = new StringBuilder("");
            int i = 0;
            while (i < in) {
                a.append("M");
                i++;
            }
            return a.toString();
        }

        private static String C(int in) {
            if (in == 4) return "CD"; /*если 400, то 500-100*/
            else if ((in != 0) && (in < 4)) {
                StringBuilder a = new StringBuilder("");
                int i = 0;
                while (i < in) {
                    a.append("C");
                    i++;
                }
                return a.toString();
            }
            else return "";
        }

        private static String X(int in) {
            if (in == 4) return "XL"; /*если 40, то 50-10*/
            else if ((in != 0) && (in < 4)) {
                StringBuilder a = new StringBuilder("");
                int i = 0;
                while (i < in) {
                    a.append("X");
                    i++;
                }
                return a.toString();
            }
            else return "";
        }

        private static String D(int in) {

            if (in == 4) return "CM"; /*если 900, то 1000-100*/
            else if ((in != 0) && (in < 4)) {
                StringBuilder a = new StringBuilder("");
                int i = 0;
                while (i < in) {
                    a.append("D");
                    i++;
                }
                return a.toString();
            }
            else return "";
        }


        private static String L(int in) {
            if (in == 4) return "XC"; /*если 90, то 100 - 10*/
            else if ((in != 0) && (in < 4)) {
                StringBuilder a = new StringBuilder("");
                int i = 0;
                while (i < in) {
                    a.append("L");
                    i++;
                }
                return a.toString();
            }
            else return "";

        }

        private static String basic(int in) {
            String[] a = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            return a[in];
        }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте! Данная программа преобразует арабское число в римское");
        String res = "";
        String answer;

        do {
            System.out.print("Введите число: ");
            String str = in.nextLine();
            convert(Integer.parseInt(str));
            res =  convert(Integer.parseInt(str));
            System.out.println("Ваше число римскими цифрами: " + res);
            System.out.print("Выполнить программу снова? (да/нет) -->  ");
            answer = in.nextLine();
        } while (answer.equals("да"));
        System.out.println("До свидания! Хорошего дня!");
    }

}
