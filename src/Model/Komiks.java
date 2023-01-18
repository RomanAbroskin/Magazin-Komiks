package Model;

public class Komiks {
   private static int count=0;
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

   private String GhanrKomiks;
   private int GodIsdania;
   private int Sibestoimost;
   private int CenaProdagi;
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


