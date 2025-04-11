package pokemons;
// Staross.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Staross extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Staross() {
    this.num = 121;
    this.nom = "Staross";
    this.type1 = Type.EAU;
    this.type2 = Type.PSY;
    this.pv = 60;
    this.att = 75;
    this.def = 85;
    this.vit = 115;
  }

  // Named:
  public Staross (String nom) {
    this.num = 121;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.PSY;
    this.pv = 60;
    this.att = 75;
    this.def = 85;
    this.vit = 115;
  }
}