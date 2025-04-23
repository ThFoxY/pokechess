package pokemons;
// Saquedeneu.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Saquedeneu extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Saquedeneu");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Saquedeneu() {
    this.num = 114;
    this.nom = "Saquedeneu";
    this.type1 = Type.PLANTE;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 55;
    this.def = 115;
    this.vit = 60;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Saquedeneu (String nom) {
    this.num = 114;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 55;
    this.def = 115;
    this.vit = 60;
  }
}