package pokemons;
// Ramoloss.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Ramoloss extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Ramoloss");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Ramoloss() {
    this.num = 79;
    this.nom = "Ramoloss";
    this.type1 = Type.EAU;
    this.type2 = Type.PSY;
    this.pv = 90;
    this.att = 65;
    this.def = 65;
    this.vit = 15;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Ramoloss (String nom) {
    this.num = 79;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.PSY;
    this.pv = 90;
    this.att = 65;
    this.def = 65;
    this.vit = 15;
  }
}