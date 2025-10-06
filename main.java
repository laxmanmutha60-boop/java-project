import java.util.*;

// Encapsulation + Array
class Student {
    private int roll;
    private String name;
    private int[] marks; // Array

    // Constructor
    Student(int roll, String name, int[] marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() { return roll; }
    public String getName() { return name; }
    public int totalMarks() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum;
    }
}

// Abstract + Polymorphism
abstract class Person {
    abstract void display();
}

class Teacher extends Person {
    public void display() { System.out.println("I am a Teacher"); }
}

class GraduateStudent extends Student {
    GraduateStudent(int r, String n, int[] m) { super(r, n, m); }
    public void show() { System.out.println("Grad Student: " + getName()); }
}

// Final & Static
class Util {
    static final String SCHOOL = "ABC School";
    static void printSchool() { System.out.println("School: " + SCHOOL); }
}

public class Main {
    // Dummy JDBC Method
    static void demoJDBC() {
        System.out.println("Pretend: Connected to Database");
        System.out.println("DB Student: Sample_Name");
    }

    public static void main(String[] args) {
        // Using Constructor, Encapsulation, Array
        int[] m1 = {85, 90, 88};
        GraduateStudent s1 = new GraduateStudent(1, "Vishnu", m1);
        System.out.println(s1.getName() + " total: " + s1.totalMarks());

        // Inheritance + Polymorphism
        Person t = new Teacher();
        t.display();
        s1.show();

        // Static & Final
        Util.printSchool();

        // Collections Framework
        List<String> names = new ArrayList<>();
        names.add("Narendra");
        names.add("Somesh");
        System.out.println("Students: " + names);

        // Exception Handling
        try {
            int x = 5 / 0; // will throw exception
            System.out.println("Result = " + x); // use x (line won’t execute)
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // JDBC Demo
        demoJDBC();

        // Garbage Collector call
        System.gc();
        System.out.println("GC called");
    }
}
