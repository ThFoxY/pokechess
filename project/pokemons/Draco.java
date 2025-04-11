package pokemons;
// Draco.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Draco extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Draco() {
    this.num = 148;
    this.nom = "Draco";
    this.type1 = Type.DRAGON;
    this.type2 = Type.SANS;
    this.pv = 61;
    this.att = 84;
    this.def = 65;
    this.vit = 70;
  }

  // Named:
  public Draco (String nom) {
    this.num = 148;
    this.nom = nom;
    this.type1 = Type.DRAGON;
    this.type2 = Type.SANS;
    this.pv = 61;
    this.att = 84;
    this.def = 65;
    this.vit = 70;
  }
}