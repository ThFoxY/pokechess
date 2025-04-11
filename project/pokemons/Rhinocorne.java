package pokemons;
// Rhinocorne.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Rhinocorne extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Rhinocorne() {
    this.num = 111;
    this.nom = "Rhinocorne";
    this.type1 = Type.SOL;
    this.type2 = Type.ROCHE;
    this.pv = 80;
    this.att = 85;
    this.def = 95;
    this.vit = 25;
  }

  // Named:
  public Rhinocorne (String nom) {
    this.num = 111;
    this.nom = nom;
    this.type1 = Type.SOL;
    this.type2 = Type.ROCHE;
    this.pv = 80;
    this.att = 85;
    this.def = 95;
    this.vit = 25;
  }
}