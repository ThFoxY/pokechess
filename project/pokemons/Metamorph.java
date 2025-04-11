package pokemons;
// Metamorph.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Metamorph extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Metamorph() {
    this.num = 132;
    this.nom = "Metamorph";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 48;
    this.att = 48;
    this.def = 48;
    this.vit = 48;
  }

  // Named:
  public Metamorph (String nom) {
    this.num = 132;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 48;
    this.att = 48;
    this.def = 48;
    this.vit = 48;
  }
}