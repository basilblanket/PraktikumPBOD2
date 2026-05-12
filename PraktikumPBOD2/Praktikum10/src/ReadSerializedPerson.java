import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        PersonSer person = null;

        try {
            FileInputStream file = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            person = (PersonSer) in.readObject();

            in.close();
            file.close();

            System.out.println("Serialized person name = " + person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}