package Shope.people;

import Shope.product.Product;

import java.util.Scanner;

//Покупатель
public abstract class Buyer extends Client implements Info{


    public Buyer(String name, String surname, int age) {

        super(name, surname, age);
    }
    public Buyer() {

        super("undefined","Dc",12);
    }



    public void Client() {

        System.out.print("Введите имя клиента: ");
    }

    @Override
    public void infoChose() {

    }
//    Buyer client = new Buyer();
//        client.Client();
//    Scanner a1 = new Scanner(System.in);
//    String Client = a1.nextLine();
//        if (a1.hasNextLine()){
//        String c =a1.nextLine();
//        System.out.println("Добро пожаловать "+c);
//    } else {
//        System.out.println("Извините, но вы ввели не верное имя");
//    }
//        System.out.print(Client);
//
//    Product s = new Product();
//        s.setName("");
//    String setName = a1.nextLine();  //Код который пока не работает как должен.
//}
}


