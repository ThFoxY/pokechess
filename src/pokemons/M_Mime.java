package pokemons;
// M_Mime.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class M_Mime extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("M_Mime");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public M_Mime() {
    this.num = 122;
    this.nom = "M_Mime";
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 45;
    this.def = 65;
    this.vit = 90;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public M_Mime (String nom) {
    this.num = 122;
    this.nom = nom;
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 45;
    this.def = 65;
    this.vit = 90;
  }
}