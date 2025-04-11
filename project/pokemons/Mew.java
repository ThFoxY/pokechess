package pokemons;
// Mew.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Mew extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Mew() {
    this.num = 151;
    this.nom = "Mew";
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 100;
    this.att = 100;
    this.def = 100;
    this.vit = 100;
  }

  // Named:
  public Mew (String nom) {
    this.num = 151;
    this.nom = nom;
    this.type1 = Type.PSY;
    this.type2 = Type.SANS;
    this.pv = 100;
    this.att = 100;
    this.def = 100;
    this.vit = 100;
  }
}