package pokemons;
// Sablaireau.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Sablaireau extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Sablaireau");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Sablaireau() {
    this.num = 28;
    this.nom = "Sablaireau";
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 75;
    this.att = 100;
    this.def = 110;
    this.vit = 65;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Sablaireau (String nom) {
    this.num = 28;
    this.nom = nom;
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 75;
    this.att = 100;
    this.def = 110;
    this.vit = 65;
  }
}