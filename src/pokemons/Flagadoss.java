package pokemons;
// Flagadoss.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Flagadoss extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Flagadoss");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Flagadoss() {
    this.num = 80;
    this.nom = "Flagadoss";
    this.type1 = Type.EAU;
    this.type2 = Type.PSY;
    this.pv = 95;
    this.att = 75;
    this.def = 110;
    this.vit = 30;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Flagadoss (String nom) {
    this.num = 80;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.PSY;
    this.pv = 95;
    this.att = 75;
    this.def = 110;
    this.vit = 30;
  }
}