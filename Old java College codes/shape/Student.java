import java.io.*;

// Step 1: Create a class that implements Serializable
class Student implements Serializable {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class SerializeDemo {
    public static void main(String[] args) {
        String fileName = "studentData.ser";

        // Step 2: Serialization - Write object to binary file
        try {
            Student s1 = new Student(101, "Farate", 92.5);

            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1); // Serialize object
            oos.close();
            fos.close();

            System.out.println("✅ Student object serialized to " + fileName);
        } catch (IOException e) {
            System.out.println("❌ Serialization Error: " + e.getMessage());
        }

        // Step 3: Deserialization - Read object from binary file
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject(); // Deserialize object
            ois.close();
            fis.close();

            System.out.println("\n📦 Deserialized Student Data:");
            s2.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Deserialization Error: " + e.getMessage());
        }
    }
}
