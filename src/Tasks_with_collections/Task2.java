package Tasks_with_collections;

import Tasks_with_strings.Constants;
import java.util.Scanner;

public class Task2 {

    private static final String ENTER_FIRST_LIST = "Введите первый список: ";
    private static final String ENTER_SECOND_LIST = "Введите второй список: ";
    private static final String EXPLANATION_MESSAGE = "сравнивает 2 списка по количеству элементов в списке.";


    public static void main(String[] args) {
        System.out.print(Constants.HELLO_MESSAGE);
        System.out.println(EXPLANATION_MESSAGE);
        Scanner in = new Scanner(System.in);
        String answer;



        do {
            System.out.print(ENTER_FIRST_LIST);
            ListsComparator.list1.add(in.nextLine());
            System.out.print(ENTER_SECOND_LIST);
            ListsComparator.list2.add(in.nextLine());



            System.out.print(Constants.REPEAT_MESSAGE);
            answer = in.nextLine();
        } while (answer.equals(Constants.YES));
        System.out.println(Constants.GOOD_BYE_MESSAGE);
    }
}
