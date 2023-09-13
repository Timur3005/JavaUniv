package fourth.atelier;

public class TestFourth {

    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Sizes.XXS, 20.0, "Красный"),
                new TShirt(Sizes.S, 25.0, "Синий"),
                new Pants(Sizes.M, 30.0, "Черный"),
                new Pants(Sizes.L, 35.0, "Серый"),
                new Skirt(Sizes.S, 40.0, "Зеленый"),
                new Tie(Sizes.M, 15.0, "Голубой")
        };

        Atelier.dressWomen(clothes);
        Atelier.dressMan(clothes);
    }

}
