package pokemons;
// Magmar.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Magmar extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Magmar");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Magmar() {
    this.num = 126;
    this.nom = "Magmar";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 95;
    this.def = 57;
    this.vit = 93;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Magmar (String nom) {
    this.num = 126;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 95;
    this.def = 57;
    this.vit = 93;
  }
}