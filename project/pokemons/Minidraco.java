package pokemons;
// Minidraco.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Minidraco extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Minidraco() {
    this.num = 147;
    this.nom = "Minidraco";
    this.type1 = Type.DRAGON;
    this.type2 = Type.SANS;
    this.pv = 41;
    this.att = 64;
    this.def = 45;
    this.vit = 50;
  }

  // Named:
  public Minidraco (String nom) {
    this.num = 147;
    this.nom = nom;
    this.type1 = Type.DRAGON;
    this.type2 = Type.SANS;
    this.pv = 41;
    this.att = 64;
    this.def = 45;
    this.vit = 50;
  }
}