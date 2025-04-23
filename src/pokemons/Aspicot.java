package pokemons;
// Aspicot.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Aspicot extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Aspicot");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Aspicot() {
    this.num = 13;
    this.nom = "Aspicot";
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 40;
    this.att = 35;
    this.def = 30;
    this.vit = 50;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Aspicot (String nom) {
    this.num = 13;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.POISON;
    this.pv = 40;
    this.att = 35;
    this.def = 30;
    this.vit = 50;
  }
}