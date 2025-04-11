package pokemons;
// Caninos.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Caninos extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Caninos() {
    this.num = 58;
    this.nom = "Caninos";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 70;
    this.def = 45;
    this.vit = 60;
  }

  // Named:
  public Caninos (String nom) {
    this.num = 58;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 70;
    this.def = 45;
    this.vit = 60;
  }
}