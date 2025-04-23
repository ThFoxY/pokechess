package pokemons;
// Coconfort.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Coconfort extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Coconfort");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Coconfort() {
    this.num = 14;
    this.nom = "Coconfort";
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 45;
    this.att = 25;
    this.def = 50;
    this.vit = 35;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Coconfort (String nom) {
    this.num = 14;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 45;
    this.att = 25;
    this.def = 50;
    this.vit = 35;
  }
}