package Shope.people;
//Клиент
public class Client extends Input implements Info {
    private String name;
    private String surname;
    private  int age;

    public Client(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public  int getAge() {

        return age;
    }
    public  String checkAge() {
        if (getAge() >= 18) {
            return "Продажа алкоголя, разрешена.";
        } else {
          return  "Продажа алкогольной продукции лицам не достигшим 18 лет запрещена";
        }
    }
    public static void choose(){
        System.out.println( "Выбирайте  доступные товары товары:");
    }

    public static Client clientInfoAnna() {
        Client Anna = new Client("Анна", "Иванова", 75);
        Anna.infoChose();
        return Anna;
    }

    public static Client clientInfoIvan() {
        Client Ivan = new Client("Иван", "Иванов", 19);
        Ivan.infoChose();
        return Ivan;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", Возраст=" + age +
                ", Проверка возраста="+ checkAge()+
                '}';
    }

    @Override
    public void  infoChose() {
        System.out.println("Клиент "+this.surname+" "+this.name+" в возрасте "+this.age+"лет, "+"выбирает товары:");
    }

}


