package pokemons;
// Soporifik.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Soporifik extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Soporifik");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Soporifik() {
    this.num = 96;
    this.nom = "Soporifik";
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 48;
    this.def = 45;
    this.vit = 42;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Soporifik (String nom) {
    this.num = 96;
    this.nom = nom;
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 48;
    this.def = 45;
    this.vit = 42;
  }
}