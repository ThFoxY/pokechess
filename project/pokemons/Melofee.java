package pokemons;
// Melofee.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Melofee extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Melofee() {
    this.num = 35;
    this.nom = "Melofee";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 70;
    this.att = 45;
    this.def = 48;
    this.vit = 35;
  }

  // Named:
  public Melofee (String nom) {
    this.num = 35;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 70;
    this.att = 45;
    this.def = 48;
    this.vit = 35;
  }
}