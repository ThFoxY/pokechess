package pokemons;
// Roucarnage.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Roucarnage extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Roucarnage");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Roucarnage() {
    this.num = 18;
    this.nom = "Roucarnage";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 83;
    this.att = 80;
    this.def = 75;
    this.vit = 91;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Roucarnage (String nom) {
    this.num = 18;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 83;
    this.att = 80;
    this.def = 75;
    this.vit = 91;
  }
}