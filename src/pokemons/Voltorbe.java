package pokemons;
// Voltorbe.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Voltorbe extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Voltorbe");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Voltorbe() {
    this.num = 100;
    this.nom = "Voltorbe";
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 30;
    this.def = 50;
    this.vit = 100;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Voltorbe (String nom) {
    this.num = 100;
    this.nom = nom;
    this.type1 = Type.ELECTRIK;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 30;
    this.def = 50;
    this.vit = 100;
  }
}