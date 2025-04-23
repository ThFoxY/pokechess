package pokemons;
// Grodoudou.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Grodoudou extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Grodoudou");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Grodoudou() {
    this.num = 40;
    this.nom = "Grodoudou";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 140;
    this.att = 70;
    this.def = 45;
    this.vit = 45;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Grodoudou (String nom) {
    this.num = 40;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 140;
    this.att = 70;
    this.def = 45;
    this.vit = 45;
  }
}