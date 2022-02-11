package Shope.product;

public class Bilder  {
    public static Product bildMeat() {
        Product meat = new Product("Мясо",257,21/12/2021,456,"отсутствует",0);
//        meat.checkState();
//        meat.printPrice();
//        meat.infoChose();
          meat.hashCode();
        return meat;
    }

    public static Product bildBread() {
        Product bread = new Product("Хлеб",25,21/12/2021,123,"в наличии",0);
//        bread.checkState();
//        bread.printPrice();
//        bread.setDiscount(0);
//        bread.infoChose();
          bread.hashCode();
        return bread;
    }

    public static Product bildWater() {
        Product water = new Product("Вода",156,12/ 12/2021,12345,"в наличии",10);
//        water.checkState();
//        water.printPrice();
//        water.setDiscount(10);
//        water.infoChose();
          water.hashCode();
        return water;
    }
    public static Product bildVine() {
        Product vine = new Product("Вино",300,12/06/2021,555,"в наличии",0);
//        vine.checkState();
//        vine.printPrice();
//        checkAge();
//        vine.infoChose();
          vine.hashCode();
        return vine; //?? Сгенерировалось так но в main работает с другим клиентом
    }




}
