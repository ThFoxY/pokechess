package pokemons;
// Rafflesia.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Rafflesia extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Rafflesia");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Rafflesia() {
    this.num = 45;
    this.nom = "Rafflesia";
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 75;
    this.att = 80;
    this.def = 85;
    this.vit = 50;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Rafflesia (String nom) {
    this.num = 45;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 75;
    this.att = 80;
    this.def = 85;
    this.vit = 50;
  }
}