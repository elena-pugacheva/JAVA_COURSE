
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или
// критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем HHD или SSD
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев -
// сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.

import java.util.*;

public class Filter {
    public static void main(String[] args) {

        Laptop l1 = new Laptop(1, 2, 128, "Windows 10", "Серый");
        Laptop l2 = new Laptop(2, 4, 256, "Windows 11", "Красный");
        Laptop l3 = new Laptop(3, 32, 512, "Windows 10", "Серый");
        Laptop l4 = new Laptop(4, 16, 256, "Windows 11", "Черный");


        System.out.println("Выберите функцию:");
        System.out.println("1 - сортировка по ОЗУ");
        System.out.println("2 - сортировка по SSD");
        System.out.println("3 - сортировка по OS");
        System.out.println("4 - сортировка по цвету");
        Scanner sc = new Scanner(System.in);
        Integer choice = sc.nextInt();
        if(choice == 1){

            System.out.printf("Введите значение ОЗУ: ");
            Integer ram = sc.nextInt();
            if(ram >=32){
                System.out.printf(l3.toString() + "\n");
            }else if(ram < 32){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
            }else if(ram < 16){
                System.out.printf(l1.toString() + "\n" + l2.toString());
            }else if(ram < 4){
                System.out.printf(l1.toString());
            }else System.out.println("Таких ноутбуков нет!");

        }else if(choice == 2){

            System.out.printf("Введите значение SSD: ");
            Integer ssd = sc.nextInt();
            if(ssd >=512){
                System.out.printf(l3.toString() + "\n");
            }else if(ssd < 512){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
            }else if(ssd < 256){
                System.out.printf(l1.toString() + "\n");
            }else if(ssd < 128){
                System.out.printf(l1.toString());
            }else System.out.println("Таких ноутбуков нет!");

        }else if(choice == 3) {

            System.out.println("Введите название OS");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            if (os.equalsIgnoreCase("Windows")) {
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            }else if (os.equalsIgnoreCase("Windows 10")) {
                System.out.printf(l1.toString() + "\n" + l3.toString());
            }else if (os.equalsIgnoreCase("Windows 11")) {
                System.out.printf(l2.toString() + "\n" + l4.toString());
            }else System.out.println("Таких ноутбуков нет!");

        }else if(choice == 4){

            System.out.println("Введите цвет");
            Scanner sc1 = new Scanner(System.in);
            String color = sc1.nextLine();
            if (color.equalsIgnoreCase("Серый")) {
                System.out.printf(l1.toString() + "\n" + l3.toString());
            }else if (color.equalsIgnoreCase("Красный")){
                System.out.printf(l2.toString() + "\n");
            }else if (color.equalsIgnoreCase("Черный")){
                System.out.printf(l4.toString() + "\n");
            } else System.out.println("Таких ноутбуков нет!");
        }
        sc.close();
    }
}