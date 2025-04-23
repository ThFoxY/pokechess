package pokemons;
// Doduo.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Doduo extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Doduo");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Doduo() {
    this.num = 84;
    this.nom = "Doduo";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 35;
    this.att = 85;
    this.def = 45;
    this.vit = 75;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Doduo (String nom) {
    this.num = 84;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 35;
    this.att = 85;
    this.def = 45;
    this.vit = 75;
  }
}