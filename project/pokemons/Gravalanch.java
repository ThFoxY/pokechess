package pokemons;
// Gravalanch.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Gravalanch extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Gravalanch() {
    this.num = 75;
    this.nom = "Gravalanch";
    this.type1 = Type.ROCHE;
    this.type2 = Type.SOL;
    this.pv = 55;
    this.att = 95;
    this.def = 115;
    this.vit = 35;
  }

  // Named:
  public Gravalanch (String nom) {
    this.num = 75;
    this.nom = nom;
    this.type1 = Type.ROCHE;
    this.type2 = Type.SOL;
    this.pv = 55;
    this.att = 95;
    this.def = 115;
    this.vit = 35;
  }
}