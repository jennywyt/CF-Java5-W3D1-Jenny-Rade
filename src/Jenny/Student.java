package Jenny;

import java.util.ArrayList;

class Student {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int age;
    private String level;


    public Student(String name, String surname, int yearOfBirth, int age, String level) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.age = age;
        this.level = level;
    }

    //Public Setter Method
    public void setName(String name) {
        this.name = name;
    }

    // public Getter method
    public String getName() {
        return this.name;
    }


    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Taylor", "Swift", 1989, 31, "4a");
        Student student2 = new Student("Ed", "Sheeran", 1991, 29, "3a");
        Student student3 = new Student("Chris", "Martin", 2004, 16, "1a");
        Student student4 = new Student("Charlie", "Brown", 1996, 24, "2a");
        Student student5 = new Student("Wolfgang", "Mozart", 1756, 100, "2a");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student s : students) {
            System.out.println(s.name + " "+ s.surname +" born in "+ s.yearOfBirth + " age " + s.age + " goes to class " + s.level);
        }


    }
}
