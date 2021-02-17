package org.example.OOP_basic.IO.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        SeriallizedPerson person = null;
        {
            try {
                FileInputStream fis = new FileInputStream("SerializedPerson.data");
                ObjectInputStream ios = new ObjectInputStream(fis);

                person = (SeriallizedPerson) ios.readObject();

                System.out.println(person);
                System.out.println("person id" + person.getId());

                ios.close();
                fis.close();

                System.out.println(person);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
