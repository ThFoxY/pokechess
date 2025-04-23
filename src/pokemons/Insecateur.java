package pokemons;
// Insecateur.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Insecateur extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Insecateur");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Insecateur() {
    this.num = 123;
    this.nom = "Insecateur";
    this.type1 = Type.INSECTE;
    this.type2 = Type.VOL;
    this.pv = 70;
    this.att = 110;
    this.def = 80;
    this.vit = 105;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Insecateur (String nom) {
    this.num = 123;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.VOL;
    this.pv = 70;
    this.att = 110;
    this.def = 80;
    this.vit = 105;
  }
}