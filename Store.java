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
        Ivan.getAge();



        Product Water = new Product("Вода",156,12/12/2021,12345);
        Water.setState("В наличии");
        Water.getPrice();
        Water.setDiscount(10);


        Product Bread = new Product("Хлеб",25,21/12/2021,123);
        Bread.setState("В наличии");
        Bread.getPrice();
        Bread.setDiscount(0);


        Product Meat = new Product("Мясо",257,21/12/2021,456);
        Meat.setState("Отсутствует");
        Meat.getPrice();

        Product Vine = new Product("Вино",300,12/06/2021,555);
        Vine.setState("В наличии");
        Vine.setPrice();
      while (Ivan.getAge()>=18){
          System.out.println("Продажа алкоголя, разрешена.");
          if (Ivan.getAge()<18){
                System.out.println("Продажа запрещенна");
            }break;
        }






        System.out.println("Общая ценна, доступного товара, составила: "+ (Water.setPrice()+ Bread.setPrice())+" рублей.");
        Order zakaz = new Order("Покупка","Оформляется",123);
        zakaz.setState();





    }

}

