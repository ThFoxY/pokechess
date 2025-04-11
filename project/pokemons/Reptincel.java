package pokemons;
// Reptincel.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Reptincel extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Reptincel() {
    this.num = 5;
    this.nom = "Reptincel";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 58;
    this.att = 64;
    this.def = 58;
    this.vit = 80;
  }

  // Named:
  public Reptincel (String nom) {
    this.num = 5;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 58;
    this.att = 64;
    this.def = 58;
    this.vit = 80;
  }
}