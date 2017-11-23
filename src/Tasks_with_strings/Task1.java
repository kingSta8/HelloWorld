package Tasks_with_strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String[] LetterList = {"a", "b", "c", "d", "e"};
        String[] NumberList = {"0", "2", "4", "6", "8"};
        String result = "";

        int x = 0;
        do {
            result += LetterList[x].concat(NumberList[x]);
            x++;
        } while (x <= 4);

        System.out.println(result);
        /*List<Drowable> drowables = new ArrayList<>();
        drowables.add(new Line());
        drowables.add(new Line());
        drowables.add(new Triangle());
        drowables.add(new Circle());
        drowables.add(new Circle());

        for (Drowable drowable : drowables) {
            drawer(drowable);
        }

    }

    static void drawer(Drowable d) {
        d.drow();
    }



    interface Drowable {
        void drow();
    }

    static class Line implements Drowable {
        @Override
        public void drow() {
            System.out.println("Рисуем линию");
        }
    }
    static class Triangle implements Drowable {
        @Override
        public void drow() {
            System.out.println("Рисуем треугольник");
        }
    }

    static class Circle implements Drowable {
        @Override
        public void drow() {
            System.out.println("Рисуем круг");
        }*/




    }
}
