package pokemons;
// Kangourex.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Kangourex extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Kangourex() {
    this.num = 115;
    this.nom = "Kangourex";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 105;
    this.att = 95;
    this.def = 80;
    this.vit = 90;
  }

  // Named:
  public Kangourex (String nom) {
    this.num = 115;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 105;
    this.att = 95;
    this.def = 80;
    this.vit = 90;
  }
}