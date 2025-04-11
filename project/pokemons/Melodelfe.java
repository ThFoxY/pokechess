package pokemons;
// Melodelfe.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Melodelfe extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Melodelfe() {
    this.num = 36;
    this.nom = "Melodelfe";
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 95;
    this.att = 70;
    this.def = 73;
    this.vit = 60;
  }

  // Named:
  public Melodelfe (String nom) {
    this.num = 36;
    this.nom = nom;
    this.type1 = Type.NORMAL;
    this.type2 = Type.SANS;
    this.pv = 95;
    this.att = 70;
    this.def = 73;
    this.vit = 60;
  }
}