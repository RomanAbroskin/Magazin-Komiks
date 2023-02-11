package Model.Dao;
import Model.Komiks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/*public class KomiksDaoRealisation implements KomicsDao {

    private  int id;

    private final String fileName;

    private List<Komiks> komiks;

    private static KomiksDaoRealisation instabce=new KomiksDaoRealisation("komics.bin");

    public KomiksDaoRealisation(String fileName) {

        this.fileName = fileName;
        this.komiks = new ArrayList<>();
        try (ObjectInputStream ImputStream=new ObjectInputStream(new FileInputStream(fileName))){
            komiks=(List<Komiks>) ImputStream.readObject();
        }catch (IOException | ClassNotFoundException ex){
            komiks=new ArrayList<>();
        }
    }*/

   /* public void save() {
        try
                (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {
            output.writeObject(komiks);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }*/

   /* public static KomiksDaoRealisation getInstabce(){
        return instabce;
    }
    public KomicsDao getInstance(){
        return null;
    }*/

    /*@Override
    public List<Komiks> getAll() {
        return null;
    }

    @Override
    public Komiks getBaId(int id) {
        return null;
    }


}
*/