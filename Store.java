package Shope;

import Shope.Product.Order;
import Shope.Product.Product;
import Shope.Product.Storage;
import Shope.people.Buyer;
import Shope.people.Employee;

import java.util.Scanner;

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

        Employee Ivan = new Employee("Иван","Иванов",25);
        Ivan.choose();


        Product a = new Product("Вода",156,12/12/2021,12345);
        a.setState("в наличии");
        a.getPrice();
        a.setDiscount(10);
        //a.chekPrice();

        Product b = new Product("Хлеб",25,21/12/2021,123);
        b.setState("в наличии");
        b.getPrice();
        b.setDiscount(0);
        //b.chekPrice();

        Product c = new Product("Мясо",257,21/12/2021,456);
        c.setState("Отсутствует");
        c.getPrice();





        System.out.println("Общая ценна, доступного товара, составила: "+ (a.setPrice()+ b.setPrice()));
        Order zakaz = new Order("Покупка","Оформляется",123);
        zakaz.setState();





    }

}

