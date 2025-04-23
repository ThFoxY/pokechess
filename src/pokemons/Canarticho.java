package pokemons;
// Canarticho.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Canarticho extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Canarticho");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Canarticho() {
    this.num = 83;
    this.nom = "Canarticho";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 52;
    this.att = 65;
    this.def = 55;
    this.vit = 60;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Canarticho (String nom) {
    this.num = 83;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 52;
    this.att = 65;
    this.def = 55;
    this.vit = 60;
  }
}