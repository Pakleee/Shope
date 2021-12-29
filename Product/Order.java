package Shope.Product ;

public class Order {
    private String name;
    private String state;
    private int idOrder;
    private int sumOrder;

    public Order(String name, String state, int idOrder, int sumOrder) {
        this.name = name;
        this.state = state;
        this.idOrder = idOrder;
    }

    public void setState() {
        System.out.println("Товар, передан в оформление.");

    }
    public void setSumOrder(){
        for (int i=0;i<=5;i++)
            sumOrder=sumOrder+i;
        System.out.println("Заказ № "+sumOrder+" передан в оформление");

    }



}
