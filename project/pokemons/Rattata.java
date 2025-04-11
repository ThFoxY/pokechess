package pokemons;
// Rattata.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Rattata extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Rattata() {
    this.num = 19;
    this.nom = "Rattata";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 56;
    this.def = 35;
    this.vit = 72;
  }

  // Named:
  public Rattata (String nom) {
    this.num = 19;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 30;
    this.att = 56;
    this.def = 35;
    this.vit = 72;
  }
}