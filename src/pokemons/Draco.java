package pokemons;
// Draco.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Draco extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Draco");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Draco() {
    this.num = 148;
    this.nom = "Draco";
    this.type1 = Type.DRAGON;
    this.type2 = Type.SANS;
    this.pv = 61;
    this.att = 84;
    this.def = 65;
    this.vit = 70;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Draco (String nom) {
    this.num = 148;
    this.nom = nom;
    this.type1 = Type.DRAGON;
    this.type2 = Type.SANS;
    this.pv = 61;
    this.att = 84;
    this.def = 65;
    this.vit = 70;
  }
}