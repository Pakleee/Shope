package Shope;
import Shope.product.Bilder;
import Shope.product.Order;
import Shope.product.Product;
import Shope.people.Client;

import java.util.ArrayList;

import static Shope.product.Order.sum;

//Сам Магазин
public class Store {

    public static void main(String[] args) {
        Client Ivan = Client.clientInfoIvan();
        Product water = Bilder.bildWater();
        Product bread = Bilder.bildBread();
        Product meat = Bilder.bildMeat();
        Product vine = Bilder.bildVine(Ivan);
//        Product сollection = Bilder.сollection();
        Order sum = sum (water, bread, vine); // ???
        Order one = Order.orderNumer();

        Client Anna = Client.clientInfoAnna();
        Product water1 = Bilder.bildWater();   //??
        Product vine1 = Bilder.bildVine(Anna); //??
        Order two = Order.orderNmber2();

    }

}

