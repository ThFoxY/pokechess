package pokemons;
// Dracolosse.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Dracolosse extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Dracolosse() {
    this.num = 149;
    this.nom = "Dracolosse";
    this.type1 = Type.DRAGON;
    this.type2 = Type.VOL;
    this.pv = 91;
    this.att = 134;
    this.def = 95;
    this.vit = 80;
  }

  // Named:
  public Dracolosse (String nom) {
    this.num = 149;
    this.nom = nom;
    this.type1 = Type.DRAGON;
    this.type2 = Type.VOL;
    this.pv = 91;
    this.att = 134;
    this.def = 95;
    this.vit = 80;
  }
}