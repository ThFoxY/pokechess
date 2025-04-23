package pokemons;
// Kicklee.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Kicklee extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Kicklee");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Kicklee() {
    this.num = 106;
    this.nom = "Kicklee";
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 120;
    this.def = 53;
    this.vit = 87;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Kicklee (String nom) {
    this.num = 106;
    this.nom = nom;
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 120;
    this.def = 53;
    this.vit = 87;
  }
}