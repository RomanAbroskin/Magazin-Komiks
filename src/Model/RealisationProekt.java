package Model;
import Model.Dao.UzerDaoRealisetion;



public class RealisationProekt {
    public static void main(String[] args)  {
        Aplication app =new Aplication(new UzerDaoRealisetion("uzer.bin")) {
    };
    app.run();
        }
    }
