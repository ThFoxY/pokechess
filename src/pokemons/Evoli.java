package pokemons;
// Evoli.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Evoli extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Evoli");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Evoli() {
    this.num = 133;
    this.nom = "Evoli";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 55;
    this.def = 50;
    this.vit = 55;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Evoli (String nom) {
    this.num = 133;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 55;
    this.def = 50;
    this.vit = 55;
  }
}