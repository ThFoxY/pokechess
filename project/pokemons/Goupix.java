package pokemons;
// Goupix.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Goupix extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Goupix() {
    this.num = 37;
    this.nom = "Goupix";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 38;
    this.att = 41;
    this.def = 40;
    this.vit = 65;
  }

  // Named:
  public Goupix (String nom) {
    this.num = 37;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 38;
    this.att = 41;
    this.def = 40;
    this.vit = 65;
  }
}