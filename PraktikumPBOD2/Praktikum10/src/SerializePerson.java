import java.io.*;

class PersonSer implements Serializable {
    private String name;

    public PersonSer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        PersonSer person = new PersonSer("Basil");

        try {
            FileOutputStream file = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(person);
            out.close();
            file.close();

            System.out.println("Selesai menulis object person");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}