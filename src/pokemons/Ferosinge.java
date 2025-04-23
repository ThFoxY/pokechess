package pokemons;
// Ferosinge.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Ferosinge extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Ferosinge");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Ferosinge() {
    this.num = 56;
    this.nom = "Ferosinge";
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 80;
    this.def = 35;
    this.vit = 70;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Ferosinge (String nom) {
    this.num = 56;
    this.nom = nom;
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 80;
    this.def = 35;
    this.vit = 70;
  }
}