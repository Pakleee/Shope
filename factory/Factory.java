package Shope.factory;


import java.io.IOException;
import java.util.Scanner;

public class Factory implements Runnable {
    @Override
    public void run() {
        System.out.println("Доставка оформленна.");

    }

    public static Delivery getDelivery() throws IOException {
        System.out.println("Выберите способ доставки: ");
        System.out.println("1.Курьером \n2.Самовывоз");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();

        Delivery delivery = null;
        if (choise == 1) {
            delivery = new Courier();
            delivery.getDelivery();
            Courier deliveryNumber = new Courier();
            new Thread(deliveryNumber).start();


        } else if (choise == 2) {
            delivery = new Pickup();
            delivery.getDelivery();
            Pickup deliveryNumber = new Pickup();
            new Thread(deliveryNumber).start();


        }
        return delivery;


    }

}


