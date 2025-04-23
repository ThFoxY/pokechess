package pokemons;
// Mimitoss.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Mimitoss extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Mimitoss");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Mimitoss() {
    this.num = 48;
    this.nom = "Mimitoss";
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 60;
    this.att = 55;
    this.def = 50;
    this.vit = 45;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Mimitoss (String nom) {
    this.num = 48;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 60;
    this.att = 55;
    this.def = 50;
    this.vit = 45;
  }
}