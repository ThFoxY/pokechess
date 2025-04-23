package pokemons;
// Dodrio.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Dodrio extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Dodrio");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Dodrio() {
    this.num = 85;
    this.nom = "Dodrio";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 60;
    this.att = 110;
    this.def = 70;
    this.vit = 100;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Dodrio (String nom) {
    this.num = 85;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 60;
    this.att = 110;
    this.def = 70;
    this.vit = 100;
  }
}