package Shope;
import Shope.product.Bilder;
import Shope.product.Order;
import Shope.product.Product;
import Shope.people.Client;
import static Shope.people.Client.checkAge;
import static Shope.product.Order.sum;

//Сам Магазин
public class Store {

    public static void main(String[] args) {
       /* Buyer client = new Buyer();
        client.Client();
        Scanner a1 = new Scanner(System.in);
        String Client = a1.nextLine();
      if (a1.hasNextLine()){
            String c =a1.nextLine();
            System.out.println("Добро пожаловать "+c);
        } else {
            System.out.println("Извините, но вы ввели не верное имя");
        }
        System.out.print(Client);

        Product s = new Product();
        s.setName("");
        String setName = a1.nextLine(); */ //Код который пока не работает как должен.
        Client Ivan = Client.clientInfoIvan();
        Product water = Bilder.bildWater();
        Product bread = Bilder.bildBread();
        Product meat = Bilder.bildMeat();
        Product vine = Bilder.bildVine(Ivan);
        Order sum = sum (water, bread, vine); // ???
        Order one = Order.orderNumer();

        Client Anna = Client.clientInfoAnna();
        Product water1 = Bilder.bildWater();   //??
        Product vine1 = Bilder.bildVine(Anna); //??
        Order two = Order.orderNmber2();
    }

}

