package pokemons;
// Kangourex.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Kangourex extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Kangourex");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Kangourex() {
    this.num = 115;
    this.nom = "Kangourex";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 105;
    this.att = 95;
    this.def = 80;
    this.vit = 90;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Kangourex (String nom) {
    this.num = 115;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 105;
    this.att = 95;
    this.def = 80;
    this.vit = 90;
  }
}