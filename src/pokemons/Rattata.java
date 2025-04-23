package pokemons;
// Rattata.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Rattata extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Rattata");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Rattata() {
    this.num = 19;
    this.nom = "Rattata";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 56;
    this.def = 35;
    this.vit = 72;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Rattata (String nom) {
    this.num = 19;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 56;
    this.def = 35;
    this.vit = 72;
  }
}