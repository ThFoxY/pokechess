package pokemons;
// Rattatac.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Rattatac extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Rattatac");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Rattatac() {
    this.num = 20;
    this.nom = "Rattatac";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 81;
    this.def = 60;
    this.vit = 97;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Rattatac (String nom) {
    this.num = 20;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 81;
    this.def = 60;
    this.vit = 97;
  }
}