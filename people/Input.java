package Shope.people;

import java.util.Scanner;

public class Input {
    public static Input inputName(){
    Buyer clientName = new Buyer();
    Scanner a1=new Scanner(System.in);
    clientName.client();
        if (a1.hasNextLine()){
            String c=a1.nextLine();
            System.out.println("Добро пожаловать "+c+"!");
        } else {
            System.out.println("Извините, но вы ввели не верное имя");
        }
        return clientName;
    }

}
