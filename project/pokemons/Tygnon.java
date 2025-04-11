package pokemons;
// Tygnon.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Tygnon extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Tygnon() {
    this.num = 107;
    this.nom = "Tygnon";
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 105;
    this.def = 79;
    this.vit = 76;
  }

  // Named:
  public Tygnon (String nom) {
    this.num = 107;
    this.nom = nom;
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 105;
    this.def = 79;
    this.vit = 76;
  }
}