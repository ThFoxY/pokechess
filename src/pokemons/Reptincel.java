package pokemons;
// Reptincel.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Reptincel extends Pokemon {
  // Méthode abstraite :
  public String getEspece() {
    return new String("Reptincel");
  }

// Constructeurs :
  /**
   * Par défaut.
   */
  public Reptincel() {
    this.num = 5;
    this.nom = "Reptincel";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 58;
    this.att = 64;
    this.def = 58;
    this.vit = 80;
  }

  /**
   * Selon un nom.
   * @param nom une chaîne de caractères.
   */
  public Reptincel (String nom) {
    this.num = 5;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 58;
    this.att = 64;
    this.def = 58;
    this.vit = 80;
  }
}