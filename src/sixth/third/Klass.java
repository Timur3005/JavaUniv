package sixth.third;

public class Klass {
    public static void main(String[] args) {
        // Создаем объекты различных классов
        Planet earth = new Planet("Earth");
        Car toyota = new Car("Toyota");
        Animal dog = new Animal("Dog");

        // Используем метод getName() для получения имени объекта
        System.out.println("Planet name: " + earth.getName());
        System.out.println("Car name: " + toyota.getName());
        System.out.println("Animal name: " + dog.getName());
    }
}
