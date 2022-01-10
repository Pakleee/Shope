package Shope.Product;


//Продукты
public class Product {

    private String name; // Название продукта
    private float price; // 123
    private double  date; // Дата
    private int barCode; //324325
    private String state; // Статус
    private long Discount; // Акция



    public Product(String name, int price, double date, int barCode) {
        this.name=name;
        this.price=price;
        this.date=date;
        this.barCode=barCode;

    }

    public String getName() {
        System.out.print(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(" здравствуйте, выберите продукт: Вода или Хлеб");
    }


    public void setState(String state) {
        this.state = state;
        System.out.println("Товару "+name+ ":");
        if (state.equalsIgnoreCase("в наличии")){
            System.out.println("Присвоен статус "+state);
        } else {
            System.out.println("Присвоен статус "+state+":к сожалению данного товра нет в наличии.");
        }


    }

    public float getPrice() {
        System.out.println("Цена на товор состовляет "+this.price+" "+"рублей.");
        return price;

    }

    public void setDiscount(int discount) {
        Discount = discount;
        if (discount!=0)
        System.out.println("На этот товар распространяется скидка "+discount+"% \nЦена на товар,с учетом скидки, составит "+ setPrice()+ " рублей.");


    }



    public float setPrice() {
        this.price = price;
        return price-((price/100)*Discount);
    }
}
