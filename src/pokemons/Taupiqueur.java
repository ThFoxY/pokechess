package pokemons;
// Taupiqueur.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Taupiqueur extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Taupiqueur");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Taupiqueur() {
    this.num = 50;
    this.nom = "Taupiqueur";
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 10;
    this.att = 55;
    this.def = 25;
    this.vit = 95;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Taupiqueur (String nom) {
    this.num = 50;
    this.nom = nom;
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 10;
    this.att = 55;
    this.def = 25;
    this.vit = 95;
  }
}