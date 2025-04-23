package pokemons;
// Ponyta.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Ponyta extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Ponyta");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Ponyta() {
    this.num = 77;
    this.nom = "Ponyta";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 85;
    this.def = 55;
    this.vit = 90;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Ponyta (String nom) {
    this.num = 77;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 85;
    this.def = 55;
    this.vit = 90;
  }
}