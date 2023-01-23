package Model.Dao;

import Model.Komiks;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KomiksDaoRealisation implements KomicsDao {


    private final String fileName;

    private List<Komiks> komiks;

    private static KomiksDaoRealisation instabce=new KomiksDaoRealisation("komics.bin");

    public KomiksDaoRealisation(String fileName) {
        this.fileName = fileName;
        this.komiks = new ArrayList<>();
        try (ObjectInputStream ImputStream=new ObjectInputStream(new FileInputStream(fileName))){
           komiks=List<k>
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static KomiksDaoRealisation getInstabce(){
        return instabce;
    }
    public KomicsDao getInstance(){
        return null;
    }

    @Override
    public List<Komiks> getAll() {
        return null;
    }


}
