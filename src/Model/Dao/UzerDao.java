package Model.Dao;

import Model.Uzer;

import java.util.List;

public interface UzerDao {

    List<Uzer>allUzer();
    Uzer getById(int id);
    boolean registr(Uzer uzer);
    boolean avtorisation(Uzer uzer);
      default void save(){
          throw new UnsupportedOperationException();
      }
}
