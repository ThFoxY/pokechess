package pokemons;
// Onix.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Onix extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Onix");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Onix() {
    this.num = 95;
    this.nom = "Onix";
    this.type1 = Type.ROCHE;
    this.type2 = Type.SOL;
    this.pv = 35;
    this.att = 45;
    this.def = 160;
    this.vit = 70;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Onix (String nom) {
    this.num = 95;
    this.nom = nom;
    this.type1 = Type.ROCHE;
    this.type2 = Type.SOL;
    this.pv = 35;
    this.att = 45;
    this.def = 160;
    this.vit = 70;
  }
}