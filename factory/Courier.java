package Shope.factory;

import java.util.Random;

public class Courier implements Delivery,Runnable {

    Random r = new Random(1000);
    int deliveryNumber= r.nextInt(1000);

    @Override
    public void getDelivery() {
        System.out.println("Выбрана доставка курьером");
    }

    @Override
    public void run() {
        try {Thread.sleep(1000);
            System.out.println("Доставка  под № "+deliveryNumber+" оформленна.");
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
