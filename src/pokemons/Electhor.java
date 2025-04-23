package pokemons;
// Electhor.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Electhor extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Electhor");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Electhor() {
    this.num = 145;
    this.nom = "Electhor";
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.VOL;
    this.pv = 90;
    this.att = 90;
    this.def = 85;
    this.vit = 100;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Electhor (String nom) {
    this.num = 145;
    this.nom = nom;
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.VOL;
    this.pv = 90;
    this.att = 90;
    this.def = 85;
    this.vit = 100;
  }
}