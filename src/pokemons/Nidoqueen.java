package pokemons;
// Nidoqueen.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Nidoqueen extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Nidoqueen");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Nidoqueen() {
    this.num = 31;
    this.nom = "Nidoqueen";
    this.type1 = Type.POISON;
    this.type2 = Type.SOL;
    this.pv = 90;
    this.att = 82;
    this.def = 87;
    this.vit = 76;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Nidoqueen (String nom) {
    this.num = 31;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SOL;
    this.pv = 90;
    this.att = 82;
    this.def = 87;
    this.vit = 76;
  }
}