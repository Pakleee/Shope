package Shope.product;
import Shope.people.Info;

//Продукты
public class Product implements Info {
    private String name; // Название продукта
    private float price; // 123
    private double date; // Дата
    private int barCode; //324325
    private String state; // Статус
    private int discount; // Акция

    public Product(String name, int price, double date, int barCode, String state, int discount ) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.barCode = barCode;
        this.state = state;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
//        System.out.println(" здравствуйте, выберите продукт: ");
    }

    public void checkState () {
        System.out.println("Товару " + name + ":");
        if (state.equalsIgnoreCase("в наличии")) {
            System.out.println("Присвоен статус " + state);
        } else {
            System.out.println("Присвоен статус " + state + ":к сожалению данного товра нет в наличии.");
        }

    }
    public void chooseState() {
        if (state.equalsIgnoreCase("в наличии")){
            System.out.print(getName()+", ");
        }else {
        }
    }

    public float getPrice() {
        return price;
    }
    public void printPrice(){
        if (state.equalsIgnoreCase("в наличии"))
            System.out.println("Цена на товор состовляет " + this.price + " " + "рублей.");
        else {
        }

    }
    public void setDiscount(int discount) {
        this.discount = discount;
        if (discount != 0)
            System.out.println("На этот товар распространяется скидка " + discount + "% \nЦена на товар,с учетом скидки, составит " + setPrice() + " рублей.");
    }

    public float setPrice() {
        this.price = price;
        return price - ((price / 100) * discount);
    }

    @Override
    public void infoChose() {
        if (state.equalsIgnoreCase("в наличии"))
        System.out.println("Товар "+name+" перемещен в корзину.");
        else {
            System.out.println("Выбрать данный товар не возможно, так как его статус "+state);
        }
    } // ?? Метод не смотрит на возраст

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
