package pokemons;
// Roucool.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Roucool extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Roucool");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Roucool() {
    this.num = 16;
    this.nom = "Roucool";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 40;
    this.att = 45;
    this.def = 40;
    this.vit = 56;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Roucool (String nom) {
    this.num = 16;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 40;
    this.att = 45;
    this.def = 40;
    this.vit = 56;
  }
}