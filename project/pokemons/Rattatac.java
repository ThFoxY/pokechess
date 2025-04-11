package pokemons;
// Rattatac.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Rattatac extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Rattatac() {
    this.num = 20;
    this.nom = "Rattatac";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 81;
    this.def = 60;
    this.vit = 97;
  }

  // Named:
  public Rattatac (String nom) {
    this.num = 20;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 55;
    this.att = 81;
    this.def = 60;
    this.vit = 97;
  }
}