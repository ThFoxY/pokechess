package pokemons;
// Lippoutou.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Lippoutou extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Lippoutou() {
    this.num = 124;
    this.nom = "Lippoutou";
    this.type1 = Type.GLACE;
    this.type2 = Type.PSY;
    this.pv = 65;
    this.att = 50;
    this.def = 35;
    this.vit = 95;
  }

  // Named:
  public Lippoutou (String nom) {
    this.num = 124;
    this.nom = nom;
    this.type1 = Type.GLACE;
    this.type2 = Type.PSY;
    this.pv = 65;
    this.att = 50;
    this.def = 35;
    this.vit = 95;
  }
}