package Model;
import java.util.List;
import java.util.Scanner;
public class InfoKomiks extends RedactorKomiks {
     static void vtoroe(){
         Scanner S = new Scanner(System.in);
         System.out.println("Какое действие вы хотите совершить?\n1.Поиск\n2.Посмотреть новинки\n3.Самые продоваемые комиксы\n4.Самые популярные авторы\n5.Самый популярный жанр\n6.Выход");
         int chilo=S.nextInt();
         if (chilo==1){
             System.out.println("по какому признаку вы хотите искать?");
             System.out.println("1.Название комикса\n2.ФИО\n3.Жанр");
             int poisk=S.nextInt();
             if (poisk == 1) {
                 System.out.println("Введите название комикса");
                 String poiskN=S.next();
                 String otvet=poiskN.toLowerCase();
                 List<Komiks> Komok= map.stream()
                         .filter(a -> a.getNameKomics().equals(otvet)).toList();
                 for (Komiks komiks : Komok) {
                     System.out.println(komiks);
                 }
             } else if (poisk==2) {
                 System.out.println("ФИО");
                 String poiskN=S.next();
                 String otvet=poiskN.toLowerCase();
                 List<Komiks> Komok= map.stream()
                         .filter(a -> a.getFioAvtors().equals(otvet)).toList();
                 for (Komiks komiks : Komok) {
                     System.out.println(komiks);
                 }
             } else if (poisk==3) {
                 System.out.println("Жанр");
                 String poiskN=S.next();
                 String otvet=poiskN.toLowerCase();
                 List<Komiks> Komok= map.stream()
                         .filter(a -> a.getGhanrKomiks().equals(otvet)).toList();
                 for (Komiks komiks : Komok) {
                     System.out.println(komiks);
                 }
             } else System.out.println("Не коректные данные");
         } else if (chilo==2) {
             System.out.println("Поступление новых комиксов");
             for (int i=0;i<map4.size();i++){
                 System.out.println(map4.get(i));
             }
         } else if (chilo==3) {
             System.out.println("Самые продоваемые комиксы");
             for (int i=0;i<map3.size();i++){
                 int n=0;
                 for (int j=0;j<map3.size();j++){
                     if (map3.get(i).getNameKomics().equals(map3.get(j).getNameKomics())){
                         n++;
                     }
                 }System.out.println(map3.get(i).getNameKomics()+" - продался "+n+" раза");
             }
         } else if (chilo==4) {
             System.out.println("Самые популярные авторы");
             for (int i=0;i<map3.size();i++){
                 int n=0;
                 for (int j=0;j<map3.size();j++){
                     if (map3.get(i).getFioAvtors().equals(map3.get(j).getFioAvtors())){
                         n++;
                     }
                 }System.out.println(map3.get(i).getFioAvtors()+" - продался "+n+" раза");
             }
         } else if (chilo==5) {
             System.out.println("Самый популярный жанр");
             for (int i=0;i<map3.size();i++){
                 int n=0;
                 for (int j=0;j<map3.size();j++){
                     if (map3.get(i).getGhanrKomiks().equals(map3.get(j).getGhanrKomiks())){
                         n++;
                     }
                 }System.out.println(map3.get(i).getGhanrKomiks()+" - продался "+n+" раза");
             }
         }else if (chilo==6){
             System.out.println("Досвидание");
         }
         else System.out.println("Не короктная инвормация");
     }
}
