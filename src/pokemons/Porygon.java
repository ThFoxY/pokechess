package pokemons;
// Porygon.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Porygon extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Porygon");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Porygon() {
    this.num = 137;
    this.nom = "Porygon";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 60;
    this.def = 70;
    this.vit = 40;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Porygon (String nom) {
    this.num = 137;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 60;
    this.def = 70;
    this.vit = 40;
  }
}