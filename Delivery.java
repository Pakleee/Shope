package Shope;

public class Delivery {
    private int id;
    private int deliveryDate;
    private java.lang.String deliveryAdress;
    private int money;

    public Delivery(int id, int deliveryDate, java.lang.String deliveryAdress,int money){
        this.id = id;
        this.deliveryDate = deliveryDate;
        this.deliveryAdress = deliveryAdress;
        this.money = money;

    } public void setDeliveryAdress(java.lang.String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }
}