import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Colors> colors = new ArrayList<>(); //#1
        colors.add(Colors.BLUE);
        colors.add(Colors.ORANGE);
        colors.add(Colors.PINK);
        colors.add(Colors.BROWN);
        System.out.println(colors);
        for (Weekdays weekday : Weekdays.values()) { //№2
            Weekdays.isHoliday(weekday);
        }
        Cat Cat = new Cat(); //№3
        Cat.Species();
        Cat.Food();
        /*

        HashMap<String, String> phonebook = new HashMap<>();//№5
        Scanner ins = new Scanner(System.in);
        while (true) {
            System.out.println("Справочная книга");
            System.out.println("Нажмите :1. что бы добавить контакт");
            System.out.println("Нажмите :2. что бы посмотреть информацию о телефонной книге");
            System.out.println("Нажмите :3. что бы обновить контакт");
            System.out.println("Нажмите :4. что бы найти контакт");
            System.out.println("Нажмите :0. что бы выйти из программы");
            System.out.print("Введите значение: ");
            int choice = ins.nextInt();
            switch (choice) {
                case 1:
            System.out.print("Введите имя: ");
            String name = ins.next();
            System.out.print("Введите номер телефона: ");
            String phone = ins.next();
            phonebook.put(name, phone);
            System.out.println("Контакт успешно добавлен");
            break;
            case 2:
                if (phonebook.isEmpty()) {
                    System.out.println("Контакт не найден");
                } else {
                System.out.println("Имя\t\tТелефон");
                for (String key : phonebook.keySet()) {
            System.out.println(key + "\t\t" + phonebook.get(key));}}
            break;
            case 3:
                System.out.print("Введите имя: ");
                name= ins.next();
                if (!phonebook.containsKey(name)) {
                    System.out.println("Контакт не найден");}
                else {
                    System.out.print("Введите новый номер: ");
                    phone = ins.next();
                    phonebook.put(name, phone);
                    System.out.println("Контакт успешно обновлён");
                }
                    break;
                case 4:
                    System.out.print("Введите имя: ");
                    name= ins.next();
                    if (!phonebook.containsKey(name)) {
                        System.out.println("Контакт не найден");
                    } else {
                        System.out.println("Имя\t\tТелефон");
                        System.out.println(name + "\t\t" + phonebook.get(name));
                    }
                    break;
                case 0:
                    System.out.println("Выход из программы ...");
                    System.exit(0);
                    break;
                default:
                   System.out.println("Неверный набор. Попробуйте еще раз.");}

         */

            ArrayList<Colors> mycolors = new ArrayList<>();//№6
            mycolors.add(Colors.BLACK);
            mycolors.add(Colors.WHITE);
            mycolors.add(Colors.RED);
            System.out.println(mycolors);

            ArrayList<String> Series= new ArrayList<>(); //№8
            Series.add("Squied_Game");
            Series.add("Vincenzo");
            Series.add("My_Name");
            Series.add("Signal");
            Series.add("Healer");
            Series.set(1,"Nevertheless");
            System.out.println(Series);
        LinkedList<String> mySeries = new LinkedList<>();//№9
        mySeries.add("Squied_Game");
        mySeries.add("Vincenzo");
        mySeries.add("My_Name");
        mySeries.add("Signal");
        mySeries.add("Healer");
        System.out.println("Первый элемент :"+ mySeries.getFirst());
        System.out.println("Последний элемент : " + mySeries.getLast());

         LinkedList<Integer> myList = new LinkedList<>();//№10
         myList.add(1);
         myList.add(3);
         myList.add(4);
         myList.add(2);
         myList.add(5);
        System.out.println("Список"+myList);

        int firstIndex = 2;
         int secondIndex = 4;

         int temp = myList.get(firstIndex);
         myList.set(firstIndex, myList.get(secondIndex));
         myList.set(secondIndex, temp);
         System.out.println("Обновленный список: " + myList);
         Set<Integer> boc = new HashSet<>(); //№11
         boc.add(12);
         boc.add(1);
         boc.add(9);
         boc.add(94);
         Set<Integer> exo = new HashSet<>();
         exo.add(88);
         exo.add(1);
         exo.add(12);
         exo.add(61);
        boc.retainAll(exo);
        System.out.println("Сравнения двух HashSet: " + boc);
        Set<Integer> mySet = new HashSet<>();//№12
        if (mySet.isEmpty()) {
            System.out.println("Набор пустой.");
        } else {
            System.out.println("Набор не пустой.");
        }

        Map<Integer, String> myMap = new HashMap<>();//№14
        myMap.put(1,"Вена");
        myMap.put(2,"Париж");
        myMap.put(3,"Алматы");
        myMap.put(4,"Милан");
        myMap.put(5,"Рим");

        String valueToFind = "Рим";

        if (myMap.containsValue(valueToFind)) {
            System.out.println("Запись содержит значение '" + valueToFind + "'.");
        } else {
            System.out.println("Запись не содержит значение '" + valueToFind + "'.");
        }


    }



    }
