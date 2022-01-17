package Shope.people;
//Клиент
public class Client {
    private String name;
    private String surname;
    private int age;

    public Client(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void choose (){
        System.out.println("Клиент "+this.name + " выбирает товары:");
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
            System.out.println("Продажа запрещенна");
        }
    }
    public static Client clientInfoAnna() {
        Client Anna = new Client("Анна", "Иванова", 75);
        Anna.choose();
        return Anna;

    }

    public static Client clientInfoIvan() {
        Client Ivan = new Client("Иван", "Иванов", 17);
        Ivan.choose();
        Ivan.getAge();
        return Ivan;
    }

}


