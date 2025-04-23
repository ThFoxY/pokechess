package pokemons;
// Sabelette.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Sabelette extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Sabelette");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Sabelette() {
    this.num = 27;
    this.nom = "Sabelette";
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 75;
    this.def = 85;
    this.vit = 40;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Sabelette (String nom) {
    this.num = 27;
    this.nom = nom;
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 75;
    this.def = 85;
    this.vit = 40;
  }
}