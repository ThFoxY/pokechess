package pokemons;
// Triopikeur.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Triopikeur extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Triopikeur");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Triopikeur() {
    this.num = 51;
    this.nom = "Triopikeur";
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 35;
    this.att = 80;
    this.def = 50;
    this.vit = 120;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Triopikeur (String nom) {
    this.num = 51;
    this.nom = nom;
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 35;
    this.att = 80;
    this.def = 50;
    this.vit = 120;
  }
}