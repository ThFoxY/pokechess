package pokemons;
// Nosferalto.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Nosferalto extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Nosferalto");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Nosferalto() {
    this.num = 42;
    this.nom = "Nosferalto";
    this.type1 = Type.POISON;
    this.type2 = Type.VOL;
    this.pv = 75;
    this.att = 80;
    this.def = 70;
    this.vit = 90;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Nosferalto (String nom) {
    this.num = 42;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.VOL;
    this.pv = 75;
    this.att = 80;
    this.def = 70;
    this.vit = 90;
  }
}