package Model.Dao;

import Model.Uzer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UzerDaoRealisetion implements UzerDao{
    private String filename;
    private List<Uzer>uzers;
    private static UzerDaoRealisetion instance=new UzerDaoRealisetion("uzer.bin");
    public UzerDaoRealisetion(String filename) {
       this. filename = filename;
        try (ObjectInputStream input= new ObjectInputStream(new FileInputStream(filename))) {
           uzers=(List<Uzer>) input.readObject();
        } catch (IOException | ClassNotFoundException ex){
            uzers=new ArrayList<>();
        }
    }
    @Override
    public void save() {
        try
                (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(uzers);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static UzerDaoRealisetion getInstance() {
        return instance;
    }
    @Override
    public List<Uzer> allUzer() {
        return null;
    }
    @Override
    public Uzer getById(int id) {
        return null;
    }
    @Override
    public boolean registr(Uzer uzer) {
     Optional <Uzer> ex= uzers.stream()
                .filter(u -> u.getNickName().equals(uzer.getNickName())
                )
                .findFirst();
        if (ex.isPresent()) {
            return false;
        } uzers.add(uzer);
        return true;
    }
    @Override
    public boolean avtorisation(Uzer uzer) {
        return uzers.stream()
                .anyMatch(u->u.getNickName().equals(uzer.getNickName())&&u.getPassword().equals(uzer.getPassword()));
    }
}
