package Model;

import Model.Dao.UzerDao;

import java.util.Scanner;

public class Aplication  {
    private final UzerDao uzerDao;
    private final Scanner S;
    public Aplication(UzerDao uzerDao) {
        this.uzerDao = uzerDao;
        this.S=new Scanner(System.in);
    }
    public void run()  {
        while (true){
            System.out.println(" Авторизация --> нажмите --> 1\n Зарегестрироватся --> нажмите -> 2\n Выход --> нажмите -> 3");
            Scanner S =new Scanner(System.in);
            int variant=S.nextInt();
            if (variant==1){
               avtorisation();
            } else if (variant==2) {
                 registr();
            } else if (variant==3) {
                 break;
            } else System.out.println("не коректные данные");
        }
        uzerDao.save();
    }
    private void avtorisation()  {
        System.out.println("введите НИК");
        String nickName = S.next();
        System.out.println("введите пароль");
        String password = S.next();
        Uzer uzer = new Uzer(nickName, password);
        if (uzerDao.avtorisation(uzer)){
            System.out.println();
            RedactorKomiks.pervoe();
            InfoKomiks.vtoroe();
        }else System.out.println("Не верные данные");
    }
    private void registr(){
        System.out.println("Введите НИК");
        String nickName = S.next();
        System.out.println("Введите пароль");
        String password = S.next();
        Uzer uzer = new Uzer(nickName, password);
        if (uzerDao.registr(uzer)){
            System.out.println();
        }else System.out.println("Не верные данные");
        uzerDao.save();
    }
}
