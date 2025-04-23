package pokemons;
// Lippoutou.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Lippoutou extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Lippoutou");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Lippoutou() {
    this.num = 124;
    this.nom = "Lippoutou";
    this.type1 = Type.GLACE;
    this.type2 = Type.PSY;
    this.pv = 65;
    this.att = 50;
    this.def = 35;
    this.vit = 95;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Lippoutou (String nom) {
    this.num = 124;
    this.nom = nom;
    this.type1 = Type.GLACE;
    this.type2 = Type.PSY;
    this.pv = 65;
    this.att = 50;
    this.def = 35;
    this.vit = 95;
  }
}