package Shope.Product;

public class Order {
    private String name;
    private String state;
    private int idOrder;

    public Order(String name, String state, int idOrder) {
        this.name = name;
        this.state = state;
        this.idOrder = idOrder;
    }

    public void setState() {
        System.out.println("Товар, передан в оформление.");
        this.state = state;
    }
}
