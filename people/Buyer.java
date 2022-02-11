package Shope.people;

//Покупатель
public class Buyer extends Client implements Info{


    public Buyer(String name, String surname, int age) {

        super(name, surname, age);
    }
    public Buyer() {

        super("undefined","Dc",12);
    }



    public String client() {

        System.out.print("Введите ваше имя: ");
        return null;
    }

    @Override
    public void infoChose() {

    }
}


