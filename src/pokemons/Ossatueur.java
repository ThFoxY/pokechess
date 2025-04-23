package pokemons;
// Ossatueur.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Ossatueur extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Ossatueur");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Ossatueur() {
    this.num = 105;
    this.nom = "Ossatueur";
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 80;
    this.def = 110;
    this.vit = 45;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Ossatueur (String nom) {
    this.num = 105;
    this.nom = nom;
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 80;
    this.def = 110;
    this.vit = 45;
  }
}