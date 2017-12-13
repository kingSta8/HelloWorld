package Tasks_from_Margosha.Student2;

public class Student {
    private String surname;
    private int age;
    private boolean indebtedness;

    public Student() {
    }

    public Student(String surname, int age, boolean indebtedness) {
        this.surname = surname;
        this.age = age;
        this.indebtedness = indebtedness;
    }

    public Student(String Surname, int Age) {
        this.surname = Surname;
        this.age = Age;
    }

    public Student(String SUrname, boolean Indebtedness) {
        this.surname = SUrname;
        this.indebtedness = Indebtedness;
    }

    private int getAge() {
        return age;
    }

    private String getSurname() {
        return surname;
    }

    private boolean isIndebtedness() {
        return indebtedness;
    }

    public static int MiddleAge(Student[] stud) {
        int mid = 0;
        for (int i = 0; i < 5; i++) {
            mid += stud[i].age;
        }
        return (mid / 5);
    }

    public static int StudMust(Student[] stud) {
        int must = 0;
        for (int i = 0; i < 5; i++)
            if (stud[i].indebtedness)
                must++;
        return must;
    }

    public void print() {
        System.out.println("Студент " + this.getSurname() + "\n" +  this.getAge() + " (возраст)");

        if (this.isIndebtedness()) {
            System.out.println("Имеет задолженность.");
        }
        if (!this.isIndebtedness()) {
            System.out.println("Не имеет задолженности.");

        }
    }
}
