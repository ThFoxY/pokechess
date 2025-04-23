package pokemons;
// Tygnon.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Tygnon extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Tygnon");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Tygnon() {
    this.num = 107;
    this.nom = "Tygnon";
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 105;
    this.def = 79;
    this.vit = 76;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Tygnon (String nom) {
    this.num = 107;
    this.nom = nom;
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 105;
    this.def = 79;
    this.vit = 76;
  }
}