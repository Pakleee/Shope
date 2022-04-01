package Shope.factory;
//Самовывоз
public class Pickup extends Courier implements Delivery,Runnable {
    @Override
    public void getDelivery() {
        System.out.println("Выбран самовывоз");
    }

    @Override
    public void run() {
        try {Thread.sleep(1000);
            System.out.println("Доставка под № "+deliveryNumber+" оформленна.");
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
