package pokemons;
// Salameche.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Salameche extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Salameche");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Salameche() {
    this.num = 4;
    this.nom = "Salameche";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 39;
    this.att = 52;
    this.def = 43;
    this.vit = 65;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Salameche (String nom) {
    this.num = 4;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 39;
    this.att = 52;
    this.def = 43;
    this.vit = 65;
  }
}