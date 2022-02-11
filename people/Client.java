package Shope.people;
//Клиент
public class Client extends Input implements Info {
    private String name;
    private String surname;
    private int age;

    public Client(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void checkAge(Client Ivan) {
        if (Ivan.getAge() >= 18) {
            System.out.println("Продажа алкоголя, разрешена.");}
        if  (Ivan.getAge() < 18){
            System.out.println("Продажа алкогольной продукции лицам не достигшим 18 лет запрещена");
        }
    }
    public static void choose(){
        System.out.print( "Выбирайте  доступные товары товары:");
    }

    public static Client clientInfoAnna() {
        Client Anna = new Client("Анна", "Иванова", 75);
        Anna.infoChose();
        return Anna;
    }

    public static Client clientInfoIvan() {
        Client Ivan = new Client("Иван", "Иванов", 17);
        Ivan.infoChose();
        Ivan.getAge();
        return Ivan;
    }



    @Override
    public void  infoChose() {
        System.out.println("Клиент "+this.surname+" "+this.name+" в возрасте "+this.age+"лет, "+"выбирает товары:");
    }

}


