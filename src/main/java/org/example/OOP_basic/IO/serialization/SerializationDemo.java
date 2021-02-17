package org.example.OOP_basic.IO.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {

        SeriallizedPerson person = new SeriallizedPerson(22, "jan", "kowalski", 33);
        try {
                FileOutputStream fOut = new FileOutputStream("SerializedPerson.data");
                ObjectOutputStream oOoy = new ObjectOutputStream(fOut);

                oOoy.writeObject(person);

                oOoy.close();
                fOut.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}