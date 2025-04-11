package pokemons;
// Tadmorv.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Tadmorv extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Tadmorv() {
    this.num = 88;
    this.nom = "Tadmorv";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 80;
    this.att = 80;
    this.def = 50;
    this.vit = 25;
  }

  // Named:
  public Tadmorv (String nom) {
    this.num = 88;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 80;
    this.att = 80;
    this.def = 50;
    this.vit = 25;
  }
}