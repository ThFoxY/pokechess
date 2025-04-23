package pokemons;
// Chenipan.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Chenipan extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Chenipan");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Chenipan() {
    this.num = 10;
    this.nom = "Chenipan";
    this.type1 = Type.INSECTE;
    this.type2 = Type.SANS;
    this.pv = 45;
    this.att = 30;
    this.def = 35;
    this.vit = 45;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Chenipan (String nom) {
    this.num = 10;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.SANS;
    this.pv = 45;
    this.att = 30;
    this.def = 35;
    this.vit = 45;
  }
}