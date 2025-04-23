package pokemons;
// Piafabec.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Piafabec extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Piafabec");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Piafabec() {
    this.num = 21;
    this.nom = "Piafabec";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 40;
    this.att = 60;
    this.def = 30;
    this.vit = 70;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Piafabec (String nom) {
    this.num = 21;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 40;
    this.att = 60;
    this.def = 30;
    this.vit = 70;
  }
}