package pokemons;
// Grolem.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Grolem extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Grolem");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Grolem() {
    this.num = 76;
    this.nom = "Grolem";
    this.type1 = Type.ROCHE;
    this.type2 = Type.SOL;
    this.pv = 80;
    this.att = 110;
    this.def = 130;
    this.vit = 45;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Grolem (String nom) {
    this.num = 76;
    this.nom = nom;
    this.type1 = Type.ROCHE;
    this.type2 = Type.SOL;
    this.pv = 80;
    this.att = 110;
    this.def = 130;
    this.vit = 45;
  }
}