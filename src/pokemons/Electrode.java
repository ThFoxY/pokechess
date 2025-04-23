package pokemons;
// Electrode.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Electrode extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Electrode");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Electrode() {
    this.num = 101;
    this.nom = "Electrode";
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 50;
    this.def = 70;
    this.vit = 140;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Electrode (String nom) {
    this.num = 101;
    this.nom = nom;
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 50;
    this.def = 70;
    this.vit = 140;
  }
}