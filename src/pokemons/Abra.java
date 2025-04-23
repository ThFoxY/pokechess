package pokemons;
// Abra.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Abra extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Abra");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Abra() {
    this.num = 63;
    this.nom = "Abra";
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 25;
    this.att = 20;
    this.def = 15;
    this.vit = 90;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Abra (String nom) {
    this.num = 63;
    this.nom = nom;
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 25;
    this.att = 20;
    this.def = 15;
    this.vit = 90;
  }
}