package pokemons;
// Rhinoferos.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Rhinoferos extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Rhinoferos");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Rhinoferos() {
    this.num = 112;
    this.nom = "Rhinoferos";
    this.type1 = Type.SOL;
    this.type2 = Type.ROCHE;
    this.pv = 105;
    this.att = 130;
    this.def = 120;
    this.vit = 40;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Rhinoferos (String nom) {
    this.num = 112;
    this.nom = nom;
    this.type1 = Type.SOL;
    this.type2 = Type.ROCHE;
    this.pv = 105;
    this.att = 130;
    this.def = 120;
    this.vit = 40;
  }
}