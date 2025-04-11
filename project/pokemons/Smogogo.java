package pokemons;
// Smogogo.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Smogogo extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Smogogo() {
    this.num = 110;
    this.nom = "Smogogo";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 90;
    this.def = 120;
    this.vit = 60;
  }

  // Named:
  public Smogogo (String nom) {
    this.num = 110;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 90;
    this.def = 120;
    this.vit = 60;
  }
}