package pokemons;
// Tadmorv.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Tadmorv extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Tadmorv");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Tadmorv() {
    this.num = 88;
    this.nom = "Tadmorv";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 80;
    this.att = 80;
    this.def = 50;
    this.vit = 25;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Tadmorv (String nom) {
    this.num = 88;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 80;
    this.att = 80;
    this.def = 50;
    this.vit = 25;
  }
}