package pokemons;
// Nidorina.java (TP8)
// David MELOCCO (TD2 / TPC)
  
public class Nidorina extends Pokemon {
  // Abstract method:
  public String getEspece() {
    return Type.espece[this.num - 1];
  }

// Constructors:
  // Default:
  public Nidorina() {
    this.num = 30;
    this.nom = "Nidorina";
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 70;
    this.att = 62;
    this.def = 67;
    this.vit = 56;
  }

  // Named:
  public Nidorina (String nom) {
    this.num = 30;
    this.nom = nom;
    this.type1 = Type.POISON;
    this.type2 = Type.SANS;
    this.pv = 70;
    this.att = 62;
    this.def = 67;
    this.vit = 56;
  }
}