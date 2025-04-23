package pokemons;
// Magneti.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Magneti extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Magneti");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Magneti() {
    this.num = 81;
    this.nom = "Magneti";
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 25;
    this.att = 35;
    this.def = 70;
    this.vit = 45;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Magneti (String nom) {
    this.num = 81;
    this.nom = nom;
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 25;
    this.att = 35;
    this.def = 70;
    this.vit = 45;
  }
}