package pokemons;
// Bulbizarre.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Bulbizarre extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Bulbizarre");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Bulbizarre() {
    this.num = 1;
    this.nom = "Bulbizarre";
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 45;
    this.att = 49;
    this.def = 49;
    this.vit = 45;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Bulbizarre (String nom) {
    this.num = 1;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 45;
    this.att = 49;
    this.def = 49;
    this.vit = 45;
  }
}