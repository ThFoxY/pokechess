package pokemons;
// Metamorph.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Metamorph extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Metamorph");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Metamorph() {
    this.num = 132;
    this.nom = "Metamorph";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 48;
    this.att = 48;
    this.def = 48;
    this.vit = 48;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Metamorph (String nom) {
    this.num = 132;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 48;
    this.att = 48;
    this.def = 48;
    this.vit = 48;
  }
}