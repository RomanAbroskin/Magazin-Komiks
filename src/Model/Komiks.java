package Model;

import java.io.Serializable;

public class Komiks implements Serializable {
   private transient static int count=0;
   private int id;

   public static int getCount() {
      return count;
   }

   public int getId() {
      return id;
   }

   private String NameKomics;
   private String FioAvtors;
   private String NameIsdatel;
   private int KolichestvoStronic;

   public Komiks(String nameKomics, String fioAvtors, String nameIsdatel, int kolichestvoStronic, String ghanrKomiks, int godIsdania, int sibestoimost, int cenaProdagi, boolean prodolgenieKomiks) {
      this.id =++count;
      NameKomics = nameKomics;
      FioAvtors = fioAvtors;
      NameIsdatel = nameIsdatel;
      KolichestvoStronic = kolichestvoStronic;
      GhanrKomiks = ghanrKomiks;
      GodIsdania = godIsdania;
      Sibestoimost = sibestoimost;
      CenaProdagi = cenaProdagi;
      ProdolgenieKomiks = prodolgenieKomiks;
   }

   public Komiks(String nameKomics) {
      NameKomics = nameKomics;
   }

   private String GhanrKomiks;
   private int GodIsdania;
   private int Sibestoimost;
   private int CenaProdagi;

   public void setNameKomics(String nameKomics) {
      NameKomics = nameKomics;
   }

   public void setFioAvtors(String fioAvtors) {
      FioAvtors = fioAvtors;
   }

   public void setNameIsdatel(String nameIsdatel) {
      NameIsdatel = nameIsdatel;
   }

   public void setKolichestvoStronic(int kolichestvoStronic) {
      KolichestvoStronic = kolichestvoStronic;
   }

   public void setGhanrKomiks(String ghanrKomiks) {
      GhanrKomiks = ghanrKomiks;
   }

   @Override
   public String toString() {
      return "Komiks{" +
              "id=" + id +
              ", NameKomics='" + NameKomics + '\'' +
              ", FioAvtors='" + FioAvtors + '\'' +
              ", NameIsdatel='" + NameIsdatel + '\'' +
              ", KolichestvoStronic=" + KolichestvoStronic +
              ", GhanrKomiks='" + GhanrKomiks + '\'' +
              ", GodIsdania=" + GodIsdania +
              ", Sibestoimost=" + Sibestoimost +
              ", CenaProdagi=" + CenaProdagi +
              ", ProdolgenieKomiks=" + ProdolgenieKomiks +
              '}';
   }

   public void setGodIsdania(int godIsdania) {
      GodIsdania = godIsdania;
   }

   public void setSibestoimost(int sibestoimost) {
      Sibestoimost = sibestoimost;
   }

   public void setCenaProdagi(int cenaProdagi) {
      CenaProdagi = cenaProdagi;
   }

   public void setProdolgenieKomiks(boolean prodolgenieKomiks) {
      ProdolgenieKomiks = prodolgenieKomiks;
   }

   private boolean ProdolgenieKomiks;

   public String getNameKomics() {
      return NameKomics;
   }

   public String getFioAvtors() {
      return FioAvtors;
   }

   public String getNameIsdatel() {
      return NameIsdatel;
   }

   public int getKolichestvoStronic() {
      return KolichestvoStronic;
   }

   public String getGhanrKomiks() {
      return GhanrKomiks;
   }

   public int getGodIsdania() {
      return GodIsdania;
   }

   public int getSibestoimost() {
      return Sibestoimost;
   }

   public int getCenaProdagi() {
      return CenaProdagi;
   }

   public boolean isProdolgenieKomiks() {
      return ProdolgenieKomiks;
   }


}


