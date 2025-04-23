package pokemons;
// Galopa.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Galopa extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Galopa");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Galopa() {
    this.num = 78;
    this.nom = "Galopa";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 100;
    this.def = 70;
    this.vit = 105;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Galopa (String nom) {
    this.num = 78;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 100;
    this.def = 70;
    this.vit = 105;
  }
}