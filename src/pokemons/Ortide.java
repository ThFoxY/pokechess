package pokemons;
// Ortide.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Ortide extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Ortide");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Ortide() {
    this.num = 44;
    this.nom = "Ortide";
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 60;
    this.att = 65;
    this.def = 70;
    this.vit = 40;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Ortide (String nom) {
    this.num = 44;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 60;
    this.att = 65;
    this.def = 70;
    this.vit = 40;
  }
}