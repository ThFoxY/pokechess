package pokemons;
// Feunard.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Feunard extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Feunard() {
    this.num = 38;
    this.nom = "Feunard";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 73;
    this.att = 76;
    this.def = 75;
    this.vit = 100;
  }

  // Named:
  public Feunard (String nom) {
    this.num = 38;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 73;
    this.att = 76;
    this.def = 75;
    this.vit = 100;
  }
}