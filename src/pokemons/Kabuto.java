package pokemons;
// Kabuto.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Kabuto extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Kabuto");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Kabuto() {
    this.num = 140;
    this.nom = "Kabuto";
    this.type1 = Type.ROCHE;
    this.type2 = Type.EAU;
    this.pv = 30;
    this.att = 80;
    this.def = 90;
    this.vit = 55;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Kabuto (String nom) {
    this.num = 140;
    this.nom = nom;
    this.type1 = Type.ROCHE;
    this.type2 = Type.EAU;
    this.pv = 30;
    this.att = 80;
    this.def = 90;
    this.vit = 55;
  }
}