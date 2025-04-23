package pokemons;
// Noeunoeuf.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Noeunoeuf extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Noeunoeuf");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Noeunoeuf() {
    this.num = 102;
    this.nom = "Noeunoeuf";
    this.type1 = Type.PLANTE;
    this.type2 = Type.PSY;
    this.pv = 60;
    this.att = 40;
    this.def = 80;
    this.vit = 40;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Noeunoeuf (String nom) {
    this.num = 102;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.PSY;
    this.pv = 60;
    this.att = 40;
    this.def = 80;
    this.vit = 40;
  }
}