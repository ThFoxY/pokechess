package pokemons;
// Kadabra.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Kadabra extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Kadabra");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Kadabra() {
    this.num = 64;
    this.nom = "Kadabra";
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 35;
    this.def = 30;
    this.vit = 105;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Kadabra (String nom) {
    this.num = 64;
    this.nom = nom;
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 35;
    this.def = 30;
    this.vit = 105;
  }
}