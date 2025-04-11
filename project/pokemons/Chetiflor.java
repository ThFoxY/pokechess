package pokemons;
// Chetiflor.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Chetiflor extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Chetiflor() {
    this.num = 69;
    this.nom = "Chetiflor";
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 50;
    this.att = 75;
    this.def = 35;
    this.vit = 40;
  }

  // Named:
  public Chetiflor (String nom) {
    this.num = 69;
    this.nom = nom;
    this.type1 = Type.PLANTE;
    this.type2 = Type.POISON;
    this.pv = 50;
    this.att = 75;
    this.def = 35;
    this.vit = 40;
  }
}