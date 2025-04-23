package pokemons;
// Fantominus.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Fantominus extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Fantominus");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Fantominus() {
    this.num = 92;
    this.nom = "Fantominus";
    this.type1 = Type.SPECTRE;
    this.type2 = Type.POISON;
    this.pv = 30;
    this.att = 35;
    this.def = 30;
    this.vit = 80;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Fantominus (String nom) {
    this.num = 92;
    this.nom = nom;
    this.type1 = Type.SPECTRE;
    this.type2 = Type.POISON;
    this.pv = 30;
    this.att = 35;
    this.def = 30;
    this.vit = 80;
  }
}