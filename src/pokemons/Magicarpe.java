package pokemons;
// Magicarpe.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Magicarpe extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Magicarpe");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Magicarpe() {
    this.num = 129;
    this.nom = "Magicarpe";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 20;
    this.att = 10;
    this.def = 55;
    this.vit = 80;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Magicarpe (String nom) {
    this.num = 129;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 20;
    this.att = 10;
    this.def = 55;
    this.vit = 80;
  }
}