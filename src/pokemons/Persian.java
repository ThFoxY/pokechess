package pokemons;
// Persian.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Persian extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Persian");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Persian() {
    this.num = 53;
    this.nom = "Persian";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 70;
    this.def = 60;
    this.vit = 115;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Persian (String nom) {
    this.num = 53;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 70;
    this.def = 60;
    this.vit = 115;
  }
}