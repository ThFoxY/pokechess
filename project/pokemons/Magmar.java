package pokemons;
// Magmar.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Magmar extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Magmar() {
    this.num = 126;
    this.nom = "Magmar";
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 95;
    this.def = 57;
    this.vit = 93;
  }

  // Named:
  public Magmar (String nom) {
    this.num = 126;
    this.nom = nom;
    this.type1 = Type.FEU;
    this.type2 = Type.SANS;
    this.pv = 65;
    this.att = 95;
    this.def = 57;
    this.vit = 93;
  }
}