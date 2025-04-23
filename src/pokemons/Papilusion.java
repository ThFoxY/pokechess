package pokemons;
// Papilusion.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Papilusion extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Papilusion");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Papilusion() {
    this.num = 12;
    this.nom = "Papilusion";
    this.type1 = Type.INSECTE;
    this.type2 = Type.VOL;
    this.pv = 60;
    this.att = 45;
    this.def = 50;
    this.vit = 70;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Papilusion (String nom) {
    this.num = 12;
    this.nom = nom;
    this.type1 = Type.INSECTE;
    this.type2 = Type.VOL;
    this.pv = 60;
    this.att = 45;
    this.def = 50;
    this.vit = 70;
  }
}