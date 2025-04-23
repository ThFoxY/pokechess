package pokemons;
// Psykokwak.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Psykokwak extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Psykokwak");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Psykokwak() {
    this.num = 54;
    this.nom = "Psykokwak";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 52;
    this.def = 48;
    this.vit = 55;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Psykokwak (String nom) {
    this.num = 54;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 52;
    this.def = 48;
    this.vit = 55;
  }
}