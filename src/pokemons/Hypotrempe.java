package pokemons;
// Hypotrempe.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Hypotrempe extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Hypotrempe");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Hypotrempe() {
    this.num = 116;
    this.nom = "Hypotrempe";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 40;
    this.def = 70;
    this.vit = 60;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Hypotrempe (String nom) {
    this.num = 116;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 40;
    this.def = 70;
    this.vit = 60;
  }
}