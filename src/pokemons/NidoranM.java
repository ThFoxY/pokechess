package pokemons;
// NidoranM.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class NidoranM extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("NidoranM");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public NidoranM() {
    this.num = 32;
    this.nom = "NidoranM";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 46;
    this.att = 57;
    this.def = 40;
    this.vit = 50;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public NidoranM (String nom) {
    this.num = 32;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 46;
    this.att = 57;
    this.def = 40;
    this.vit = 50;
  }
}