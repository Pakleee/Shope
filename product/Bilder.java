package Shope.product;

import Shope.people.Client;

import static Shope.people.Client.checkAge;

public class Bilder {
    public static Product bildMeat() {
        Product Meat = new Product("Мясо", 257, 21 / 12 / 2021, 456);
        Meat.setState("Отсутствует");
        Meat.getPrice();
        return Meat;
    }

    public static Product bildBread() {
        Product bread = new Product("Хлеб", 25, 21 / 12 / 2021, 123);
        bread.setState("В наличии");
        bread.getPrice();
        bread.setDiscount(0);
        return bread;
    }

    public static Product bildWater() {
        Product Water = new Product("Вода", 156, 12 / 12 / 2021, 12345);
        Water.setState("В наличии");
        Water.getPrice();
        Water.setDiscount(10);
        return Water;
    }
    public static Product bildVine(Client Ivan) {
        Product Vine = new Product("Вино", 300, 12 / 06 / 2021, 555);
        Vine.setState("В наличии");
        Vine.getPrice();
        checkAge(Ivan);
        return Vine;
    }
}
