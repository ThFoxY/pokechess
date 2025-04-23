package pokemons;
// Otaria.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Otaria extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Otaria");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Otaria() {
    this.num = 86;
    this.nom = "Otaria";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 45;
    this.def = 55;
    this.vit = 45;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Otaria (String nom) {
    this.num = 86;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 45;
    this.def = 55;
    this.vit = 45;
  }
}