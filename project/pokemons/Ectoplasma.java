package pokemons;
// Ectoplasma.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Ectoplasma extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
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

  // Named:
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