package pokemons;
// Mewtwo.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Mewtwo extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Mewtwo");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Mewtwo() {
    this.num = 150;
    this.nom = "Mewtwo";
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 106;
    this.att = 110;
    this.def = 90;
    this.vit = 130;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Mewtwo (String nom) {
    this.num = 150;
    this.nom = nom;
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 106;
    this.att = 110;
    this.def = 90;
    this.vit = 130;
  }
}