package pokemons;
// Carapuce.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Carapuce extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Carapuce");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Carapuce() {
    this.num = 7;
    this.nom = "Carapuce";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 44;
    this.att = 48;
    this.def = 65;
    this.vit = 43;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Carapuce (String nom) {
    this.num = 7;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 44;
    this.att = 48;
    this.def = 65;
    this.vit = 43;
  }
}