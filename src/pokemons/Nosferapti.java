package pokemons;
// Nosferapti.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Nosferapti extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Nosferapti");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Nosferapti() {
    this.num = 41;
    this.nom = "Nosferapti";
    this.type1 = Type.POISON;
    this.type2 = Type.VOL;
    this.pv = 40;
    this.att = 45;
    this.def = 35;
    this.vit = 55;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Nosferapti (String nom) {
    this.num = 41;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.VOL;
    this.pv = 40;
    this.att = 45;
    this.def = 35;
    this.vit = 55;
  }
}