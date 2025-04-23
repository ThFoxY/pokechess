package pokemons;
// Akwakwak.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Akwakwak extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Akwakwak");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Akwakwak() {
    this.num = 55;
    this.nom = "Akwakwak";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 80;
    this.att = 82;
    this.def = 78;
    this.vit = 85;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Akwakwak (String nom) {
    this.num = 55;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 80;
    this.att = 82;
    this.def = 78;
    this.vit = 85;
  }
}