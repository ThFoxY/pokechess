package pokemons;
// Hypnomade.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Hypnomade extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Hypnomade");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Hypnomade() {
    this.num = 97;
    this.nom = "Hypnomade";
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 85;
    this.att = 73;
    this.def = 70;
    this.vit = 67;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Hypnomade (String nom) {
    this.num = 97;
    this.nom = nom;
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 85;
    this.att = 73;
    this.def = 70;
    this.vit = 67;
  }
}