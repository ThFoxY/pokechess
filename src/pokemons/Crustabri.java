package pokemons;
// Crustabri.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Crustabri extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Crustabri");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Crustabri() {
    this.num = 91;
    this.nom = "Crustabri";
    this.type1 = Type.EAU;
    this.type2 = Type.GLACE;
    this.pv = 50;
    this.att = 95;
    this.def = 180;
    this.vit = 70;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Crustabri (String nom) {
    this.num = 91;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.GLACE;
    this.pv = 50;
    this.att = 95;
    this.def = 180;
    this.vit = 70;
  }
}