package pokemons;
// Colossinge.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Colossinge extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Colossinge");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Colossinge() {
    this.num = 57;
    this.nom = "Colossinge";
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 105;
    this.def = 60;
    this.vit = 95;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Colossinge (String nom) {
    this.num = 57;
    this.nom = nom;
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 105;
    this.def = 60;
    this.vit = 95;
  }
}