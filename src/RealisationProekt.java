import java.util.Scanner;

public class RealisationProekt {
    public static void main(String[] args) {
        /*KomiksDaoRealisation dao = KomiksDaoRealisation.getInstabce();*/

        Scanner S = new Scanner(System.in);
        System.out.println("----------Магазин Комиксов---------");

        System.out.println("что вы хотите сделать?");

        System.out.println("1.Добавить комикс\n2.Удалить комикс\n3.редактировать парваметры комикса\n4.Отложить для покупателя\n");

        int namber=S.nextInt();
        int t=2;



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
