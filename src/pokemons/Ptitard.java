package pokemons;
// Ptitard.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Ptitard extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Ptitard");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Ptitard() {
    this.num = 60;
    this.nom = "Ptitard";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 50;
    this.def = 40;
    this.vit = 90;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Ptitard (String nom) {
    this.num = 60;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 50;
    this.def = 40;
    this.vit = 90;
  }
}