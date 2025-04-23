package pokemons;
// Miaouss.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Miaouss extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Miaouss");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Miaouss() {
    this.num = 52;
    this.nom = "Miaouss";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 45;
    this.def = 35;
    this.vit = 90;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Miaouss (String nom) {
    this.num = 52;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 45;
    this.def = 35;
    this.vit = 90;
  }
}