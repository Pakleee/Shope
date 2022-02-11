package Shope;
import Shope.people.Client;
import Shope.people.Input;
import Shope.product.CollectionGenerator;

//Сам Магазин
public class Store {

    public static void main(String[] args) {
        Input.inputName();
        Client.choose();
        CollectionGenerator.printName(CollectionGenerator.сollection());
//        CollectionGenerator.productSearch(CollectionGenerator.сollection()); ??



//        Client Ivan = Client.clientInfoIvan();
//        Product water = Bilder.bildWater();
//        Product bread = Bilder.bildBread();
//        Product meat = Bilder.bildMeat();
//        Product vine = Bilder.bildVine(Ivan);
//        Product сollection = (Product) CollectionGenerator.getCollection();
//        Order sum = sum (water, bread, vine); // ???
//        Order one = Order.orderNumer();
//
//        Client Anna = Client.clientInfoAnna();
//        Product water1 = Bilder.bildWater();   //??
//        Product vine1 = Bilder.bildVine(Anna); //??
//        Order two = Order.orderNmber2();

    }

}

