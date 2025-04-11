package pokemons;
// Tentacool.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Tentacool extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Tentacool() {
    this.num = 72;
    this.nom = "Tentacool";
    this.type1 = Type.EAU;
    this.type2 = Type.POISON;
    this.pv = 40;
    this.att = 40;
    this.def = 35;
    this.vit = 70;
  }

  // Named:
  public Tentacool (String nom) {
    this.num = 72;
    this.nom = nom;
    this.type1 = Type.EAU;
    this.type2 = Type.POISON;
    this.pv = 40;
    this.att = 40;
    this.def = 35;
    this.vit = 70;
  }
}