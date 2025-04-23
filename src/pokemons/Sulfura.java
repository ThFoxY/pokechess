package pokemons;
// Sulfura.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Sulfura extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Sulfura");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Sulfura() {
    this.num = 146;
    this.nom = "Sulfura";
    this.type1 = Type.FEU;
    this.type2 = Type.VOL;
    this.pv = 90;
    this.att = 100;
    this.def = 90;
    this.vit = 90;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Sulfura (String nom) {
    this.num = 146;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.VOL;
    this.pv = 90;
    this.att = 100;
    this.def = 90;
    this.vit = 90;
  }
}