package pokemons;
// Osselait.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Osselait extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Osselait() {
    this.num = 104;
    this.nom = "Osselait";
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 50;
    this.def = 95;
    this.vit = 35;
  }

  // Named:
  public Osselait (String nom) {
    this.num = 104;
    this.nom = nom;
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 50;
    this.def = 95;
    this.vit = 35;
  }
}