package pokemons;
// Nidorino.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Nidorino extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Nidorino");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Nidorino() {
    this.num = 33;
    this.nom = "Nidorino";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 61;
    this.att = 72;
    this.def = 57;
    this.vit = 65;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Nidorino (String nom) {
    this.num = 33;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 61;
    this.att = 72;
    this.def = 57;
    this.vit = 65;
  }
}