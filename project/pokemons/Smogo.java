package pokemons;
// Smogo.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Smogo extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Smogo() {
    this.num = 109;
    this.nom = "Smogo";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 65;
    this.def = 95;
    this.vit = 35;
  }

  // Named:
  public Smogo (String nom) {
    this.num = 109;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 40;
    this.att = 65;
    this.def = 95;
    this.vit = 35;
  }
}