package pokemons;
// Carabaffe.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Carabaffe extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Carabaffe");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Carabaffe() {
    this.num = 8;
    this.nom = "Carabaffe";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 59;
    this.att = 63;
    this.def = 80;
    this.vit = 58;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Carabaffe (String nom) {
    this.num = 8;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 59;
    this.att = 63;
    this.def = 80;
    this.vit = 58;
  }
}