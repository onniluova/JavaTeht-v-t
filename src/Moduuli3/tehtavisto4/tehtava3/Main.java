package src.Moduuli3.tehtavisto4.tehtava3;

import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Course implements Serializable {
    String courseCode;
    String courseName;
    String instructor;

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }
}

class Enrollment implements Serializable {
    Student student;
    Course course;
    String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Student, Course, and Enrollment
        // Serialize and save the Enrollment instance
        // Deserialize and print the Enrollment instance

        Student student = new Student(1, "John Doe", 20);
        Course course = new Course("CS101", "Introduction to Computer Science", "Dr. Smith");
        Enrollment enrollment = new Enrollment(student, course, "2021-09-01");

        try {
            FileOutputStream fileOut = new FileOutputStream("src/Moduuli3/tehtavisto4/tehtava3/enrollment.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(enrollment);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in enrollment.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        Enrollment enrollmentDeserialized = null;
        try {
            FileInputStream fileIn = new FileInputStream("src/Moduuli3/tehtavisto4/tehtava3/enrollment.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            enrollmentDeserialized = (Enrollment) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Enrollment class not found");
            c.printStackTrace();
        }
    }
}