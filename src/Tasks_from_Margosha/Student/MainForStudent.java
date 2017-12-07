package Tasks_from_Margosha.Student;

import Tasks_from_Margosha.Student2.Student;

public class MainForStudent {
    public static void main(String[] args) {
        Student[]stud = new Student[5];
        stud[0] = new Student("Иванов",18,true);
        stud[1] = new Student("Петров", 19);
        stud[2] = new Student("Лохов", true);
        stud[3] = new Student();
        stud[4] = new Student("Сидоров", 20, false);

        for (int i=0; i<5; i++) {
            stud[i].print();
        }

        System.out.println("Средний возраст студентов: "/*+MiddleAge*/);
        System.out.println("Количество студентов с задолженностями: "/*+StudMust*/);

    }
}
