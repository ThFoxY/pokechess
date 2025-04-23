package pokemons;
// Krabboss.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Krabboss extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Krabboss");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Krabboss() {
    this.num = 99;
    this.nom = "Krabboss";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 130;
    this.def = 115;
    this.vit = 75;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Krabboss (String nom) {
    this.num = 99;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 130;
    this.def = 115;
    this.vit = 75;
  }
}