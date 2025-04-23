package pokemons;
// Ectoplasma.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Ectoplasma extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Ectoplasma");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Ectoplasma() {
    this.num = 94;
    this.nom = "Ectoplasma";
    this.type1 = Type.SPECTRE;
    this.type2 = Type.POISON;
    this.pv = 60;
    this.att = 65;
    this.def = 60;
    this.vit = 110;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Ectoplasma (String nom) {
    this.num = 94;
    this.nom = nom;
    this.type1 = Type.SPECTRE;
    this.type2 = Type.POISON;
    this.pv = 60;
    this.att = 65;
    this.def = 60;
    this.vit = 110;
  }
}