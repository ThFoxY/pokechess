package pokemons;
// Ptera.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Ptera extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Ptera");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Ptera() {
    this.num = 142;
    this.nom = "Ptera";
    this.type1 = Type.ROCHE;
    this.type2 = Type.VOL;
    this.pv = 80;
    this.att = 105;
    this.def = 65;
    this.vit = 130;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Ptera (String nom) {
    this.num = 142;
    this.nom = nom;
    this.type1 = Type.ROCHE;
    this.type2 = Type.VOL;
    this.pv = 80;
    this.att = 105;
    this.def = 65;
    this.vit = 130;
  }
}