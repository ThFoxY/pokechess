package pokemons;
// Racaillou.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Racaillou extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Racaillou");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Racaillou() {
    this.num = 74;
    this.nom = "Racaillou";
    this.type1 = Type.ROCHE;
    this.type2 = Type.SOL;
    this.pv = 40;
    this.att = 80;
    this.def = 100;
    this.vit = 20;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Racaillou (String nom) {
    this.num = 74;
    this.nom = nom;
    this.type1 = Type.ROCHE;
    this.type2 = Type.SOL;
    this.pv = 40;
    this.att = 80;
    this.def = 100;
    this.vit = 20;
  }
}