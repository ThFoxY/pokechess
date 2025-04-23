package pokemons;
// Scarabrute.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Scarabrute extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Scarabrute");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Scarabrute() {
    this.num = 127;
    this.nom = "Scarabrute";
    this.type1 = Type.INSECTE;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 125;
    this.def = 100;
    this.vit = 85;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Scarabrute (String nom) {
    this.num = 127;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 125;
    this.def = 100;
    this.vit = 85;
  }
}