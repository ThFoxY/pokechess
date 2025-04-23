package pokemons;
// Melofee.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Melofee extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Melofee");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Melofee() {
    this.num = 35;
    this.nom = "Melofee";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 70;
    this.att = 45;
    this.def = 48;
    this.vit = 35;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Melofee (String nom) {
    this.num = 35;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 70;
    this.att = 45;
    this.def = 48;
    this.vit = 35;
  }
}