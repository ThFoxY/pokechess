package pokemons;
// Mew.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Mew extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Mew");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Mew() {
    this.num = 151;
    this.nom = "Mew";
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 100;
    this.att = 100;
    this.def = 100;
    this.vit = 100;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Mew (String nom) {
    this.num = 151;
    this.nom = nom;
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 100;
    this.att = 100;
    this.def = 100;
    this.vit = 100;
  }
}