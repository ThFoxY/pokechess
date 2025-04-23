package pokemons;
// Dardargnan.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Dardargnan extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Dardargnan");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Dardargnan() {
    this.num = 15;
    this.nom = "Dardargnan";
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 65;
    this.att = 80;
    this.def = 40;
    this.vit = 75;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Dardargnan (String nom) {
    this.num = 15;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 65;
    this.att = 80;
    this.def = 40;
    this.vit = 75;
  }
}