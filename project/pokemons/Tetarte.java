package pokemons;
// Tetarte.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Tetarte extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Tetarte() {
    this.num = 61;
    this.nom = "Tetarte";
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 65;
    this.def = 65;
    this.vit = 90;
  }

  // Named:
  public Tetarte (String nom) {
    this.num = 61;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 65;
    this.def = 65;
    this.vit = 90;
  }
}