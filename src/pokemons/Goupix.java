package pokemons;
// Goupix.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Goupix extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Goupix");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Goupix() {
    this.num = 37;
    this.nom = "Goupix";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 38;
    this.att = 41;
    this.def = 40;
    this.vit = 65;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Goupix (String nom) {
    this.num = 37;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 38;
    this.att = 41;
    this.def = 40;
    this.vit = 65;
  }
}