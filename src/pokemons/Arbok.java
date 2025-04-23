package pokemons;
// Arbok.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Arbok extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Arbok");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Arbok() {
    this.num = 24;
    this.nom = "Arbok";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 85;
    this.def = 69;
    this.vit = 80;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Arbok (String nom) {
    this.num = 24;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 85;
    this.def = 69;
    this.vit = 80;
  }
}