package pokemons;
// Dracolosse.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Dracolosse extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Dracolosse");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Dracolosse() {
    this.num = 149;
    this.nom = "Dracolosse";
    this.type1 = Type.DRAGON;
    this.type2 = Type.VOL;
    this.pv = 91;
    this.att = 134;
    this.def = 95;
    this.vit = 80;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Dracolosse (String nom) {
    this.num = 149;
    this.nom = nom;
    this.type1 = Type.DRAGON;
    this.type2 = Type.VOL;
    this.pv = 91;
    this.att = 134;
    this.def = 95;
    this.vit = 80;
  }
}