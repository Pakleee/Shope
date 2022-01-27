package Shope.product;

import Shope.people.Client;

import java.util.ArrayList;

import static Shope.people.Client.checkAge;

public class Bilder  {
    public static Product bildMeat() {
        Product Meat = new Product("Мясо",257,21/12/2021,456);
        Meat.setState("отсутствует");
        Meat.getPrice();
        Meat.infoChose();
        return Meat;
    }

    public static Product bildBread() {
        Product Bread = new Product("Хлеб",25,21/12/2021,123);
        Bread.setState("в наличии");
        Bread.getPrice();
        Bread.setDiscount(0);
        Bread.infoChose();
        return Bread;
    }

    public static Product bildWater() {
        Product Water = new Product("Вода",156,12/ 12/2021,12345);
        Water.setState("в наличии");
        Water.getPrice();
        Water.setDiscount(10);
        Water.infoChose();
        return Water;
    }
    public static Product bildVine(Client Ivan) {
        Product Vine = new Product("Вино",300,12/06/2021,555);
        Vine.setState("в наличии");
        Vine.getPrice();
        Vine.infoChose();
        checkAge(Ivan);
        return Vine; //?? Сгенерировалось так но в main работает с другим клиентом
    }
    public static Product сollection (){
        ArrayList<Product> products = new ArrayList<>();
        products.add(bildMeat());
        products.add(bildBread());
        products.add(bildWater());
        return null;
    }


}
