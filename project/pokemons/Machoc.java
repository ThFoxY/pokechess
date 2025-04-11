package pokemons;
// Machoc.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Machoc extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Machoc() {
    this.num = 66;
    this.nom = "Machoc";
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 70;
    this.att = 80;
    this.def = 50;
    this.vit = 35;
  }

  // Named:
  public Machoc (String nom) {
    this.num = 66;
    this.nom = nom;
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 70;
    this.att = 80;
    this.def = 50;
    this.vit = 35;
  }
}