class Student {

    int id;
    String name;

    // Constructor defined in this class
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Student object created");
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

public class mainclass {
    public static void main(String[] args) {

        // Constructor invoked from main class
        Student s1 = new Student(101, "Aditya");
        s1.display();
    }
}
