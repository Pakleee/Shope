package Shope.people;
//Сотрудник
public class Employee {
    private String name;
    private String surname;
    private int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void choose (){
        System.out.println("Клиент "+this.name + " выбирает товары:");
    }


}

