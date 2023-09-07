package fourth;

public abstract class Clothes {
    private Sizes size;
    private double cost;
    private String color;

    public Clothes(Sizes size, double cost, String color) {
        this.color = color;
        this.cost = cost;
        this.size = size;
    }

    public Sizes getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}
class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: Размер " + getSize().name() + ", Цвет " + getColor() + ", Цена " + getCost());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: Размер " + getSize().name() + ", Цвет " + getColor() + ", Цена " + getCost());
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: Размер " + getSize().name() + ", Цвет " + getColor() + ", Цена " + getCost());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: Размер " + getSize().name() + ", Цвет " + getColor() + ", Цена " + getCost());
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка: Размер " + getSize().name() + ", Цвет " + getColor() + ", Цена " + getCost());
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук: Размер " + getSize().name() + ", Цвет " + getColor() + ", Цена " + getCost());
    }
}