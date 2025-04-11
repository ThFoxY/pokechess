package pokemons;
// Arbok.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Arbok extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Arbok() {
    this.num = 24;
    this.nom = "Arbok";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 85;
    this.def = 69;
    this.vit = 80;
  }

  // Named:
  public Arbok (String nom) {
    this.num = 24;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 60;
    this.att = 85;
    this.def = 69;
    this.vit = 80;
  }
}