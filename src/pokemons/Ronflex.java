package pokemons;
// Ronflex.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Ronflex extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Ronflex");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Ronflex() {
    this.num = 143;
    this.nom = "Ronflex";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 160;
    this.att = 110;
    this.def = 65;
    this.vit = 30;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Ronflex (String nom) {
    this.num = 143;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 160;
    this.att = 110;
    this.def = 65;
    this.vit = 30;
  }
}