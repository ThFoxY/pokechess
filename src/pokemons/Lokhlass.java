package pokemons;
// Lokhlass.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Lokhlass extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Lokhlass");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Lokhlass() {
    this.num = 131;
    this.nom = "Lokhlass";
    this.type1 = Type.EAU;
    this.type2 = Type.GLACE;
    this.pv = 130;
    this.att = 85;
    this.def = 80;
    this.vit = 60;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Lokhlass (String nom) {
    this.num = 131;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.GLACE;
    this.pv = 130;
    this.att = 85;
    this.def = 80;
    this.vit = 60;
  }
}