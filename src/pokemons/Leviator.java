package pokemons;
// Leviator.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Leviator extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Leviator");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Leviator() {
    this.num = 130;
    this.nom = "Leviator";
    this.type1 = Type.EAU;
    this.type2 = Type.VOL;
    this.pv = 95;
    this.att = 125;
    this.def = 79;
    this.vit = 81;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Leviator (String nom) {
    this.num = 130;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.VOL;
    this.pv = 95;
    this.att = 125;
    this.def = 79;
    this.vit = 81;
  }
}