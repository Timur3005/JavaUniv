package practice24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializationDemo {
    public static void main(String[] args) {
        try {
            Customer customer = new Customer();

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("customer.ser"));

            outputStream.writeObject(customer);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
