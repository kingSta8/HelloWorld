package Tasks_from_Margosha.Student2;

public class Student {
    public String surname;
    public int age;
    public boolean indebtedness;

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

    public void print(){

    }
}
