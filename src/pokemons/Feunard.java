package pokemons;
// Feunard.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Feunard extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Feunard");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Feunard() {
    this.num = 38;
    this.nom = "Feunard";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 73;
    this.att = 76;
    this.def = 75;
    this.vit = 100;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Feunard (String nom) {
    this.num = 38;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 73;
    this.att = 76;
    this.def = 75;
    this.vit = 100;
  }
}