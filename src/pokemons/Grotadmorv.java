package pokemons;
// Grotadmorv.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Grotadmorv extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Grotadmorv");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Grotadmorv() {
    this.num = 89;
    this.nom = "Grotadmorv";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 105;
    this.att = 105;
    this.def = 75;
    this.vit = 50;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Grotadmorv (String nom) {
    this.num = 89;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 105;
    this.att = 105;
    this.def = 75;
    this.vit = 50;
  }
}