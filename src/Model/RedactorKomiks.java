package Model;

import Model.Komiks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public  class RedactorKomiks {

    static void  pervoe() {
        Scanner S = new Scanner(System.in);
        Map<Komiks, Integer> map = new HashMap<>();
        Map<Komiks, Integer> map2 = new HashMap<>();

        System.out.println("----------Магазин Комиксов---------");

        System.out.println("что вы хотите сделать?");

        System.out.println("1.Добавить комикс\n2.Удалить комикс\n3.редактировать парваметры комикса\n4.Отложить для покупателя\n");
        int namber = S.nextInt();

        if (namber == 1) {
            System.out.println("Название комикса");
            String name = S.next();
            System.out.println("Введите ФИО автора");
            String FIO = S.next();
            System.out.println("Название издательства комикса");
            String Isdatel = S.next();
            System.out.println("Количество страниц");
            int col = S.nextInt();
            System.out.println("Жанр");
            String ghanr = S.next();
            System.out.println("Год издания");
            int god = S.nextInt();
            System.out.println("Cебестоимость");
            int sib = S.nextInt();
            System.out.println("Цена для продажи");
            int cena = S.nextInt();
            System.out.println("является ли комикс продолжением какого-то другого комикса или серии комиксов. true или folse");
            boolean Prodolgenie = Boolean.parseBoolean(S.next());
            Komiks Kom = new Komiks(name, FIO, Isdatel, col, ghanr, god, sib, cena, Prodolgenie);
            map.put(Kom, Kom.getId());

        } else if (namber == 2) {
            System.out.println("Что вы хотите удалить?");
            for (int i = 1; i < map.size(); i++)
                System.out.println(i + map.get(i));
            int poz = S.nextInt();
            map.remove(poz);
        } else if (namber == 3) {
            System.out.println("Какой комикс вы хотите редактировать?");
            for (int i = 1; i < map.size(); i++)
                System.out.println(i + map.get(i));
            int pozz = S.nextInt();
            System.out.println("что именно вы хотите редактировать?");
            System.out.println("1.ФИО\n2.Название комикса\n3.Издательство комикса\n4.Количество страниц\n5.Жанр\n6.Год издания\n7.Сибистоимость\n8.Цена для продажи\n9.является ли комикс продолжением какого-то другого комикса или серии комиксов. true или folse");
            int redaktor = S.nextInt();

            if (redaktor==1){


            }

        } else if (namber == 4) {
            System.out.println("Какому покупателю вы хотите отлажить комикс?");
            String pokupatel = S.next();
            System.out.println("Какой комикс вы хотите отложить?");
            for (int i = 0; i < map.size(); i++) {
                System.out.println(i + map.get(i));
                int poz = S.nextInt();
                String otvet = String.valueOf(map.get(poz));
                /*map2.put(map.get(i),i);
                map.clear();*/
            }

        } else System.out.println("Не коректная информация");
    }
}
