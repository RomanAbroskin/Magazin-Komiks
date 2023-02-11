package Model;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class RedactorKomiks {


 public static List<Komiks> map = new ArrayList<>(List.of());

  public static   List< Komiks> map3 = new ArrayList<>(List.of());
    public static   List< Komiks> map4 = new ArrayList<>(List.of());

    public static void  pervoe() {
        Scanner S = new Scanner(System.in);
        Map<String, Komiks> map2 = new HashMap<>();

        int poz, col, god, sib, cena;
        int pozz;
        boolean Prodolgenie;
        String name, FIO, Isdatel, ghanr;

        map.clear();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("komics.bin"))) {

            while (true) {
                Komiks kom = (Komiks) objectInputStream.readObject();
                map.add(kom);
            }
        } catch (EOFException e) {

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }




        System.out.println("----------Магазин Комиксов---------");


        System.out.println("что вы хотите сделать?");

        System.out.println("1.Добавить комикс\n2.Удалить комикс\n3.Редактировать парваметры комикса\n4.Отложить для покупателя\n5.Посмотреть наличие Комиксов\n6.Пропустить");
        int namber = S.nextInt();

        if (namber == 1) {
            System.out.println("Название комикса");
            name = S.next();
            System.out.println("Введите ФИО автора");
            FIO = S.next();
            System.out.println("Название издательства комикса");
            Isdatel = S.next();
            System.out.println("Количество страниц");
            col = S.nextInt();
            System.out.println("Жанр");
            ghanr = S.next();
            System.out.println("Год издания");
            god = S.nextInt();
            System.out.println("Cебестоимость");
            sib = S.nextInt();
            System.out.println("Цена для продажи");
            cena = S.nextInt();
            System.out.println("является ли комикс продолжением какого-то другого комикса или серии комиксов. true или folse");
            Prodolgenie = Boolean.parseBoolean(S.next());
            Komiks kom = new Komiks(name, FIO, Isdatel, col, ghanr, god, sib, cena, Prodolgenie);
            map.add(kom);
            map4.add(kom);
            System.out.println(map.size());
            try {
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("komics.bin", false));
                for (int i = 0; i < map.size(); i++) {
                    String vv = String.valueOf(map.get(i));
                    System.out.println(vv);
                    outputStream.writeObject(map.get(i));
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (namber == 2) {
            System.out.println("Что вы хотите удалить?");
            for (int i = 0; i < map.size(); i++) {
                System.out.println(i + ". " + map.get(i).getNameKomics());
            }
            poz = S.nextInt();
            System.out.println(map.get(0));
            System.out.println(map.size());
            map.remove(poz);
            System.out.println(map.size());
            try {
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("komics.bin", false));
                for (int i = 0; i < map.size(); i++) {
                    outputStream.writeObject(map.get(i));
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (namber == 3) {
            System.out.println("Какой комикс вы хотите редактировать?");
            for (int i = 0; i < map.size(); i++) {
                System.out.println(i + ". " + map.get(i).getNameKomics());
            }
            pozz = S.nextInt();
            System.out.println("что именно вы хотите редактировать?");
            System.out.println("1.ФИО\n2.Название комикса\n3.Издательство комикса\n4.Количество страниц\n5.Жанр\n6.Год издания\n7.Сибестоимость\n8.Цена для продажи\n9.является ли комикс продолжением какого-то другого комикса или серии комиксов. true или folse");
            int redaktor = S.nextInt();
            if (redaktor == 1) {
                System.out.println("Введите ФИО");
                String FIo = S.next();
                map.get(pozz).setFioAvtors(FIo);
                try {
                    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("komics.bin", false));
                    for (int i = 0; i < map.size(); i++) {
                        outputStream.writeObject(map.get(i));
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (redaktor == 2) {
                System.out.println("Название комикса");
                String FIo = S.next();
                map.get(pozz).setNameKomics(FIo);
                System.out.println(map.get(0));
                try {
                    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("komics.bin", false));
                    for (int i = 0; i < map.size(); i++) {
                        outputStream.writeObject(map.get(i));
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (redaktor == 3) {
                System.out.println("Издательство комикса");
                String FIo = S.next();
                map.get(pozz).setNameIsdatel(FIo);
                try {
                    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("komics.bin", false));
                    for (int i = 0; i < map.size(); i++) {
                        outputStream.writeObject(map.get(i));
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (redaktor == 4) {
                System.out.println("Количество страниц");
                int FIo = S.nextInt();
                map.get(pozz).setKolichestvoStronic(FIo);
                try {
                    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("komics.bin", false));
                    for (int i = 0; i < map.size(); i++) {
                        outputStream.writeObject(map.get(i));
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (redaktor == 5) {
                System.out.println("Год издания");
                int FIo = S.nextInt();
                map.get(pozz).setGodIsdania(FIo);
                try {
                    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("komics.bin", false));
                    for (int i = 0; i < map.size(); i++) {
                        outputStream.writeObject(map.get(i));
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (redaktor == 6) {
                System.out.println("Сибестоимость");
                int FIo = S.nextInt();
                map.get(pozz).setSibestoimost(FIo);
                try {
                    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("komics.bin", false));
                    for (int i = 0; i < map.size(); i++) {
                        outputStream.writeObject(map.get(i));
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (redaktor == 7) {
                System.out.println("Цена для продажи");
                int FIo = S.nextInt();
                map.get(pozz).setCenaProdagi(FIo);
                try {
                    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("komics.bin", false));
                    for (int i = 0; i < map.size(); i++) {
                        outputStream.writeObject(map.get(i));
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (redaktor == 8) {
                System.out.println("является ли комикс продолжением какого-то другого комикса или серии комиксов. true или folse");
                boolean FIo = Boolean.parseBoolean(S.next());
                map.get(pozz).setProdolgenieKomiks(FIo);
                try {
                    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("komics.bin", false));
                    for (int i = 0; i < map.size(); i++) {
                        outputStream.writeObject(map.get(i));
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else System.out.println("не коректная инвормация");
        } else if (namber == 4) {
            System.out.println("Какому покупателю вы хотите отлажить комикс?");
            String pokupatel = S.next();
            System.out.println("Какой комикс вы хотите отложить?");
            for (int i = 0; i < map.size(); i++) {
                System.out.println(i + ". " + map.get(i));
            }
            int g = S.nextInt();
            map2.put(pokupatel, map.get(g));
            map.remove(g);
            map3.add(g, map.get(g));
            try {
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("komics.bin", false));
                for (int i = 0; i < map.size(); i++) {
                    outputStream.writeObject(map.get(i));
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (namber == 5) {

            for (int i = 0; i < map.size(); i++)
                System.out.println("Комиксы в наличие " +"'"+ map.get(i).getNameKomics()+"'"+"\n");
            System.out.println("Продолжить введите --> 1");
            int c = S.nextInt();
            if (c == 1) {

            } else {
            }

        }else if (namber==6){

            } else System.out.println("Не коректная информация");


    }
}


