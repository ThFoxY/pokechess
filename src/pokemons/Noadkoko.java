package pokemons;
// Noadkoko.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Noadkoko extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Noadkoko");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Noadkoko() {
    this.num = 103;
    this.nom = "Noadkoko";
    this.type1 = Type.PLANTE;
    this.type2 = Type.PSY;
    this.pv = 95;
    this.att = 95;
    this.def = 85;
    this.vit = 55;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Noadkoko (String nom) {
    this.num = 103;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.PSY;
    this.pv = 95;
    this.att = 95;
    this.def = 85;
    this.vit = 55;
  }
}