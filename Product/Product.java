package Shope.Product;


//Продукты
public class Product {

    private String name; // Название продукта
    private float price; // 123
    private double  date; // Дата
    private int barCode; //324325
    private String state; // Статус
    private long Discount; // Акция
    private float sum; //Сумма товара


    public Product(String name, int price, double date, int barCode ) {
        this.name=name;
        this.price=price;
        this.date=date;
        this.barCode=barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(" здравствуйте, выберите продукт: Вода или Хлеб");
    }


    public void setState(String state) {
        this.state = state;
        System.out.println("Товару "+name+" "+"присвоен статус "+state);

    }

    public float getPrice() {
        System.out.println("Цена товора состовляет "+this.price+" "+"рублей");
        return price;

    }

    public void setDiscount(int discount) {
        Discount = discount;
        System.out.println("На этот товар распространяется скидка "+discount+"%");
    }

    public void chekPrice (){
        System.out.println("Цена на товар,с учетом скидки, составит "+(price=price-((price/100)*Discount))+" рублей");
    }


}
