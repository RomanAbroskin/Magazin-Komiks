package Model;

import Model.InfoKomiks;
import Model.Uzer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class RealisationProekt {
    public static void main(String[] args) {
        /*KomiksDaoRealisation dao = KomiksDaoRealisation.getInstabce();*/
        Scanner S = new Scanner(System.in);
        System.out.println("Введите логин");
        String Login=S.next();
        System.out.println("Введите пароль");
        String Password=S.next();
        Uzer uzer=new Uzer(Login,Password);

       RedactorKomiks.pervoe();
       InfoKomiks.vtoroe();

       try (ObjectOutputStream outimpitstrem=new ObjectOutputStream(new FileOutputStream("uzer.bin"))){
             outimpitstrem.writeObject(uzer);
       } catch (Exception ex){
           System.out.println(ex.getMessage());
       }
      /*  try (ObjectOutputStream outimpitstrem=new ObjectOutputStream(new FileOutputStream("Magazin.txt"))){
            outimpitstrem.writeObject(Komiks);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
*/

    }
}
