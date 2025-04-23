package pokemons;
// Stari.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Stari extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Stari");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Stari() {
    this.num = 120;
    this.nom = "Stari";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 45;
    this.def = 55;
    this.vit = 85;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Stari (String nom) {
    this.num = 120;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 45;
    this.def = 55;
    this.vit = 85;
  }
}