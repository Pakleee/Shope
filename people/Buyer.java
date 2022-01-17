package Shope.people;

//Покупатель
public class Buyer extends Client {


    public Buyer(String name, String surname, int age) {
        super(name, surname, age);
    }
    public Buyer() {
        super("undefined","Dc",12);
    }



    public void Client() {

        System.out.print("Введите имя клиента: ");
    }

}


