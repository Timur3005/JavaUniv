package sixth.fourth;

interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Service implements Priceable {
    private String serviceName;
    private double hourlyRate;

    public Service(String serviceName, double hourlyRate) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice() {
        return hourlyRate;
    }
}

class PricebleTest {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1000.0);
        Service consulting = new Service("Consulting", 50.0);

        System.out.println("Price of the laptop: $" + laptop.getPrice());
        System.out.println("Price of consulting (per hour): $" + consulting.getPrice());
    }
}

