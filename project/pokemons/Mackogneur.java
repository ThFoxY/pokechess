package pokemons;
// Mackogneur.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Mackogneur extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Mackogneur() {
    this.num = 68;
    this.nom = "Mackogneur";
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 90;
    this.att = 130;
    this.def = 80;
    this.vit = 55;
  }

  // Named:
  public Mackogneur (String nom) {
    this.num = 68;
    this.nom = nom;
    this.type1 = Type.COMBAT;
    this.type2 = Type.SANS;
    this.pv = 90;
    this.att = 130;
    this.def = 80;
    this.vit = 55;
  }
}