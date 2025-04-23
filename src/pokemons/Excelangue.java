package pokemons;
// Excelangue.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Excelangue extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Excelangue");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Excelangue() {
    this.num = 108;
    this.nom = "Excelangue";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 90;
    this.att = 55;
    this.def = 75;
    this.vit = 30;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Excelangue (String nom) {
    this.num = 108;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 90;
    this.att = 55;
    this.def = 75;
    this.vit = 30;
  }
}