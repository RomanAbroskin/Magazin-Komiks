package Model;

import java.util.Scanner;

public class InfoKomiks  {

     static void vtoroe(){
         Scanner S = new Scanner(System.in);
         System.out.println("Какое действие вы хотите совершить?\n1.Поиск\n2.Посмотреть новинки\n3.Самые продоваемые комиксы\n4.Самые популярные авторы\n5.Самый популярный жанр");
         int chilo=S.nextInt();
         if (chilo==1){
             System.out.println("по какому признаку вы хотите искать?");
             System.out.println("1.Название комикса\n2.ФИО\n3.Жанр");
             int poisk=S.nextInt();
             if (poisk == 1) {
                 System.out.println("Введите название комикса");
                 String poiskNazvaniua=S.next();
             }
         } else if (chilo==2) {

         } else if (chilo==3) {

         } else if (chilo==4) {

         } else if (chilo==5) {

         }else System.out.println("Не короктная инвормация");
     }

}
