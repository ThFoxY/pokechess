package pokemons;
// Persian.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Persian extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Persian() {
    this.num = 53;
    this.nom = "Persian";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 70;
    this.def = 60;
    this.vit = 115;
  }

  // Named:
  public Persian (String nom) {
    this.num = 53;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 70;
    this.def = 60;
    this.vit = 115;
  }
}