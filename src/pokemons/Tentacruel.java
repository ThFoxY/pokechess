package pokemons;
// Tentacruel.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Tentacruel extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Tentacruel");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Tentacruel() {
    this.num = 73;
    this.nom = "Tentacruel";
    this.type1 = Type.EAU;
    this.type2 = Type.POISON;
    this.pv = 80;
    this.att = 70;
    this.def = 65;
    this.vit = 100;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Tentacruel (String nom) {
    this.num = 73;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.POISON;
    this.pv = 80;
    this.att = 70;
    this.def = 65;
    this.vit = 100;
  }
}