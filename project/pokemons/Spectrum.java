package pokemons;
// Spectrum.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Spectrum extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Spectrum() {
    this.num = 93;
    this.nom = "Spectrum";
    this.type1 = Type.SPECTRE;
    this.type2 = Type.POISON;
    this.pv = 45;
    this.att = 50;
    this.def = 45;
    this.vit = 95;
  }

  // Named:
  public Spectrum (String nom) {
    this.num = 93;
    this.nom = nom;
    this.type1 = Type.SPECTRE;
    this.type2 = Type.POISON;
    this.pv = 45;
    this.att = 50;
    this.def = 45;
    this.vit = 95;
  }
}