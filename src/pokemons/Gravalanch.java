package pokemons;
// Gravalanch.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Gravalanch extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Gravalanch");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Gravalanch() {
    this.num = 75;
    this.nom = "Gravalanch";
    this.type1 = Type.ROCHE;
    this.type2 = Type.SOL;
    this.pv = 55;
    this.att = 95;
    this.def = 115;
    this.vit = 35;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Gravalanch (String nom) {
    this.num = 75;
    this.nom = nom;
    this.type1 = Type.ROCHE;
    this.type2 = Type.SOL;
    this.pv = 55;
    this.att = 95;
    this.def = 115;
    this.vit = 35;
  }
}