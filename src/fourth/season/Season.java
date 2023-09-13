package fourth.season;

public enum Season {
    Весна("Весна", 15, "Холодное время года"),
    Лето("Лето", 25, "Теплое время года"),
    Осень("Осень", 18, "Холодное время года"),
    Зима("Зима", 0, "Холодное время года");

    private final String name;
    private final int averageTemperature;
    private final String description;

    Season(String name, int averageTemperature, String description) {
        this.name = name;
        this.averageTemperature = averageTemperature;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        Season favoriteSeason = Лето; // Устанавливаем любимое время года
        System.out.println("Информация о любимом времени года:");
        System.out.println("Название: " + favoriteSeason.getName());
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());

        System.out.println("\nВывод описания для всех времен года:");
        for (Season season : Season.values()) {
            System.out.println(season.getName() + ":");
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }
}

