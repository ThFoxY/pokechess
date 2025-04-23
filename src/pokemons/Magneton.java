package pokemons;
// Magneton.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Magneton extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Magneton");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Magneton() {
    this.num = 82;
    this.nom = "Magneton";
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 60;
    this.def = 95;
    this.vit = 70;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Magneton (String nom) {
    this.num = 82;
    this.nom = nom;
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 60;
    this.def = 95;
    this.vit = 70;
  }
}