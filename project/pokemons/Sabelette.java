package pokemons;
// Sabelette.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Sabelette extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Sabelette() {
    this.num = 27;
    this.nom = "Sabelette";
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 75;
    this.def = 85;
    this.vit = 40;
  }

  // Named:
  public Sabelette (String nom) {
    this.num = 27;
    this.nom = nom;
    this.type1 = Type.SOL;
    this.type2 = Type.SANS;
    this.pv = 50;
    this.att = 75;
    this.def = 85;
    this.vit = 40;
  }
}