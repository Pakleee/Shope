package Shope.people;

import java.io.*;
import java.util.Scanner;

public class Input {
    static String FILE_FORMAT = ".txt";

    static File CATALOG_NAME = new File("file/Клиенты/ ");

    public static Input inputName(){
    Buyer clientName = new Buyer();
    Scanner a1=new Scanner(System.in);
    clientName.client();
        if (a1.hasNextLine()){
            String c=a1.nextLine();
            System.out.println("Добро пожаловать "+c+"!");
        } else {
            System.out.println("Извините, но вы ввели не верное имя");
        }
        return clientName;
    }

    public static void  savePerson () throws IOException {
        System.out.println("Добро пожаловать, введите ваши данные. Имя,Фамилия и Возраст");
        Scanner sc= new Scanner(System.in);
        String person = sc.nextLine();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(CATALOG_NAME+person+FILE_FORMAT,true))){
    dos.writeUTF(person);
    dos.writeUTF(sc.nextLine());
    dos.writeInt((sc.nextInt()));
    dos.writeUTF("\n");
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Произошла ошибка попробуйте еще раз");
            savePerson();
        }
    }

    public static void writePerson (){
        System.out.println("Хотите проверить ваши данные?");
        System.out.println("1.Да");
        System.out.println("2.Нет");

        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();

        if (choise == 1){
            System.out.println("Введите ваше имя для провеки: ");
            String client =sc.next();
            try (DataInputStream dis =new DataInputStream(new FileInputStream(CATALOG_NAME+client+FILE_FORMAT))){
                Client p = new Client(dis.readUTF(), dis.readUTF(), dis.readInt());
                System.out.println(p);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Данный клиент не найден"+client+"попробуйте еще раз");
                writePerson();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if ( choise == 2){

        }
    }


}
