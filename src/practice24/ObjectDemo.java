package practice24;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDemo {
    public static void main(String[] args) {
        try {
            // Откройте файл для чтения
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("customer.ser"));
            // Десериализуйте объект из файла
            Customer customer = (Customer) inputStream.readObject();
            // Закройте поток ввода
            inputStream.close();

            // Теперь у вас есть восстановленный объект
            System.out.println("Deserialized Customer: " + customer);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}