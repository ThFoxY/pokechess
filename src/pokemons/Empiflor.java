package pokemons;
// Empiflor.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Empiflor extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Empiflor");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Empiflor() {
    this.num = 71;
    this.nom = "Empiflor";
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 80;
    this.att = 105;
    this.def = 65;
    this.vit = 70;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Empiflor (String nom) {
    this.num = 71;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 80;
    this.att = 105;
    this.def = 65;
    this.vit = 70;
  }
}