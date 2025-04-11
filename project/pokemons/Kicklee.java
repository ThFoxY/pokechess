package pokemons;
// Kicklee.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Kicklee extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Kicklee() {
    this.num = 106;
    this.nom = "Kicklee";
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 120;
    this.def = 53;
    this.vit = 87;
  }

  // Named:
  public Kicklee (String nom) {
    this.num = 106;
    this.nom = nom;
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 120;
    this.def = 53;
    this.vit = 87;
  }
}