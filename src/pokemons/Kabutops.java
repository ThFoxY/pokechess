package pokemons;
// Kabutops.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Kabutops extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Kabutops");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Kabutops() {
    this.num = 141;
    this.nom = "Kabutops";
    this.type1 = Type.ROCHE;
    this.type2 = Type.EAU;
    this.pv = 60;
    this.att = 115;
    this.def = 105;
    this.vit = 80;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Kabutops (String nom) {
    this.num = 141;
    this.nom = nom;
    this.type1 = Type.ROCHE;
    this.type2 = Type.EAU;
    this.pv = 60;
    this.att = 115;
    this.def = 105;
    this.vit = 80;
  }
}