package Shope.product;
import java.util.ArrayList;

public class CollectionGenerator extends Bilder{

    public  static ArrayList<Product> сollection (){
        ArrayList<Product> products =  new ArrayList<>();
        products.add(bildMeat());
        products.add(bildBread());
        products.add(bildWater());
        products.add(bildVine());
        return products;
    }
    public static void printName(ArrayList<Product> products) {
        for (Product p : products) {
            p.chooseState();
        }
    }
    public static void productSearch (ArrayList<Product> products) {
        System.out.println(products.get(bildMeat().hashCode()%1000));
    }
}
