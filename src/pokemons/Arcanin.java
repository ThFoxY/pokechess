package pokemons;
// Arcanin.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Arcanin extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Arcanin");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Arcanin() {
    this.num = 59;
    this.nom = "Arcanin";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 90;
    this.att = 110;
    this.def = 80;
    this.vit = 95;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Arcanin (String nom) {
    this.num = 59;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 90;
    this.att = 110;
    this.def = 80;
    this.vit = 95;
  }
}