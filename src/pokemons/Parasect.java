package pokemons;
// Parasect.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Parasect extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Parasect");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Parasect() {
    this.num = 47;
    this.nom = "Parasect";
    this.type1 = Type.INSECTE;
    this.type2 = Type.PLANTE;
    this.pv = 60;
    this.att = 95;
    this.def = 80;
    this.vit = 30;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Parasect (String nom) {
    this.num = 47;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.PLANTE;
    this.pv = 60;
    this.att = 95;
    this.def = 80;
    this.vit = 30;
  }
}