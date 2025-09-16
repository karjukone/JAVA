import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Joona", 20);
        Course course = new Course("CS101", "Introduction to Computer Science", "Kuusitalo");
        Enrollment enrollment = new Enrollment(student, course, "2025-09-15");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enrollments.ser"))) {
            oos.writeObject(enrollment);
            System.out.println("Enrollment serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("enrollments.ser"))) {
            Enrollment deserializedEnrollment = (Enrollment) ois.readObject();
            System.out.println("Deserialized Enrollment:");
            System.out.println(deserializedEnrollment);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}