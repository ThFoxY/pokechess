package pokemons;
// Roucool.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Roucool extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Roucool() {
    this.num = 16;
    this.nom = "Roucool";
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 40;
    this.att = 45;
    this.def = 40;
    this.vit = 56;
  }

  // Named:
  public Roucool (String nom) {
    this.num = 16;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.VOL;
    this.pv = 40;
    this.att = 45;
    this.def = 40;
    this.vit = 56;
  }
}