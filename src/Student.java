public class Student {
    // Private instance variables
    private String name;
    private int age;
    private char grade;

    // Default constructor
    public Student() {
        name = "Unknown";
        age = 0;
        grade = 'N';
    }

    // Parameterized constructor
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Constructor with default grade
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 'N';
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }

    public static void main(String[] args) {
        // Creating an instance of Student using the default constructor
        Student student1 = new Student();
        System.out.println("Student 1 Info:");
        student1.displayInfo();
        System.out.println();

        // Creating an instance of Student using the parameterized constructor
        Student student2 = new Student("Alice", 18, 'A');
        System.out.println("Student 2 Info:");
        student2.displayInfo();
        System.out.println();

        // Creating an instance of Student using the constructor with default grade
        Student student3 = new Student("Bob", 20);
        System.out.println("Student 3 Info:");
        student3.displayInfo();
    }
}

