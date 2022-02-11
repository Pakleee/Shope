package Shope.product;

//Оплата
public abstract class Payment {
    private String paymentType; //Способ оплаты
    private Order order;
    private float sum;
    private String state;

    public Payment(String paymentType, Order order, float sum, String state) {
        this.paymentType = paymentType;
        this.order = order;
        this.sum = sum;
        this.state = state;
    }

    public void setSum(float sum) {
        System.out.println(); // Тут должна быть сумма всех покупок, но пока не знаю как это записать
        this.sum = sum;
    }
}

