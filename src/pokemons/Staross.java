package pokemons;
// Staross.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Staross extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Staross");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Staross() {
    this.num = 121;
    this.nom = "Staross";
    this.type1 = Type.EAU;
    this.type2 = Type.PSY;
    this.pv = 60;
    this.att = 75;
    this.def = 85;
    this.vit = 115;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Staross (String nom) {
    this.num = 121;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.PSY;
    this.pv = 60;
    this.att = 75;
    this.def = 85;
    this.vit = 115;
  }
}