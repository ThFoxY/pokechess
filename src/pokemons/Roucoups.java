package pokemons;
// Roucoups.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Roucoups extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Roucoups");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Roucoups() {
    this.num = 17;
    this.nom = "Roucoups";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 63;
    this.att = 60;
    this.def = 55;
    this.vit = 71;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Roucoups (String nom) {
    this.num = 17;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 63;
    this.att = 60;
    this.def = 55;
    this.vit = 71;
  }
}