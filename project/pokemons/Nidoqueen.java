package pokemons;
// Nidoqueen.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Nidoqueen extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Nidoqueen() {
    this.num = 31;
    this.nom = "Nidoqueen";
    this.type1 = Type.POISON;
    this.type2 = Type.SOL;
    this.pv = 90;
    this.att = 82;
    this.def = 87;
    this.vit = 76;
  }

  // Named:
  public Nidoqueen (String nom) {
    this.num = 31;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SOL;
    this.pv = 90;
    this.att = 82;
    this.def = 87;
    this.vit = 76;
  }
}