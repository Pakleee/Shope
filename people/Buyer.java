package Shope.people;

import java.util.Scanner;

//Покупатель
public class Buyer extends Employee  {


    public Buyer(String name, String surname, int age) {
        super(name, surname, age);
    }

    public void Client() {

        System.out.print("Введите имя клиента: ");
    }

}


