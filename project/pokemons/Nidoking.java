package pokemons;
// Nidoking.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Nidoking extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Nidoking() {
    this.num = 34;
    this.nom = "Nidoking";
    this.type1 = Type.POISON;
    this.type2 = Type.SOL;
    this.pv = 81;
    this.att = 92;
    this.def = 77;
    this.vit = 85;
  }

  // Named:
  public Nidoking (String nom) {
    this.num = 34;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SOL;
    this.pv = 81;
    this.att = 92;
    this.def = 77;
    this.vit = 85;
  }
}