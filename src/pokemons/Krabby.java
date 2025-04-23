package pokemons;
// Krabby.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Krabby extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Krabby");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Krabby() {
    this.num = 98;
    this.nom = "Krabby";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 105;
    this.def = 90;
    this.vit = 50;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Krabby (String nom) {
    this.num = 98;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 105;
    this.def = 90;
    this.vit = 50;
  }
}