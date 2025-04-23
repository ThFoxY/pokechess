package pokemons;
// Leveinard.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Leveinard extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Leveinard");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Leveinard() {
    this.num = 113;
    this.nom = "Leveinard";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 250;
    this.att = 5;
    this.def = 5;
    this.vit = 50;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Leveinard (String nom) {
    this.num = 113;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 250;
    this.att = 5;
    this.def = 5;
    this.vit = 50;
  }
}