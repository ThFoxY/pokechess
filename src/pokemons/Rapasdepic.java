package pokemons;
// Rapasdepic.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Rapasdepic extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Rapasdepic");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Rapasdepic() {
    this.num = 22;
    this.nom = "Rapasdepic";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 65;
    this.att = 90;
    this.def = 65;
    this.vit = 100;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Rapasdepic (String nom) {
    this.num = 22;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 65;
    this.att = 90;
    this.def = 65;
    this.vit = 100;
  }
}