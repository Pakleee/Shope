package Shope.product;

public class Order {
    private String name;
    private String state;
    private int idOrder;
    private int sumOrder;

    public Order(String name, String state, int idOrder, int sumOrder) {
        this.name = name;
        this.state = state;
        this.idOrder = idOrder;
        this.sumOrder= sumOrder;
    }

    public void setState() {
        System.out.println("Товар, передан в оформление.");

    }
    public void setSumOrder(){
        for (int i=0;sumOrder<=0;i++)
            sumOrder=sumOrder+i;
        System.out.println("Заказ № "+sumOrder+" передан в оформление.");
    }
    public static Order orderNmber2() {
        Order zakaz2 = new Order("Покупка","Оформляется",124,2);
        zakaz2.setSumOrder();
        return zakaz2;
    }

    public static Order sum(Product water, Product bread, Product Vine) {
        System.out.println("Общая ценна, доступного товара, составила: " + (water.setPrice() + bread.setPrice() + Vine.setPrice()) + " рублей.");
        return null;
    }


    public static Order orderNumer() {
        Order zakaz1 = new Order("Покупка", "Оформляется", 123, 1);
        zakaz1.setSumOrder();
        return zakaz1;
    }

}
